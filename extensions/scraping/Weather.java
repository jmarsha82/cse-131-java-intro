package scraping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cse131.ArgsProcessor;

public class Weather {
	/**
	 * 
	 * @param wholeThing is the source control for the entire webpage
	 * @param finderOne and finderTwo are index holders to complete searches
	 * @param temperature holds the current temperature for the day
	 * @param pressure are the current pressure of the weather outside
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ArgsProcessor ap = new ArgsProcessor(args);
			
		String zip = ap.nextString("What zip code?");
		
		Document doc = Jsoup.connect("http://www.wunderground.com/cgi-bin/findweather/getForecast?query="+zip).get();
		String wholeThing = doc.toString();
		int finderOne = wholeThing.indexOf("curFeel");
		String temperature = wholeThing.substring(finderOne-98, finderOne-94);
		
		System.out.println("Temperature is " + temperature + " F");
		int finderTwo = wholeThing.indexOf("pressure");
		String pressure = wholeThing.substring(finderTwo+34, finderTwo+39);
		System.out.println("And the pressure is " + pressure + " in");

	}

}

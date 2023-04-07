package scraping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cse131.ArgsProcessor;

public class stockScraper {
/**
 * 
 * @param change displays whether the percent change was up or down
 * @param stockSym
 * @param wholeThing the entire source code for that page
 * @param startOne Two Three Four are storage locations of indexes
 * @param company the name of the company
 * @param currentPrice the current price of the stock
 * @param percentChange is the change in percent of the price over a day
 * @throws IOException
 */
		public static void main(String[] args) throws IOException {
			ArgsProcessor ap = new ArgsProcessor(args);
			String change = "";	
			String stockSym = ap.nextString("What is the stock symbol?");
			
			Document doc = Jsoup.connect("https://finance.yahoo.com/quote/"+ stockSym + "?p=" + stockSym).get();
			String wholeThing = doc.toString();
			
			int startOne = wholeThing.indexOf("Summary for");
			int startTwo = wholeThing.indexOf("- Yahoo Finance");
			String company = wholeThing.substring(startOne+12, startTwo);
			int startThree = wholeThing.indexOf("regularMarketPrice");
			String currentPrice = wholeThing.substring(startThree+44, startThree+48);
			int startFour = wholeThing.indexOf("FinanceConfigStore");
			String percentChange = wholeThing.substring(startFour-12, startFour-6);
			if(percentChange.substring(0,1).equals("-")){change = "down ";}
			else{change = "up ";}
			System.out.println("Stock information for " + company);
			System.out.println("The current stock price is $" + currentPrice + " which is " + change + percentChange + " from yesterday.");

		}

	}

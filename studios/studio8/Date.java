package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Date {
	private final String month;
	private final int day;
	private final int year;
	private boolean holiday;

	public Date(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = false;
	}


	@Override
	public String toString() {
		return ("The date is " + month + " " + day);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + year;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	public static void main(String[] args) {
		Date christmas = new Date("June",3,1996);
		Date Date = new Date("Oct",5,7);
		Date DateAlpha = new Date("Dec",19,7);
		Date DateBeta = new Date("July",12,48);
		Date DateCephla = new Date("June",3,1996);
		List<Date> list = new LinkedList<Date>();
		HashSet<Date> set = new HashSet<Date>();
		list.add(DateAlpha);
		list.add(DateBeta);
		list.add(DateAlpha);
		set.add(DateAlpha);
		set.add(DateBeta);
		set.add(DateAlpha);
		System.out.println(christmas);
		System.out.println(Date.equals(DateAlpha));
		System.out.println(christmas.equals(DateCephla));
		System.out.println(list);
		System.out.println(set);
	}

}

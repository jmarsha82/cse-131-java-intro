package studio8;

public class Time {
	private final int min, hour;
	private boolean twelve;
	public Time(int min, int hour) {
		
		this.min = min;
		this.hour = hour;
		if (hour > 12){
			this.twelve = false;
		}
		this.twelve = true;
	}

	@Override
	public String toString() {
		if(twelve){
			if(hour>12){
				return ("The time is " +(hour-12) + ":" + min);	
			}
			else return ("The time is " +hour + ":" + min);	
		}
		else return ("The time is " +hour + ":" + min);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
		result = prime * result + (twelve ? 1231 : 1237);
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		if (twelve != other.twelve)
			return false;
		return true;
	}
	
	public boolean isEarlierThan(Time other){
		return this.other;
	}

	public static void main(String[] args) {
		Time time = new Time(5,7);
		Time timeAlpha = new Time(19,7);
		Time timeBeta = new Time(12,48);
		Time timeCephla = new Time(7,12);
		System.out.println(time.equals(timeAlpha));
		System.out.println(time);
		System.out.println(timeAlpha);
		System.out.println(timeBeta);
		System.out.println(timeCephla);
	}

}

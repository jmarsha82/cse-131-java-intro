package studio8;

public class Appointment {
	private final Date date;
	private final Time time;
	private String cephla;

	public Appointment(Date date, Time time, String cephla) {
		this.date = date;
		this.time = time;
		this.cephla = cephla;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ("The appointment is on " + date + " at " + time + " "
				+ "with the " + cephla);
	}
	public static void main(String[] args) {
		Date DateAlpha = new Date("Dec",19,7);
		Time timeAlpha = new Time(19,7);
		Appointment doctor = new Appointment(DateAlpha,timeAlpha, "ass-doctor");
		System.out.println(doctor);
		Date DateBeta = new Date("Oct",20,7);
		Time timeBeta = new Time(15,7);
		Appointment shrink = new Appointment(DateBeta,timeBeta, "Marriage Cephla Professional");
		System.out.println(shrink);

	}

}

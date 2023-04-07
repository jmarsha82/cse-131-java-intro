package exercises8;

import java.util.HashSet;
import java.util.Set;

import studio8.Appointment;
import studio8.Date;
import studio8.Time;

public class Calendar {
	
	private final Appointment appointment;
	

	public Calendar(Appointment appointment) {
		this.appointment = appointment;
	}


	@Override
	public String toString() {
		return "Calendar [appointment= " + appointment + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointment == null) ? 0 : appointment.hashCode());
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
		Calendar other = (Calendar) obj;
		if (appointment == null) {
			if (other.appointment != null)
				return false;
		} else if (!appointment.equals(other.appointment))
			return false;
		return true;
	}


	public static void main(String[] args) {
		Set<Appointment> firstMonth = new HashSet<Appointment>();
		Date DateAlpha = new Date("Dec",19,7);
		Time timeAlpha = new Time(19,7);
		Appointment doctor = new Appointment(DateAlpha,timeAlpha, "ass-doctor");
		Date DateBeta = new Date("Oct",20,7);
		Time timeBeta = new Time(15,7);
		Appointment shrink = new Appointment(DateBeta,timeBeta, "Marriage Cephla Professional");
		firstMonth.add(doctor);
		firstMonth.add(shrink);
		System.out.println(firstMonth);

	}

}

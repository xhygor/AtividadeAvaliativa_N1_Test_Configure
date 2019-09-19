package business;

import org.joda.time.LocalDateTime;

public class HoraJodaBusiness {
	
	public String getHoraJoda() {
		LocalDateTime joda = new LocalDateTime();
		return joda.toString("HH:mm:ss.SSS");
	}
}

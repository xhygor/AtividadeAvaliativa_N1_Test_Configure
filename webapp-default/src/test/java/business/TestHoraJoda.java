package business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;


public class TestHoraJoda{

	@Test
	public void testHora() {
		HoraJodaBusiness horaBusiness = new HoraJodaBusiness();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		
		try {
			Date joda = sdf.parse(horaBusiness.getHoraJoda());
			Date javaUtil = sdf.parse(sdf.format(new Date()));
			
			assertEquals(joda.getTime(), javaUtil.getTime(), 100);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}

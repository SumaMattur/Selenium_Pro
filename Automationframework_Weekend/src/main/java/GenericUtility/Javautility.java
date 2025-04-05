package GenericUtility;

import java.time.LocalDateTime;

public class Javautility {

	/**
	 * It captures current system data and time and returns to caller
	 * @return 
	 * @return
	 */
	  public String.getSystemTime() {
		 return LocalDateTime.now().toString().replace(":", "-");
	  }
	

}


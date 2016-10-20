
package bhanu.learn;

import java.lang.System.*;

import javax.jws.WebService;

@WebService(targetNamespace = "http://learn.bhanu/", portName = "ReturnTimePort", serviceName = "ReturnTimeService")
public class ReturnTime {
	public long GetTime(){
		System.out.println("Current Time"+System.currentTimeMillis());
		return System.currentTimeMillis();
	}

}

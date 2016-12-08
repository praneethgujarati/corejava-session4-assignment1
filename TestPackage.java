/* Program to access a protected method of a class in different package. */

import package4_1_2.*; //import DispMsg class
public class TestPackage {
	public static void main(String[] args)
	{
		DispMsg dm = new DispMsg();	// Create an object and allocate memory using constructor.
		dm.getMsg();	// getMsg method is invoked to access private method inside DispMsg class. Browse DispMsg for more details.
	}
}

/* Output

C:\Users\Akhil Sharma\acadgild\java-rookie\src>javac -d "C:\Users\Akhil Sharma\acadgild\java-rookie\classes" DispMsg.java

C:\Users\Akhil Sharma\acadgild\java-rookie\src>javac -d "C:\Users\Akhil Sharma\acadgild\java-rookie\classes" TestPackage.java

C:\Users\Akhil Sharma\acadgild\java-rookie\src>java TestPackage
You've successfully tested protected method!

C:\Users\Akhil Sharma\acadgild\java-rookie\src>
*/
//Author: Akhil Sharma
package package4_1_2;	// defined package name
public class DispMsg {

	private void printMsg()	// printMsg is private and internal to this class.
	{
		System.out.println("You've successfully tested protected method!");
	}

	public void getMsg()
	{
		/* printMsg is private method. Called inside getMsg public method.
		   This can only be called inside the class and is protected from outside world.
		   For external world, if this method required, it's called via getMsg method. */
		printMsg();	
	}
}
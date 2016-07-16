package my.lib.connection;

public class Connection {
	
	Connection() { }

	public void activity()  {
		System.out.println("Connection #" + id + " does its things.");
	}
	
	private static int counter = 0;
	private int id = counter++;
}
package my.lib.connection;

public class ConnectionManager {
	
	private static Connection[] pool = new Connection[5];
	private static int counter = 0;
	
	static {
		for(int i = 0; i < pool.length; i++)
			pool[i] = new Connection();
	}
	
	public static Connection getConnection() {
		if(counter < pool.length)
			return pool[counter++];
		return null;
	}
}

import java.rmi.*;

public class HelloClient{
	private static final String host="localhost";
	
	public static void main(String[] a) throws Exception{
		try{
			Hello ref= (Hello)Naming.lookup("rmi://"+host+"/hello");
			System.out.println("msg ricevuto:"+ref.sayHello());
		}
		catch(ConnectException e){
			System.out.println("problemi di connessione a server");
		}
		catch(Exception exc){ exc.printStackTrace();}
	}
}
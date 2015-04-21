import java.rmi.*;

public class HelloServer{
	private static final String host="localhost";
	
	public static void main(String[] a)throws Exception{
		HelloImpl ref=new HelloImpl();
		String rmiObjName="rmi://"+host+"/hello";
		Naming.rebind(rmiObjName,ref);
		System.out.println("Server pronto");
	}
}
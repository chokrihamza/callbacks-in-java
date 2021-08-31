package callbacks;

interface Callback {
	void call(String string);
}

public class TestCallbacks {

	public static void main(String[] args) {
		Callback myCall;
		myCall=(element)->{System.out.println("Hello "+element);};
		sayhello("Jhon", myCall);
		
		
		
		
	}
	
	public static void  sayhello(String string, Callback function) {
		
		function.call(string);
		
	};
	
	
	
}

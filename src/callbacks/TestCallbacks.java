package callbacks;

import java.util.function.Consumer;

interface Callback {
	void call(String string);

}

public class TestCallbacks {

	public static void main(String[] args) {
		Callback myCall;
		myCall=(element)->{System.out.println("Hello "+element);};
		sayhello("Jhon", myCall);
		
		int []table=new int[]{0,10,20,32,42};
		
		map(table,(element)->{System.out.println("N°"+element);});
		
		
		
		
	}
	
	public static void map(int[] table,Consumer<Integer> function) {
		for (int i : table) {
			function.accept(i);;
		}
		
	}
	
	
	public static void  sayhello(String string, Callback function) {
		
		function.call(string);
		
	};
	
	
	
}

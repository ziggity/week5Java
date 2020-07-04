package week5;

public class AsteriskLogger implements Logger {
//	•	The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed 
	//in is “Hello”, then it should print ***Hello*** to the console.
	
//	•	The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. 
	//For example, if “Hello” is the argument, the following should be printed:
	
	@Override
	public void Log(String msg) {
		System.out.println("***" + msg + "***");
	}

	@Override
	public void Error(String msg) {
		String message = "";
		for(int i=0; i< msg.length()+13; i++) {
			message += "*";
		}
		System.out.println(message + "\n" + "***Error: " + msg + "***\n" + message);		

	}


}

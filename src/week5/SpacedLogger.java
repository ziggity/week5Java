package week5;


public class SpacedLogger implements Logger{
	@Override
	public void Log(String msg) {
		StringBuilder newMessage = new StringBuilder();
		for(int j=0; j<msg.length(); j++) {
			newMessage.append(msg.charAt(j) + " ") ;
					}
		System.out.println(newMessage.deleteCharAt(newMessage.length()-1).toString());
		}

	@Override
	public void Error(String msg) {
		StringBuilder newMessage = new StringBuilder();
		 newMessage.append("ERROR: "); 
		for(int j=0; j<msg.length(); j++) {
			newMessage.append(msg.charAt(j) + " ") ;
					}
		System.out.println(newMessage.deleteCharAt(newMessage.length()-1).toString());
		
	}
}

//•	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//•	If the log method received “Hello” as an argument, it should print H e l l o
//•	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
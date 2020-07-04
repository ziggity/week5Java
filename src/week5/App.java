package week5;

public class App {
	public static void main(String[] args) {
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		System.out.print("AsteriskLogger Log: ");
		AsteriskLogger.Log("Hello");
		System.out.println("Asterisklogger Error: ");
		AsteriskLogger.Error("Hello");
		System.out.print("SpacedLogger Log: ");
		SpacedLogger.Log("Hello");
		System.out.print("SpacedLogger Error: ");
		SpacedLogger.Error("Hello");

	}
}

//•	Create a class named App that has a main method.
//•	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//•	Test both methods on both instances, passing in Strings of your choice.
package polymorphismDemo;

public class FileLogger extends BaseLogger {
	public void log(String messege) {
		System.out.println("Logged to file : " + messege);

	}

}

package polymorphismDemo;

import java.lang.System.Logger;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		 * EmailLogger(), new DatabaseLogger(), new ConsoleLogger() }; for (BaseLogger
		 * logger : loggers) { logger.log("Log mesajı"); }
		 */
		/*
		 * EmailLogger logger = new EmailLogger(); logger.log("Log mesajı");
		 */

	}

}

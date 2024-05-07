package edu.mum.cs.cs525.labs.skeleton;

public class Application {
	public static void main(String[] args) {
		MyLogger logger = new LoggerAdapter();

		logger.log(LogLevel.INFO, "Info log...");
		logger.log(LogLevel.ERROR, "Error exists...");
	}

}



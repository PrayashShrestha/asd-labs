package edu.mum.cs.cs525.labs.skeleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerAdapter implements MyLogger{
    private final Logger logger = LogManager.getLogger(LoggerAdapter.class);

    @Override
    public void log(LogLevel logLevel, String message) {
        switch (logLevel) {
            case INFO:
                logger.info(message);
                break;
            case DEBUG:
                logger.debug(message);
                break;
            case WARNING:
                logger.warn(message);
                break;
            case TRACE:
                logger.trace(message);
                break;
            case ERROR:
                logger.error(message);
                break;
            case FATAL:
                logger.fatal(message);
                break;
            default:
                logger.error("log level not available: {}", logLevel);
        }
    }
}

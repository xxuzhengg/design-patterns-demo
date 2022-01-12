package behavioral.responsibility.test;

import behavioral.responsibility.impl.DebugLogger;
import behavioral.responsibility.impl.ErrorLogger;
import behavioral.responsibility.impl.InfoLogger;
import behavioral.responsibility.service.AbstractLogger;

/**
 * 创建不同类型的记录器。
 * 赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。
 * 每个记录器中的下一个记录器代表的是链的一部分。
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger infoLogger = new DebugLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new InfoLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an info information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

}

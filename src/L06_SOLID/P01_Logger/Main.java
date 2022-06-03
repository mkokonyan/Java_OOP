package L06_SOLID.P01_Logger;

import L06_SOLID.P01_Logger.enums.ReportLevel;
import L06_SOLID.P01_Logger.factories.LoggerFactory;
import L06_SOLID.P01_Logger.interfaces.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InputParser inputParser = new InputParser();
        Scanner scanner = new Scanner(System.in);

        LoggerFactory loggerFactory = new LoggerFactory();
        Logger logger = loggerFactory.produce(inputParser.readLoggerInfo(scanner));

        String input  = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\|");

            ReportLevel  reportLevel = ReportLevel.valueOf(tokens[0]);
            String time = tokens[1];
            String  message = tokens[2];

            switch (reportLevel) {
                case INFO: logger.logInfo(time, message); break;
                case WARNING: logger.logWarning(time, message); break;
                case ERROR: logger.logError(time, message); break;
                case CRITICAL: logger.logCritical(time, message); break;
                case FATAL: logger.logFatal(time, message); break;
            }

            input  = scanner.nextLine();
        }

        System.out.println(logger);

    }
}

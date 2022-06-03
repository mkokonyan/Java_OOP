package L06_SOLID.P01_Logger.factories;

import L06_SOLID.P01_Logger.enums.ReportLevel;
import L06_SOLID.P01_Logger.impl.appenders.ConsoleAppender;
import L06_SOLID.P01_Logger.impl.appenders.FileAppender;
import L06_SOLID.P01_Logger.interfaces.Appender;
import L06_SOLID.P01_Logger.interfaces.Factory;
import L06_SOLID.P01_Logger.interfaces.Layout;

public class AppenderFactory implements Factory<Appender> {
    private  LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String input) {
        String[] tokens = input.split("\\s+");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = layoutFactory.produce(layoutType);
        Appender appender = null;

        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        } else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout);
        }

        if (tokens.length >= 3) {
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}

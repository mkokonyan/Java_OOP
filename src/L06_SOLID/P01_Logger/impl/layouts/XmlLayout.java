package L06_SOLID.P01_Logger.impl.layouts;

import L06_SOLID.P01_Logger.enums.ReportLevel;
import L06_SOLID.P01_Logger.interfaces.Layout;

public class XmlLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format(
                        "<log>%n" +
                            "\t<date>%s</date>%n" +
                            "\t<level>%s</level>%n" +
                            "\t<message>%s</message>%n" +
                        "</log>%n", time, reportLevel, message);

    }
}

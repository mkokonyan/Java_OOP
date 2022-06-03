package L06_SOLID.P01_Logger.interfaces;

import L06_SOLID.P01_Logger.enums.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);
    void setReportLevel (ReportLevel reportLevel);

}

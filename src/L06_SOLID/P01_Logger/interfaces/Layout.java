package L06_SOLID.P01_Logger.interfaces;

import L06_SOLID.P01_Logger.enums.ReportLevel;

public interface Layout {
    String format(String time, String message, ReportLevel reportLevel);

}

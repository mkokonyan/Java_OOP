package L06_SOLID.P01_Logger.impl.appenders;

import L06_SOLID.P01_Logger.enums.ReportLevel;
import L06_SOLID.P01_Logger.interfaces.Appender;
import L06_SOLID.P01_Logger.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    private static final ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;

    Layout layout;
    private ReportLevel reportLevel;
    private int messagesCount;

    public BaseAppender(Layout layout) {
        this(layout, DEFAULT_REPORT_LEVEL);
        this.messagesCount = 0;
    }

    public BaseAppender(Layout layout, ReportLevel reportLevel) {
        this.layout = layout;
        this.reportLevel = reportLevel;
    }

    public boolean canAppend(ReportLevel reportLevel) {
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    public void increaseMessageCount() {
        this.messagesCount++;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level %s, Messages appended: %d",
                this.getClass().getSimpleName(),
                this.layout.getClass().getSimpleName(),
                this.reportLevel,
                this.messagesCount);
    }
}

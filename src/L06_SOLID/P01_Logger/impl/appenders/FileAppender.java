package L06_SOLID.P01_Logger.impl.appenders;

import L06_SOLID.P01_Logger.enums.ReportLevel;
import L06_SOLID.P01_Logger.interfaces.File;
import L06_SOLID.P01_Logger.interfaces.Layout;

public class FileAppender extends BaseAppender {
    private File file;


    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout, String fileName) {
        super(layout);
        this.file = new LogFile(fileName);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if (this.canAppend(reportLevel)) {
            String output = this.layout.format(time, message, reportLevel);
            increaseMessageCount();
            file.append(output);
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return  super.toString() + ", File size: " + this.file.getSize();
    }
}

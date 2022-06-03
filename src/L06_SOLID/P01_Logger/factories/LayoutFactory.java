package L06_SOLID.P01_Logger.factories;

import L06_SOLID.P01_Logger.impl.layouts.SimpleLayout;
import L06_SOLID.P01_Logger.impl.layouts.XmlLayout;
import L06_SOLID.P01_Logger.interfaces.Factory;
import L06_SOLID.P01_Logger.interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout produce(String input) {
        Layout layout = null;

        if (input.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        } else if (input.equals("XmlLayout")) {
            layout = new XmlLayout();
        }

        return  layout;
    }
}

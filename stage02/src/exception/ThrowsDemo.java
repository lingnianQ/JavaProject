package exception;

import java.awt.*;
import java.io.IOException;

public class ThrowsDemo {
    public void doSome() throws IOException, AWTException {
    }
}

class SubClass extends ThrowsDemo {
    @Override
    public void doSome() throws IOException, AWTException {
    }
}

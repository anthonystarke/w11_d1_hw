import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void printerPageCount(){
        assertEquals(100,printer.pageCount());
    }

    @Test
    public void printerPrint(){
        printer.print(5);
        assertEquals(95,printer.pageCount());
    }

    @Test
    public void refillPaper(){
        printer.refillPages();
        assertEquals(100,printer.pageCount());
    }

    @Test
    public void checkToner(){
        assertEquals(100,printer.tonerVolume());
    }

}

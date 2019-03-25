import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasWaterVolume(){
        assertEquals(100,waterBottle.getWaterVolume());
    }

    @Test
    public void haveDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getWaterVolume());
    }

    @Test
    public void emptyBottle(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getWaterVolume());
    }

    @Test
    public void refillBottle(){
        waterBottle.fill();
        assertEquals(100, waterBottle.getWaterVolume());
    }

}

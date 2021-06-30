package Test;

import PlayingTask.Model;
import PlayingTask.GlobalConstants;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestModel {
    private static Model model;

    @BeforeClass
    public static void runT() {
        model = new Model();
    }

    @Test
    public void testGetMinValue() {
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        Assert.assertEquals(GlobalConstants.PRIMARY_MIN_BARRIER, model.getMinValue());
    }

    @Test
    public void testGetMaxValue() {
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
        Assert.assertEquals(GlobalConstants.PRIMARY_MAX_BARRIER, model.getMaxValue());
    }

    @Test
    public void testInitRandNumber() {
        model.initRandNumber();
        Assert.assertTrue(model.getRandNumber() >= model.getMinValue() ||
                model.getRandNumber() <= model.getMaxValue());
    }

    @Test
    public void testSetValue() {
        model.setValue(5);
        Assert.assertEquals(5, model.getValue());
        Assert.assertEquals(5, (int) model.getValues().get(model.getValues().size() - 1));
    }

    @Test
    public void testSetPrimaryBarrier() {
        model.setPrimaryBarrier(0, 100);
        Assert.assertEquals(0, model.getMinValue());
        Assert.assertEquals(100, model.getMaxValue());
    }

    @Test
    public void testIsGuessed() {
        model.initRandNumber();
        model.setValue(model.getRandNumber());
        Assert.assertTrue(model.isGuessed());
        model.setValue(model.getRandNumber() + 1);
        Assert.assertFalse(model.isGuessed());
    }

    @Test
    public void testIsNeededGreater() {
        model.initRandNumber();
        model.setValue(model.getRandNumber() - 1);
        Assert.assertTrue(model.isNeededGreater());
        model.setValue(model.getRandNumber() + 1);
        Assert.assertFalse(model.isNeededGreater());
    }
}

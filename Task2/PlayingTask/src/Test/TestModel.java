package Test;

import PlayingTask.Model;
import org.junit.Assert;
import org.junit.Test;

public class TestModel {
    @Test
    public void testSetValue(){
        Model model = new Model();
        model.setValue(5);
        Assert.assertEquals(5, model.getValue());
        Integer[] expected = {5};
        Assert.assertArrayEquals(expected, model.getValues().toArray());
    }

    @Test
    public void testGetMinValue(){
        Model model = new Model();
        Assert.assertEquals(0, model.getMinValue());
    }

    @Test
    public void testGetMaxValue(){
        Model model = new Model();
        Assert.assertEquals(10, model.getMaxValue());
    }

    @Test
    public void testInitRandNumber(){
        Model model = new Model();
        model.initRandNumber();
        Assert.assertTrue(model.getRandNumber() >= model.getMinValue() ||
                model.getRandNumber() <= model.getMaxValue());
    }

    @Test
    public void testIsGuessed(){
        Model model = new Model();
        model.initRandNumber();
        model.setValue(model.getRandNumber());
        Assert.assertTrue(model.isGuessed());
        model.setValue(model.getRandNumber() + 1);
        Assert.assertFalse(model.isGuessed());
    }

    @Test
    public void testIsNeededGreater(){
        Model model = new Model();
        model.initRandNumber();
        model.setValue(model.getRandNumber() - 1);
        Assert.assertTrue(model.isNeededGreater());
        model.setValue(model.getRandNumber() + 1);
        Assert.assertFalse(model.isNeededGreater());
    }
}

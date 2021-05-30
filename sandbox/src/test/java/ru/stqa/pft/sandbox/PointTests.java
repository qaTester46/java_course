package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test(priority = 1)
    public void testPointsNumberOne(){
        Point p1 = new Point(2, 3);
        Point p2 = new Point(1, 2);
        Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
    }

    @Test(priority = 2)
    public void testPointsNumberTwo(){
        Point p1 = new Point(4, 4);
        Point p2 = new Point(2, 3);
        Assert.assertEquals(p1.distance(p2), 2.23606797749979);
    }

    @Test(priority = 3)
    public void testPointsNumberThree(){
        Point p1 = new Point(3, 3);
        Point p2 = new Point(1, 3);
        Assert.assertEquals(p1.distance(p2), 2.0);
    }
}

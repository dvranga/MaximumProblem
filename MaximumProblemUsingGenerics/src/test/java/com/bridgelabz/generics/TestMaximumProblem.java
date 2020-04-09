package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

import java.applet.Applet;

public class TestMaximumProblem {
    @Test
    public void givenIntegerNumbers_MaxAtFirstPlace_ShouldReturnMaximumValue() {
        Assert.assertSame(123,MaximumProblem.testMaximum(123,122,121));
    }
    @Test
    public void givenIntegerNumbers_MaxAtSecondPlace_ShouldReturnMaximumValue() {
        Assert.assertSame(123,MaximumProblem.testMaximum(122,123,121));
    }
    @Test
    public void givenIntegerNumbers_MaxAtThirdPlace_ShouldReturnMaximumValue() {
        Assert.assertSame(123,MaximumProblem.testMaximum(122,121,123));
    }
    @Test
    public void givenFloatNumbers_MaxAtFirstPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(122.123f,123.123f,121.121f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtSecondPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(122.123f,123.123f,121.121f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtThirdPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(121.123f,122.122f,123.123f),0.0);
    }
    @Test
    public void givenStringValue_MaxAtSecondPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals("Peach",MaximumProblem.testMaximum( "Apple","Peach","Banana"));
    }
    @Test
    public void givenStringValue_MaxAtFirstPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals("Peach",MaximumProblem.testMaximum( "Apple","Peach","Banana"));
    }
    @Test
    public void givenStringValue_MaxAThirdPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals("Peach",MaximumProblem.testMaximum( "Apple","Banana","Peach"));
    }
    @Test
    public void givenIntegerObject_MaxAtFirstPlace_ShouldReturnMaximumValue() {
        Assert.assertSame(123,new MaximumProblem(123,122,121).testMaximum());
    }
    @Test
    public void givenFloatObject_MaxAtFirstPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals(123.123f,new MaximumProblem<Float>(122.123f,123.123f,121.121f).testMaximum(),0.0);
    }
    @Test
    public void givenStringObject_MaxAtSecondPlace_ShouldReturnMaximumValue() {
        Assert.assertEquals("Peach",new MaximumProblem<String>( "Apple","Peach","Banana").testMaximum());
    }
    @Test
    public void givenIntegerNumbers_MaxAtFirstPlace_ShouldReturnMaximumValue1() {
        Assert.assertSame(123,MaximumProblem.testMaximum(123,122));
    }
    @Test
    public void givenIntegerNumbers_MaxAtSecondPlace_ShouldReturnMaximumValue2() {
        Assert.assertSame(123,MaximumProblem.testMaximum(122,123,121,100));
    }
    @Test
    public void givenIntegerNumbers_MaxAtThirdPlace_ShouldReturnMaximumValue3() {
        Assert.assertSame(123,MaximumProblem.testMaximum(123));
    }
    @Test
    public void givenFloatNumbers_MaxAtFirstPlace_ShouldReturnMaximumValue1() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(122.123f,123.123f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtSecondPlace_ShouldReturnMaximumValue2() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(122.123f,123.123f,121.121f,0.0f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtThirdPlace_ShouldReturnMaximumValue3() {
        Assert.assertEquals(121.123f,MaximumProblem.testMaximum(121.123f),0.0);
    }
    @Test
    public void givenStringValue_MaxAtSecondPlace_ShouldReturnMaximumValue1() {
        Assert.assertEquals("Apple",MaximumProblem.testMaximum( "Apple"));
    }
    @Test
    public void givenStringValue_MaxAtFirstPlace_ShouldReturnMaximumValue2() {
        Assert.assertEquals("Peach",MaximumProblem.testMaximum( "Apple","Peach"));
    }
    @Test
    public void givenStringValue_MaxAThirdPlace_ShouldReturnMaximumValue3() {
        Assert.assertEquals("orange",MaximumProblem.testMaximum( "Apple","Banana","Peach","orange"));
    }
}

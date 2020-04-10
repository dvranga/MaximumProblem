package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

import java.applet.Applet;

public class TestMaximumProblem {

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
    public void givenIntegerNumbers_MaxAtSecondPlaceAsDynamicParameters_ShouldReturnMaximumValue() {
        Assert.assertSame(123,MaximumProblem.testMaximum(122,123,121,100));
    }
    @Test
    public void givenIntegerNumbers_MaxAtThirdPlaceAsDynamicParameters_ShouldReturnMaximumValue3() {
        Assert.assertSame(123,MaximumProblem.testMaximum(1,2,123,4));
    }
    @Test
    public void givenFloatNumbers_MaxAtFirstPlaceAsDynamicParameters_ShouldReturnMaximumValue() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(123.123f,122.123f,1.0f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtSecondPlaceAsDynamicParameters_ShouldReturnMaximumValue() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(122.123f,123.123f,121.121f,1.1f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtFourthPlaceAsDynamicParameters_ShouldReturnMaximumValue() {
        Assert.assertEquals(121.123f,MaximumProblem.testMaximum(1.22f,2.22f,3.33f,121.123f),0.0);
    }

    @Test
    public void givenStringValue_MaxAtFourthPlaceAsDynamicParameters_ShouldReturnMaximumValue3() {
        Assert.assertEquals("orange",MaximumProblem.testMaximum( "Apple","Banana","Peach","orange"));
    }
    @Test
    public void givenIntegerNumbers_AsDynamicParameters_ShouldReturnMaximumValue1() {
        Assert.assertSame(123,MaximumProblem.testMaximum(123,122,1,2,3,4,5,6,7));
    }
    @Test
    public void givenIntegerNumbers_MaxAtSecondPlaceAsDynamicParameters_ShouldReturnMaximumValue2() {
        Assert.assertEquals(1000,MaximumProblem.testMaximum(122,123,121,100,500,58,41,485,565,1000),0.0);
    }
    @Test
    public void givenIntegerNumbers_MaxAtThirdPlaceAsDynamicParameters_ShouldReturnMaximumValue4() {
        Assert.assertEquals( 100000, MaximumProblem.testMaximum( 1, 2, 123, 10000, 10055, 15155, 155, 100000 ),0.0 );
    }
    @Test
    public void givenFloatNumbers_MaxAtFirstPlaceAsDynamicParameters_ShouldReturnMaximumValue1() {
        Assert.assertEquals(123.123f,MaximumProblem.testMaximum(123.123f,122.123f,12.12f,102.12f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtSecondPlaceAsDynamicParameters_ShouldReturnMaximumValue2() {
        Assert.assertEquals(12345.12345f,MaximumProblem.testMaximum(122.123f,123.123f,121.121f,0.0f,12.02f,1.1f,12345.12345f),0.0);
    }
    @Test
    public void givenFloatNumbers_MaxAtFourthPlaceAsDynamicParameters_ShouldReturnMaximumValue3() {
        Assert.assertEquals(121.123f,MaximumProblem.testMaximum(1.22f,2.22f,3.33f,121.123f,1.2f),0.0);
    }

    @Test
    public void givenStringValue_MaxAtSecondPlaceAsDynamicParameters_ShouldReturnMaximumValue2() {
        Assert.assertEquals("Peach",MaximumProblem.testMaximum( "Apple","Peach","A","B"));
    }
    @Test
    public void givenStringValue_MaxAtFourthPlaceAsDynamicParameters_ShouldReturnMaximumValue4() {
        Assert.assertEquals("orange",MaximumProblem.testMaximum( "Apple","Banana","Peach","orange","A"));
    }
}

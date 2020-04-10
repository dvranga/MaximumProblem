package com.bridgelabz.generics;

import java.util.Arrays;

public class MaximumProblem<E extends Comparable <E> > {
   E firstValue;
   E secondValue;
   E thirdValue;
    public MaximumProblem(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public  E testMaximum(){
        return  testMaximum( firstValue,secondValue,thirdValue );
    }

    public static <E extends Comparable <E> > E testMaximum(E firstValue, E secondValue, E thirdValue) {
        E max=firstValue;
        if(secondValue.compareTo( max )>0 ){
            max=secondValue;
        }
        if (thirdValue.compareTo( max )>0){
            max=thirdValue;
        }
        printMax(firstValue,secondValue,thirdValue,max);
        return max;
    }

    private static <E extends Comparable <E> > void printMax(E firstValue, E secondValue, E thirdValue, E max) {
        System.out.println("firstValue is "+firstValue+" secondValue"+secondValue+" thirdValue is "+thirdValue);
        System.out.println("maximum value is = "+max);
    }
    public static <E extends Comparable <E> > E testMaximum(E ... parameters) {
       Arrays.sort( parameters );
       printMax( parameters[parameters.length-1],parameters );
       return parameters[parameters.length-1];
    }

    private static <E extends Comparable <E>> void printMax(E max, E[] parameters) {
        for (E elements: parameters) {
            System.out.println(elements);
        }
        System.out.println("maximum value is "+max);

    }
}

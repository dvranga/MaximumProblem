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

    public static <E extends Comparable <E> > E testMaximum(E firstValue, E secondValue, E thirdValue,E ... parameters) {
        E max=firstValue;
        if(secondValue.compareTo( max )>0 ){
            max=secondValue;
        }
        if (thirdValue.compareTo( max )>0){
            max=thirdValue;
        }
        if(parameters.length!=0)
        {
            max=checkMaxOfAllValue(max,parameters);
        }
        printMax( firstValue,secondValue,thirdValue,max,parameters );
       return max;
    }

    private static <E extends Comparable <E>> E checkMaxOfAllValue(E max, E[] parameters) {
        for (E value : parameters) {
            if(value.compareTo( max )>0) {
                max=value;
            }
        }
        return max;
    }

    private static <E extends Comparable <E> > void printMax(E firstValue, E secondValue, E thirdValue, E max,E ... parameters) {
        System.out.println("firstValue is "+firstValue+" secondValue"+secondValue+" thirdValue is "+thirdValue);
        for (E values:parameters) {
            System.out.println(values);
            System.out.println();
        }
        System.out.println("maximum value is = "+max);
    }


}

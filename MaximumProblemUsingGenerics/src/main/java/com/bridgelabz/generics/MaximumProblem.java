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
    public static <E extends Comparable <E> > E testMaximum(E ... param) {
       E temp;
       E max=param[0];
       /*for(int i=0;i<param.length-1;i++)
       {
           if(param[i].compareTo( param[i+1] )>0)
           {
               temp=param[i];
               param[i]=param[i+1];
               param[i+1]=temp;
           }
       }*/
       Arrays.sort( param );
       printMax( param[param.length-1],param );
       return param[param.length-1];

    }

    private static <E extends Comparable <E>> void printMax(E max, E[] param) {

        for (E elements: param) {
            System.out.println(elements);
        }
        System.out.println("maximum value is "+max);

    }


}

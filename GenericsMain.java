package com.generics;
import java.util.Arrays;

public class GenericsMain <T extends Comparable<T>> {
    T[] inputArray;

    public GenericsMain(T[] inputArray){
        this.inputArray=inputArray;

    }

    public void largest()  {
        for(int i=0; i<inputArray.length-1;i++){
            if(inputArray[i].compareTo(inputArray[i+1])>0){
                inputArray[i+1] = inputArray[i];
            }
        }

    }

    public void toPrint(){
        System.out.println(inputArray[inputArray.length - 1]);
    }
    public void toSort(){

        for(int i=0; i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
        Arrays.sort(inputArray);
        System.out.println("After sorting");
        for(int i=0; i<inputArray.length;i++) {
            System.out.println(inputArray[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("**************");
        Integer[] I = {56, 30, 70, 123, 43};
        System.out.println("**************");
        String[] S = {"Shubom", "Supali", "Jyoti", "Smriti","Mishon"};
        Float[] F = {0.56f, 000000.30f, 7.340f, 0000.01f};
        System.out.println("*******Array Sorting*******");
        new GenericsMain(I).toSort();
        new GenericsMain(S).toSort();
        new GenericsMain(F).toSort();
        System.out.println("*******Finding Maximum*******");
        new GenericsMain(I).toPrint();
        new GenericsMain(S).toPrint();
        new GenericsMain(F).toPrint();
    }

}



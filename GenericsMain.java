package com.generics;

public class GenericsMain {
    public static void main(String[] args) {
        System.out.println("welcome to basics of generics");
        int[] a = {5, 8, 6};
        toSort(a);
    }

    private static void toSort(int[] a) {
        int max=0;
        int secondMax=0;
        int thirdMax=0;
        System.out.println("Integers before sorting" + a);
        for(int i:a){
            if(max<i){
                thirdMax=secondMax;
                secondMax=max;
                max=i;
            } else if (secondMax<i) {
                thirdMax=secondMax;
                secondMax=i;
            } else {
                thirdMax=i;
            }
        }
        System.out.println("Max integer is: " + max);
        System.out.println("Second max integer is: " + secondMax);
        System.out.println("Third max integer is: " + thirdMax);
    }
}

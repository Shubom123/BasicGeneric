package com.generics;

public class GenericsMain {
    public static void main(String[] args) {
        System.out.println("welcome to basics of generics");
        int[] a = {5, 8, 6};
        float[] b = {(float) 3.8, (float) 2.3, (float) 4.3};
        String[] c = {"Shubom", "Anil", "Sumit"};
        toSort(a);
        toSort(b);
        toSort(c);
    }

    private static void toSort(String[] c) {
        String max = " ";
        String secondMax = " ";
        String thirdMax = " ";
        System.out.println("Float number after sorting");
        for(String i:c){

            if(max.length() < i.length()){
                thirdMax=secondMax;
                secondMax=max;
                max=i;
            } else if (secondMax.length() < i.length()) {
                thirdMax=secondMax;
                secondMax=i;
            } else {
                thirdMax=i;
            }
        }
        System.out.println("Max float number is: " + max);
        System.out.println("Second max float number is: " + secondMax);
        System.out.println("Third max float number is: " + thirdMax);
    }

    private static void toSort(float[] b) {
        float max=0;
        float secondMax=0;
        float thirdMax=0;
        System.out.println("Float number after sorting");
        for(float i:b){
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
        System.out.println("Max float number is: " + max);
        System.out.println("Second max float number is: " + secondMax);
        System.out.println("Third max float number is: " + thirdMax);
    }

    private static void toSort(int[] a) {
        int max=0;
        int secondMax=0;
        int thirdMax=0;
        System.out.println("Integers after sorting");
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

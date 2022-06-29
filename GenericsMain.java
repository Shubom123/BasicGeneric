package com.generics;

public class GenericsMain <T extends Comparable<T>> {
    T x, y, z;

    public GenericsMain(T x,T y,T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public T largest()  {

        if (y.compareTo(x) > 0) {
            return y;
        }
        if (z.compareTo(y) > 0) {
            return z;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        GenericsMain compareInt = new GenericsMain(11, 18, 200);
        System.out.println("Maximum number out of three integers is: " + compareInt.largest());
        GenericsMain compareFloat = new GenericsMain(4.3f, 0.75f, 88f);
        System.out.println("Maximum number out of three float is: " + compareFloat.largest());
        GenericsMain compareStr = new GenericsMain("Shubom", "Anil", "Sumit");
        System.out.println("Maximum among three string is: " + compareStr.largest());
    }

}



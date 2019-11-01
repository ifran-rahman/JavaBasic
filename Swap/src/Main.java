package com.company;

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        T t=new T();

        swap(t);
        System.out.println("e1:"+t.e1+"\ne2:"+t.e2);

    }

    private static void swap(T t) {
        int temp=t.e1;
        t.e1=t.e2;
        t.e2=temp;

    }
}




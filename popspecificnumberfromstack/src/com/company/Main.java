package com.company;

//pop index 4 from mystack1

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        mystack1.push('a');
        mystack1.push('b');
        mystack1.push('c');
        mystack1.push('d');
        mystack1.push('e');
        mystack1.push('f');
        mystack1.push('g');
        mystack1.push('h');
        mystack1.push('i');
        mystack1.push('j');

        System.out.println(mystack1);
        for (int i = 0; i < 10; i++) {

            if (i != 5) {
                mystack2.push(mystack1.pop());
            } else {
                mystack1.pop();
            }
        }

        for (int i = 0; i < 9; i++) {
            mystack1.push(mystack2.pop());
        }
        System.out.println(mystack1);



    }
}


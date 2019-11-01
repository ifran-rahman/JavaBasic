package com.company;

public class Stack {
    int max=9;
    char arr[] = new char[9];
    int top;

    Stack() {

        top = -1;
    }

    void push(char x)
    {
        if(top==9)
        {
            System.out.println("stack overflow");
        }else
        {
            arr[++top]=x;
        }
    }

    char pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }else
        {

            return arr[top--];

        }
    }


}

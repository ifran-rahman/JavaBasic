class Stack{
    int stck[] = new int[10];
    int tos;

    Stack()
    {
        tos = -1;
    }

    void push(int item)
    {
        if(tos==9)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            stck[++tos] = item;
        }
    }

    int pop()
    {
        if(tos<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            return stck[tos--];
        }
    }
    void printo()
    {
        for(int i=0;i<10;i++){
            System.out.println(stck[i]);

        }
    }

}
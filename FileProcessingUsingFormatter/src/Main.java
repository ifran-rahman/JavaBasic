
import java.util.*;
import java.io.*;

class CreatingFile{
    Formatter x;
    public void create(){
        try{
            x =new Formatter("C:\\Users\\Ifran\\Desktop\\fuk.txt");

        }catch (Exception e)
        {
            System.out.println("fukfuk");
        }
    }

    public void write() {
        int m,sum;
        for( int i=1;i<5;i++)
        {
            m=i;
            sum=i;
            for (int j=1;j<4;j++)
            {
                sum=sum*m;
            }
            x.format(" "+sum);
        }

    }

    public void close() {
        x.close();
    }
}

public class Main{

    public static void main(String args[]) {
        CreatingFile c = new CreatingFile();
        c.create();
        c.write();
        c.close();
    }
}

package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        plant p[]=new plant[10];
        p[1].setName("fagol");
        p[2].setName("sagol");
        p[1].setColor("lal");
        p[2].setColor("nil");

    }


    static void add(plant[] p,plant q)
    {
        q.setName("valo");
        q.setColor("shada");

        ArrayList<plant> temp = new ArrayList<plant>(Arrays.asList(p));
        temp.add(q);
        System.out.println(temp);


    }

}

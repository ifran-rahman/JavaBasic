package basic;

public class Main {

    public static void main(String[] args) {

        vehicle v[]=new  vehicle[3];


        v[0]=new bike();
        v[1]=new car();
        v[2]=new tomtom();

        for(int i=0; i<3; i++)
        {
            v[i].show();
        }

    }
}

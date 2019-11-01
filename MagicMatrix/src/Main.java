import java.util.Scanner;

public class Main {
    static void forEven(int g)
    {
        int[][] array = new int[g][g];
        int i, j;

        for ( i = 0; i < g; i++)
            for ( j = 0; j < g; j++)
                array[i][j] = (g*i) + j + 1;


        for ( i = 0; i < g/4; i++)
            for ( j = 0; j < g/4; j++)
                array[i][j] = (g*g + 1) - array[i][j];


        for ( i = 0; i < g/4; i++)
            for ( j = 3 * (g/4); j < g; j++)
                array[i][j] = (g*g + 1) - array[i][j];


        for ( i = 3 * g/4; i < g; i++)
            for ( j = 0; j < g/4; j++)
                array[i][j] = (g*g+1) - array[i][j];

        // Bottom Right corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 3 * g/4; i < g; i++)
            for ( j = 3 * g/4; j < g; j++)
                array[i][j] = (g*g + 1) - array[i][j];

        // Centre of Matrix (order (n/2)*(n/2))
        for ( i = g/4; i < 3 * g/4; i++)
            for ( j = g/4; j < 3 * g/4; j++)
                array[i][j] = (g*g + 1) - array[i][j];

        // Printing the magic-square
        for (i = 0; i < g; i++)
        {
            for ( j = 0; j < g; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }

    static void forOdd(int n)
    {
        int[][] array = new int[n][n];

        int i = n/2;
        int j = n-1;

        for (int num=1; num <= n*n; )
        {
            if (i==-1 && j==n)
            {
                j = n-2;
                i = 0;
            }
            else
            {

                if (j == n)
                    j = 0;


                if (i < 0)
                    i=n-1;
            }

            if (array[i][j] != 0)
            {
                j -= 2;
                i++;
                continue;
            }
            else
                array[i][j] = num++;

            j++;  i--;
        }

        System.out.println("The Magic Square for "+n+":");
        System.out.println("Sum of each row or column "+n*(n*n+1)/2+":");
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            forEven(num);
        }else {
            forOdd(num);
        }

    }
}

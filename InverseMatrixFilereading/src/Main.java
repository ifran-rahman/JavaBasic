
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    static int N = 3;

    public static void main(String[] args) throws FileNotFoundException {
        float determinant=0;
        int i,j;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];

        Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Ifran\\Desktop\\myfile.txt")));
        int rows = 3;
        int columns = 3;

        while (sc.hasNextLine()) {
            for (i = 0; i < a.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (j = 0; j < line.length; j++) {
                    b[i][j] = Integer.parseInt(line[j]);
                }
            }
        }


        for(i=0;i<3;i++){
            System.out.printf("\n");
            for(j=0;j<3;j++)
            {
                a[i][j]=b[j][i];
            }

        }

        for(i=0;i<3;i++)
            determinant = determinant + (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3]));

        System.out.printf("\nInverse of matrix is: \n\n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.printf("%.2f\t",((a[(i+1)%3][(j+1)%3] * a[(i+2)%3][(j+2)%3]) - (a[(i+1)%3][(j+2)%3]*a[(i+2)%3][(j+1)%3]))/ determinant);
            System.out.printf("\n");
        }
    }


}
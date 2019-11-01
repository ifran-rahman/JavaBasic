package com.company;

import static java.lang.Math.max;

import java.lang.*;

public class Main {
    public static int N = 6, M = 6;

    // Function to calculate max path in matrix
    static int findMax(int mat[][])
    {
        // To find max val in first row
        int res =0;//= -1;
        for (int i = 0; i < M; i++)
         //   res = max(res, mat[0][i]);
            res=mat[0][i];
        for (int i = 1; i < N; i++)
        {
            res = -1;
            for (int j = 0; j < M; j++)
            {
                // When all paths are possible
                if (j > 0 && j < M - 1)
                    mat[i][j] += max(mat[i - 1][j],
                            max(mat[i - 1][j - 1],
                                    mat[i - 1][j + 1]));

                    // When diagonal right is not possible
                else if (j > 0)
                    mat[i][j] += max(mat[i - 1][j],
                            mat[i - 1][j - 1]);

                    // When diagonal left is not possible
                else if (j < M - 1)
                    mat[i][j] += max(mat[i - 1][j],
                            mat[i - 1][j + 1]);

                // Store max path sum
                res = max(mat[i][j], res);
            }
        }
        return res;
    }

    // driver program
    public static void main (String[] args)
    {
        int mat[][] = { { 1,5,1,5,1,5},
                {3,3,2,3,3,4 },
                { 2,3,4,4,3,2},
                {2,2,3,2,2,4},
                {2,2,4,3,4,2},
                {4,4,4,4,2,3}
        };

        System.out.println(findMax(mat));
    }
}

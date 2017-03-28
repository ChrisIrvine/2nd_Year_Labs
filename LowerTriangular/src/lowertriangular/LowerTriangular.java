/*
 * Program to look at the run time analysis for an algorithm that determines if 
 * an input matrix is lower traingular or not. 
 */
package lowertriangular;

/**
 *
 * @author Christopher Irvine
 */

import java.util.Scanner;

public class LowerTriangular 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the size of the Matrix (H & L):");
        
        int n = scan.nextInt();
        
        int [][] matrix = new int[n][n];
        
        for (int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3 ; col++)
            {
                System.out.println("Enter the elements for the Matrix");
                matrix[row][col] = scan.nextInt();
            }
        }
        
        for (int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
        
        int p = 0;
                
        for(int row = 0; row < 3; row++)
        {
            for(int col = row+1; col < 3; col++)
            {
                if(matrix[row][col] != 0)
                {
                    p=1;
                    break;
                }
            }
        }
        
        if(p == 0)
        {
            System.out.println("The matrix is Lower Traingular");
        }
        else
        {
            System.out.println("The matrix is not Lower Traingular");
        }
        
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                
            }
        }
    }
}
    
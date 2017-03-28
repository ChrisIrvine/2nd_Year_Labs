/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineartimealgorithm;

/**
 *
 * @author Christopher Irvine
 */
public class LinearTimeAlgorithm 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final long LIMIT = 1000000000; //10^9 = number of nanosecs in 1 sec
        
        long startTime = System.nanoTime();
        long counter = 0;
        
        
        for (int m = 4; m <= 20; m++) //for loop to dictate array size
            {
                int n = (int) Math.pow(2, m);
                int[] array = new int[n]; //create array of size m (4, 5, ... , 20)
                array[0] = n; //the first and last elements of the array are the same
                array[n-1] = n;
                
                /*for loop to fill the remainder of the array with elements less
                  than the previous element.
                 */
             
                for (int i = 1; i < m-1; i++)
                {
                    array[i] = n-1;
                }
                
                do
                {
                    counter++;
                    containsLocalMinimum(array);
                } while(System.nanoTime() - startTime < LIMIT);
                long elapsedTime = System.nanoTime() - startTime;
                double timePerSearch = (double) elapsedTime/counter;
                System.out.printf("%5d\t%10d\t%10d\t%10.0f\n", n, counter, 
                        elapsedTime, timePerSearch);
        }
    }
    
    private static boolean containsLocalMinimum(int[] array)
    {
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] <= array[i-1] && array[i] >= array[i+1]) 
            {
                return true;
            }
        }
        
        return false;
    }
    
}

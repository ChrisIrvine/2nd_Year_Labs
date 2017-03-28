/*
 * Class to extend HashTable
 */
package hashing;
import java.util.Scanner;

/**
 *
 * @author ruw12gbu
 */
public class OpenAddressingHashTable extends HashTable
{
    Scanner scan = new Scanner(System.in);
    
    /*
     * Mutator method to set the capactiy of the Hash Table
     */
    public void setCapacity()
    {
        int capacity = scan.nextInt();
        
        System.out.println("Capacity now set to " + capacity);
    }
    /*
     * Override methods for the abstract method HashTable  
     */
    @Override
    boolean add(Object obj) 
    {
        for (int i = 0; i < capacity; i++) 
        {
            while ()
            {
                
            }
        }
    }

    @Override
    boolean contains(Object obj) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean remove(Object obj) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Object[] hashElements = new Object[capacity];
}

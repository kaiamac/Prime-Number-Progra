/*
 * Kaia Mac
 * Find out if it a prie number
 * december 7th, 2018
 */

package primenumprogram;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class PrimeNumProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        int userNum;
        int temp;
        boolean isPrime=true;
        
        
        System.out.print("Enter any number: ");
        userNum = keyedInput.nextInt();
        
        for(int i = 2; i <= userNum / 2; i = i + 1)
        {
            temp = userNum % i;
            
            if(temp==0)
            {
                isPrime = false;
                break;
            }
        }    
        
        if(isPrime)
            {System.out.println(userNum + " is a prime numer.");}
        else
            {System.out.println(userNum + " is not a prime number.");}
    }
    
}

// IT21810664
// Perera K C G S

import java.util.Scanner;                               // Scanner library
import java.util.Random;                                // Random function library


// define and implement class Lottery

public class Lottery{
    
    int [] lotteryNumbers = new int[5];        // declare lotteryNumbers array
    
    
    // constructor of class class Lottery
    public Lottery(){
        
            
            Random r1 = new Random();                    // create Random type object
            int i, r;
            
            for( i = 0; i < 5; i++ )                     // assigning random values using for loop
            {
                lotteryNumbers[i] = r1.nextInt(10);
            }
            
        
        
    }                                                   // end of the Lottery constructor
    
    
    public int compareLottery(int [] lotteryNumbers ){  // declaration and implementation of compareLottery function
        
        int i, r;
        int count = 0;
        
        
        
        

        
        
        
        
        
        // According to the sample output image given in the question, below nested loop shuold be used to compare the numbers and get the output which is shown in the sample output image.
        
        for( i = 0; i < 5; i++ )
        {
            for(r = 0; r < 5; r++ )
            {
                if(this.lotteryNumbers[i] == lotteryNumbers[r] ) // Checking the condition
                {
                    count++;                            // count the matching numbers
                    
                    this.lotteryNumbers[i] = -1;
                    lotteryNumbers[r] = -2;
                    break;
                }
                
            }
        }
        
        
        
        
        return count;
    }
    
    
    
    // start of the main function
    public static void main( String[] args ){
        
        Lottery L1 = new Lottery();                     // create a Lottery type object
        
        int [] numArr = new int[5];                     // declare an array a size of 5
        int i, r;
        int cnt;                                        // Variable to catch the matching count;
        
        Scanner myScanner = new Scanner(System.in);     // creating the Scanner type object 
        
        
        // using for loop to get user inputs
        for( i = 0; i < 5; i++ )
        {
            System.out.print( "Enter the number " + (i+1) + " : " );
            numArr[i] = myScanner.nextInt();
            
        }
        
        System.out.println();
        
        
        
        System.out.println("Lottery Values are..." );  // display random values
        System.out.println();
        
        for ( i = 0; i < 5; i++ )
        {
            System.out.print( L1.lotteryNumbers[i] + "\t" );
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println( "User entered values are... ");  // display user inserted values
        System.out.println();
        
        for( r = 0; r < 5; r++ )
        {
            System.out.print( numArr[r] + "\t" );
        }
        
        cnt = L1.compareLottery( numArr );            // calling the compareLottery function through L1 
        
        
        
        System.out.println();
        System.out.println();
        
        System.out.println("Number of matching entries are : " + cnt + "\n" );
        
        
    } 
    
}

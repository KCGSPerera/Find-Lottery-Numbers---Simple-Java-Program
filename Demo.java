// IT21810664
// Perera K C G S

import java.util.Scanner;                                                   // importing the Scanner library

class Geometry{                                                             // class defenition
                                                                        
	private double cirRadius;                                               // declaring attributes
	private double recLength;
	private double recWidth;
	private double triBase;
	private double triHeight;

	Geometry(){                                                             // calling the default constructor of the Geometry class
	}

	public  double getAreaOfCircle( double cirRadius ){                     // calculate and return the circle area
	
	    this.cirRadius = cirRadius;
	    return ( 3.14 * this.cirRadius * this.cirRadius );
	}

	public double getAreaOfRectangle( double recLength, double recWidth ){  // calculate and return the rectangle area
	
	    this.recLength = recLength;
	    this.recWidth = recWidth;

	    return ( this.recWidth * this.recLength );
	}

	public double getAreaOfTriangle( double triBase, double triHeight ){    // calculate and return the triangle area
	
    	this.triBase = triBase;
    	this.triHeight = triHeight;

    	return ( ( 1 / 2.0 ) * triBase * triHeight );
	}

}




public class Demo {
  public static void main(String[] args) {                                  // Main function begins program execution         

    double rad, recLen, recWid, triB, triH;                                 // declaring variables
    double cirArea = 0, recArea = 0, triArea = 0;
    int choise;
    char repeat;

    Geometry geo1 = new Geometry();                                         // creating Geometry class type objects
    Geometry geo2 = new Geometry();
    Geometry geo3 = new Geometry();
    Geometry geo4 = new Geometry();

    System.out.println("Geometry Calculator \n");                           // display the menu
    System.out.println("1. Calculate the Area of a Circle \n");
    System.out.println("2. Calculate the Area of a Rectangle \n");
    System.out.println("3. Calculate the Area of a Triangle \n");
    System.out.println("4. Quit \n");

    Scanner s1 = new Scanner(System.in);                                    // Create Scanner type object

    do {                                                                    // read user inputs using a do while loop

      System.out.print("Enter your choice(1-4) : ");
      choise = s1.nextInt();

      if (choise == 1) {                                                    // option for choise 1
        System.out.print("Please enter the Radius : ");
        rad = s1.nextDouble();

        cirArea = geo1.getAreaOfCircle(rad);                                // calling the methods through objects
        System.out.println("The Area of the Cirle : " + cirArea);           // display the area claculated

      }
      

      else if (choise == 2) {                                               // option for choise 2
        System.out.print("Please enter the Legnth : ");
        recLen = s1.nextDouble();

        System.out.print("Please enter the Width : ");
        recWid = s1.nextDouble();

        recArea = geo2.getAreaOfRectangle(recLen, recWid);
        System.out.println("The Area of the Rectangle : " + recArea);

      }
      

      else if (choise == 3) {                                               // option for choise 3
        System.out.print("Please enter the Base Legnth : ");
        triB = s1.nextDouble();

        System.out.print("Please enter the Height : ");
        triH = s1.nextDouble();

        triArea = geo3.getAreaOfTriangle(triB, triH);
        System.out.println("The Area of the Triangle : " + triArea);

      }
      

      else if (choise == 4) {                                               // option for choise 4
        char quit;

        System.out.print("Are you sure want to Quit(Y/N) : ");
        quit = s1.next().charAt(0);

        if (quit == 'Y' || quit == 'y') 
        {
            repeat = 'N';
            

            if (repeat == 'N' || repeat == 'n') 
            {
                System.out.println("Thank You");
                break;
            }
          
        }
        

        else if (quit == 'N' || quit == 'n') {                              

           repeat = 'Y';
	       continue;
        }

       
      }
      
      else{                                                                 // If user inserted an invalid choise                     
          System.out.println("Invalid choise");
          System.out.println();
          
      }

      System.out.print("Do you need to continue(Y/N) : ");
      repeat = s1.next().charAt(0);

      if (repeat == 'N' || repeat == 'n')                                   // Exit if the user does not need to continue
      {
          System.out.println("Thank You");
          break;
      }

      if(repeat != 'y' && repeat != 'Y' && repeat != 'n' && repeat != 'N')  // if user inserted an invalid input
      {

        while( repeat != 'y' && repeat != 'Y' && repeat != 'n' && repeat != 'N')
        {
          System.out.println("Invalid input");
          System.out.print("Do you need to continue(Y/N) : ");
          repeat = s1.next().charAt(0);
          System.out.println();

          if(repeat == 'n' || repeat == 'N' )
          {
            System.out.println("Thank You");
          }
          
        }
      }

    } while (repeat == 'Y' || repeat == 'y');                               // End of the do while loop

  }

}	                                                                        // End of function main
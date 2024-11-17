
/**
 * Class MaxLine:
 *  The purpose of this program is to get the coordinates of 3 points in the
 *  plane and find the longest distance between any 2 points.
 *  
 *  The program gets from the user 6 whole numbers (positive, negatives or 
 *  zero), without checking for validity of the input.
 *  Each pair of numbers represents the x,y coordinates of a point.
 *  
 *  The program then calculates the distance between each pair of points, and
 *  prints the coordinates of the 2 points whose distance between them is the
 *  longest. If there is more than one pair with longest distance then the
 *  first pair is printed.
 *  
 *  The prorgam checks first the distance between point A (the 1st point)
 *  and point B (the 2nd point),then the distance between point B (the 2nd
 *  point) and point C (the 3rd point), and finally the distance between point
 *  A (the 1st point) and point C (the 3rd point).
 *  
 *  For example:
 *  If the input is the values of the 3 points A=(2,4), B=(6,1), C=(2,1),
 *  then the output is:
 *      "Max line created by the following points: (2,4), (6,1).
 *
 * @author (Zvika Barak)
 * @ID (050982479)
 * @version (12.11.2024)
 */

import java.util.Scanner;   // import the Scanner class

public class MaxLine
{
    public static void main(String[] args)
    {
            // construct the object scan to be used to get input from the user
        Scanner scan = new Scanner (System.in);
            // print the 1st prompt and ask the user to input the 1st point
        System.out.println("Enter first point coordinates:");
            // get the 2 numbers entered and assign then to point 1
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
            // print the 2nd prompt and ask the user to input the 2nd point
        System.out.println("Enter second point coordinates:");
            // get the 2 numbers entered and assign them to point 2
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
            // print the 3rd prompt and ask the user to input the 3rd point
        System.out.println("Enter third point coordinates:");
            // get the 3 numbers entered and assign then to point 3
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        
            // calculate distance between points 1 and 2
        double longestDistance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
        int xOfPair1 = x1;  // 1st point of longest line
        int yOfPair1 = y1;
        int xOfPair2 = x2;  // 2nd point of longest line
        int yOfPair2 = y2;
            // calculate distance between points 2 and 3 and check if longer
            // than the distance between point 1 and 2
        double distanceBC = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2,2));
        if (longestDistance < distanceBC)
        {
            longestDistance = distanceBC;
            xOfPair1 = x2;  // 1st point of longest line
            yOfPair1 = y2;
            xOfPair2 = x3;  // 2nd point of longest line
            yOfPair2 = y3;
        }
        double distanceAC = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1,2));
        if (longestDistance < distanceAC)
        {
            xOfPair1 = x1;  // 1st point of longest line
            yOfPair1 = y1;
            xOfPair2 = x3;  // 2nd point of longest line
            yOfPair2 = y3;
        }
        System.out.print("Max line created by the following points: (");
        System.out.println(xOfPair1 + "," + yOfPair1 + "), (" + 
                                    xOfPair2 + "," + yOfPair2 + ").");
    }   // end of method main
}   //end of class MaxLine

/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = sc.nextDouble();
        System.out.print("Input the second number: ");
        double y = sc.nextDouble();
        System.out.print("Input the third number: ");
        double z = sc.nextDouble();
        
        System.out.println("The smallest value is "+ smallest(x,y,z));
        
        
        
    }
    public static double smallest(double x, double y, double z)
        {
            return Math.min(Math.min(x, y), z);
        }
}
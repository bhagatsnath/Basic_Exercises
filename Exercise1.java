/**
 * Author: Bhagat Sabari Nath
 * Date: Nov 6, 2025
 */
import java.util.*;
public class Exercise1 {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rounds do you want to play: ");
        int times = sc.nextInt();
        System.out.println();
        message("Boring game of Dice",8);
        System.out.println();
        System.out.println();
        System.out.print("What is Player 1 name: ");
        String name = sc.next();
        execution(times, name);
        
    }
    public static void message(String s, int x){
        System.out.println(s);
        for (int i = 1; i<=x;i++){
            System.out.print("*");
        }
    }
    public static String compare(int a, int b){
        if (a==b){
            return "Pair";
        }
        else if (a==b+1 || b==a+1){
            return "Consecutive";
        }
        else{
            return "Nothing";
        }
    }
    public static void execution(int x, String a){
        Scanner sc = new Scanner(System.in);
        int pair = 0;
        int consecutive = 0;
        int roll1;
        int roll2;
        System.out.println(a+"'s Results");
        int totalPoints = dice(a,x);
        System.out.println();
        System.out.print("What is Player 2 name: ");
        String b = sc.next();
        System.out.println(b+"'s Results");
        int totalPoints2 = dice(b,x);
        System.out.println();
        if (totalPoints>totalPoints2){
            System.out.println(a+" is the winner");
        }
        else if (totalPoints<totalPoints2){
            System.out.println(b+" is the winner");
        }
        else{
            System.out.println("This is a tie");
        }

    }
    public static int dice(String a,int x){
        int pair = 0;
        int consecutive = 0;
        int totalPoints;
        for (int i = 1; i<=x; i++){
            int roll1 = (int)(Math.random() * 6) + 1;
            int roll2 = (int)(Math.random() * 6) + 1;
            String result = compare(roll1, roll2);
            System.out.print("Round#"+i+": "+roll1+" and "+roll2+" ==> ");
            if (result.equals("Pair")){
                pair++;
            }
            else if (result.equals("Consecutive")){
                consecutive++;
            }
            System.out.println(result);
        }
        System.out.println(pair+" Pairs "+consecutive+" Consecutives ");
        totalPoints = (pair*4)+(consecutive*2);
        System.out.println(a+" Total Point = "+totalPoints);
        return totalPoints;
    }

}

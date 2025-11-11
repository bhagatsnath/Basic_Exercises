/**
 * Author: Bhagat Sabari Nath
 * Date: Nov 11, 2025
 * Java Unit 4 Practice
 */
import java.util.*;
public class Practice1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int pair = 0;
        int consecutive = 0;
        System.out.print("How many Rounds to play? ");
        int rounds = sc.nextInt();
        System.out.println();
        message("Boring Game of Dice",8);
        System.out.println();
        System.out.print("Player 1 Name: ");
        String name = sc.next();
        System.out.println(name+"'s results");
        while (i<=rounds){
            int roll1 = (int)(Math.random()*6)+1;
            int roll2 = (int)(Math.random()*6)+1;
            String results = compare(roll1,roll2);
            if (results.equals("Pair")){
                pair++;
            }
            else if (results.equals("Consecutive")){
                consecutive++;
            }
            System.out.println("Round#"+i+": "+roll1+" and "+roll2+" ==> "+results);
            i++;
        }
        System.out.println();
        System.out.println(pair+" Pairs "+consecutive+" Consecutives");
        int tpoints = (pair*4)+(consecutive*2);
        System.out.println(name+"'s Total Point = "+tpoints);
        pair=0;
        consecutive=0;
        i=1;
        System.out.println();
        System.out.print("Player 2 Name: ");
        String name2 = sc.next();
        System.out.println(name2+"'s results");
        while (i<=rounds){
            int roll1 = (int)(Math.random()*6)+1;
            int roll2 = (int)(Math.random()*6)+1;
            String results = compare(roll1,roll2);
            if (results.equals("Pair")){
                pair++;
            }
            else if (results.equals("Consecutive")){
                consecutive++;
            }
            System.out.println("Round#"+i+": "+roll1+" and "+roll2+" ==> "+results);
            i++;
        }
        System.out.println();
        System.out.println(pair+" Pairs "+consecutive+" Consecutives");
        int tpoints2 = (pair*4)+(consecutive*2);
        System.out.println(name2+"'s Total Point = "+tpoints2);
        System.out.println();
        if (tpoints>tpoints2){
            System.out.println(name+" is the winner");
        }
        else if (tpoints2>tpoints){
            System.out.println(name2+" is the winner");
        }
        else{
            System.out.println("This is a tie");
        }
    }
    public static void message(String s, int n){
        System.out.print(s);
        for (int i = 1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static String compare(int x, int y){
        if (x==y){
            return "Pair";
        }
        else if (x==(y+1) || y==(x+1)){
            return "Consecutive";
        }
        else{
            return "Nothing";
        }
    }
}
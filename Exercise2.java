/**
 * Author: Bhagat Sabari Nath
 * Largest non-prime number less than 1000, which has the least number of factors.
 */
import java.util.*;
public class Exercise17 {
    public static void main(String[]args){
        Set factorSet = new HashSet();
        int factors = 500;
        int largestNum = 1;
        for (int i = 999; i>=2; i--){
            int count = 1;
            while (count<=(i/2)){
                if (i%count == 0){
                    factorSet.add(count);
                    factorSet.add(i);
                }
                count++;
            }
            if (factorSet.size()<factors && factorSet.size()>=3){
                largestNum = i;
                factors = factorSet.size();
            }
            factorSet.clear();
        }
        System.out.println(largestNum);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luck
 */
public class kk {
    static int sum(int[] nums) {
   int sum = 0;
   for (int i : nums) {
      sum += i;
   }
   return sum;
}

public static void main(String[] args) {
   int[] p = {017, 100, 005};
   int sum = sum(p);
   System.out.println(sum);
}
}

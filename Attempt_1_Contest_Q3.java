/*Odd Negative Inc
Problem Description

Given a Dynamic Array of Integer A of size N.
Return Dynamic Array of Integers which contains the odd negative integers from A in increasing Order.


Dynamic Array : 
For JAVA : ArrayList
For C++ : vector
For Python : List


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109


Input Format
First and Only argument is Integer array A


Output Format
Return Integer Array


Example Input
Input 1 :

A = [15, -14, -17, 8, 8, -15, -1, 33, -12, 4, -9]


Input 2 :

A = [1, -1, -5, 2, -6, -7, 8, -3]


Example Output
Output 1:
-17, -15, -9, -1


Output 2:
-7, -5, -3, -1


Example Explanation
Explanation 1:
-ve numbers from A are : -14, -17, -15, -1, -12, -9

-ve odds are : -17, -15, -1, -9

-ve odds in increasing order are : -17, -15, -9, -1

Explanation 2:
-ve numbers from A are : -1, -5, -6, -7, -3

-ve odds are : -1, -5, -7, -3

-ve odds in increasing order are : -7, -5, -3, -1

 */
 public class Attempt_1_Contest_Q3 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            if((A.get(i)%2!=0)&&(A.get(i)<0))
                al.add(A.get(i));
        }
        
        Collections.sort(al);
        
        return al;
        
    }
}
 

import java.util.ArrayList;
import java.util.Collections;


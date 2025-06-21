/*Multiples of 3
Problem Description

Given an integer array A of size N. Return array of integers which contains multiples of 3 from A in increasing order.


Problem Constraints
1 <= N <= 105 

1 <= A[i] <= 109


Input Format
Only argument is an integer array A.


Output Format
Return an integer array.


Example Input
Input 1:
A = [6, 2, 3, 5, 3, 1, 4, 9, 12]
Input 2:
A = [1, 2, 5, 7]


Example Output
Output 1:
[3, 3, 6, 9, 12]
Output 2:
[]


Example Explanation
Explanation 1:
Multiple of 3 in array are 6, 3, 3, 9 and 12. After sorting the list becomes 3, 3, 6, 9 and 12.
Explanation 2:
There is no multiple of 3 in the array. */
public class Attempt_1_Contest_Q5 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)%3==0)
                al.add(A.get(i));
        }
        
        Collections.sort(al);
        
        return al;
        
    }
}

import java.util.ArrayList;
import java.util.Collections;


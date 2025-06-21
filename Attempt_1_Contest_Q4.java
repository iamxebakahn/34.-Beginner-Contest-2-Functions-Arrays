/*Max Product Pair
Problem Description

Given an array A of size N, return maximum possible product from any pair (A[i], A[j]) where (i != j) of an array.


Problem Constraints
2 <= N <= 103
-4104 <= A[i] <= 4104


Input Format
First and only argument is an integer array A.


Output Format
Return an integer denoting the maximum possible product.


Example Input
Input 1:

A = [7, 8, 2, 1, 3, 4, 5, 9]

Input 2:

A = [2, 1, 7, 4, 5, -6, 3, -1, -8]


Example Output
Output 1:

72

Output 2:

48


Example Explanation
Explanation 1:

For input A = [7, 8, 2, 1, 3, 4, 5, 9],
we can see that the maximum product is achieved by multiplying 8 and 9 which is equal to 72.

Explanation 2:

For input A = [2, 1, 7, 4, 5, -6, 3, -1, -8],
we can see that the maximum product is achieved by multiplying -6 and -8 which is equal to 48.
 */
public class Attempt_1_Contest_Q4 {
    public int solve(ArrayList<Integer> A) {
        int prod=1;
        Collections.sort(A);
        int max1=A.get(A.size()-1);
        int max2=A.get(A.size()-2);
        int min1=A.get(0);
        int min2=A.get(1);
        if(min1*min2>max1*max2)
            return min1*min2;
        else
            return max1*max2;
        
        
        // for(int i=0;i<A.size();i++)
        // {
        //     for(int j=0;j<A.size();j++)
        //     {
        //         prod
        //     }
        // }
        
        
        
        
    }
}

import java.util.ArrayList;
import java.util.Collections;


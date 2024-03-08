/**
 Problem: https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889

1 2 3
1 2
1

 */

public class ReverseNumTriangle{
    public static void nNumberTriangle(int n) {
    // Write your code here
    int totalTimes = n;
    for(int i = 1; i <= n; ++i){
        for(int j = 1; j <= totalTimes; ++j){
            //print the jth value in the current ith row
            System.out.print(j);
            //print a space
            System.out.print(" ");
        }
        totalTimes--;
        System.out.println();
    }
}
}
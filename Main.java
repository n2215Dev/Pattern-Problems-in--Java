/*
Problem statement
Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

For every value of ‘N’, help sam to print the corresponding N-dimensional forest.

Example:
Input: ‘N’ = 3

Output: 
* * *
* * *
* * *

Constraints :
1  <= N <= 25
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
* * *
* * *
* * *
Explanation Of Sample Input 1 :
For N = 3, fill all the rows and columns in 3x3 matrix with ‘*’.
Sample Input 2 :
1
Sample Output 2 :
*
Sample Input 3 :
4
Sample Output 3 :
* * * *
* * * *
* * * *
* * * *

 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //asking for the user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //call the nForest function and pass the integer input taken from the user i.e. n
        nForest(n);
    }

    public static void nForest(int n){
    int stars = 3, spaces = 0;
    for(int i = 1; i <= n; ++i){
        for(int j = 1; j <= stars; ++j){
            System.out.print('*');
            //print space between each star
            System.out.print(" ");
        }
        //print a new line
        System.out.println();
    }
}
}
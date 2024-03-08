/*
Problem: https://www.codingninjas.com/studio/problems/n-2-forest_6570178

* 
* *
* * *
* * * *

 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //asking for the user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //call the nForest function and pass the integer input taken from the user i.e. n
        nForest2(n);
    }

    public static void nForest2(int n){
    int stars = 1;
    for(int i = 1; i <= n; ++i){
        for(int j = 1; j <= stars; ++j){
            //print the stars in the current row
            System.out.print('*');
            //print the space
            System.out.print(" ");
        }
        //print a new line after the end of each row
        System.out.println();
        stars++;
    }
}
}
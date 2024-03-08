/*
Problem: https://www.codingninjas.com/studio/problems/n-triangles_6573689

1
1 2 
1 2 3

 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //asking for the user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //call the nForest function and pass the integer input taken from the user i.e. n
        nTriangle.nTriangle(n);
    }
   
}

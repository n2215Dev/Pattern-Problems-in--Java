/*
Problem: https://www.codingninjas.com/studio/problems/seeding_6581892
* * *
* *
*
 */
public class Seeding{
    public static void seeding(int n){
        int stars = n;
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= stars; ++j){
                System.out.print('*');
                System.out.print(" ");
            }
            stars--;
            System.out.println();
        }
    }
}
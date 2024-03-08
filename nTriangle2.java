/*
Problem: https://www.codingninjas.com/studio/problems/triangle_6573690

1
2 2 
3 3 3

 */
public class nTriangle2{
    public static void nTriangle2(int n){
        int num = 1;
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= num; ++j){
                System.out.print(num);
                System.out.print(" ");
            }
            num++;
            System.out.println();
        }
    }
}
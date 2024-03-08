public class nTriangle{
    public static void nTriangle(int n){
        int num = 1;
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= num; ++j){
                System.out.print(j);
                System.out.print(" ");
            }
            num++;
            System.out.println();
        }
    }
}
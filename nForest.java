public class nForest{
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
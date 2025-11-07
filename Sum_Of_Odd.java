import java.util.Scanner;

public class Sum_Of_Odd {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                sum  = sum +i;
            }
        }
        System.out.println(sum);
    }
    
}

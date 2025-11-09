import java.util.Scanner;

public class Square {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scn.nextInt();
        int square = 0;
        for(int i=1;i<=n;i++){
           square = i*i;
           System.out.println("square of "+i+"="+square);
        }
    }
    
}

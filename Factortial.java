import java.util.Scanner;

public class Factortial {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    
}

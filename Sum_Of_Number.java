import java.util.Scanner;

public class Sum_Of_Number {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        int sum = 0;
        while(n>0){
          int p = n%10;
          sum = sum + p;
          n = n/10;
        }
        System.out.println(sum);
    }
    
}

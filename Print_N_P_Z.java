import java.util.Scanner;

public class Print_N_P_Z {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        if(n>0){
            System.out.println("Positive number");
        }else if(n<0){
            System.out.println("Negative Number");
        }else if(n==0){
            System.out.println("zero");
        }else{
            System.out.println("not a number");
        }
    }
    
}

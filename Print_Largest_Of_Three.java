import java.util.Scanner;

public class Print_Largest_Of_Three {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+" is greater");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is greater");
        }else{
            System.out.println(c+" is greater");
        }
    }
    
}

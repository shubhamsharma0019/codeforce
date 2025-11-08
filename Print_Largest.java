import java.util.Scanner;

public class Print_Largest {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the numbers");
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a>=b){
            System.out.print(a+"is greater");
        }else{
            System.out.print(b+"is greater");
        }
    }
    
}

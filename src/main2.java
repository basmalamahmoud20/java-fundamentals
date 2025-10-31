import java.util.Scanner;
public class main2{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int x=input.nextInt();
        int reverse=0;
        int y=x;
        while(y!=0) {
            int z = y% 10;
            reverse = (reverse * 10) + z;
            y/= 10;
        }
        if(x==reverse)
            System.out.println(x+" is palindrome");
        else
            System.out.println(x+" is not palindrome");
    }
}

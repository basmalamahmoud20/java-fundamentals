import java.util.Scanner;
public class main3 {
    public static void main(String[]args){
      Scanner input=new Scanner(System.in);
        int total=5000;
        int x=0;
       while(x!=4){
           System.out.println("enter 1 for withdraw\nenter 2 for deposit\nenter 3 for check balance\nenter 4 for exit");
           System.out.print("choose the operation : ");
            int z=input.nextInt();
            if(z==1){
            System.out.print("enter money to be withdrawn:");
            int y=input.nextInt();
            if(y<=total&&y>0){
                System.out.println("collect your money");
                total=total-y;}
            else
                System.out.println("invalid");
            }
            else if(z==2)
            {
                System.out.print("enter money to be deposited :");
                int y=input.nextInt();
                System.out.println("your has been deposited successfully");
                total+=y;
            }
        else if(z==3){
                System.out.println("your balance : "+total);
            }
       else if(z==4)
           break;
       else
                System.out.println("the operation is invalid");
       }
    }
}
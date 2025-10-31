import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] A=new int[10];
        System.out.println("enter 10 values of elements :");
        for(int i=0;i<10;i++){
            System.out.print("A["+(i+1)+"]=");
            A[i]=input.nextInt();
        }
        System.out.print("enter the element that you want to check its occurance:");
        int occ=input.nextInt();
        int count=0;
        for(int i=0;i<10;i++){
            if(A[i]==occ){
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
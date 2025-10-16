package java_Basic_program;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static int swap(int a,int b){
    int temp=0;
    temp=a;
    a=b;
    b=temp;
    return a,b;
    // return b;
}
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Before swapping: a="+a+" b="+b);
        System.out.println(swap(a,b));
        System.out.println("After swapping: a="+a+" b="+b);
    }
}

import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int a = sc.nextInt();
        System.out.println("enter no");
        int b = sc.nextInt();
        // System.out.println("sum of a & b =" + (a+b));
        // System.out.println("product of a&b = " + (a*b));
        if(b!=0){
        System.out.println("division of a / b ="+(a/(float)b));
        }
        else{
            System.out.println("b should not be = 0");
        }
        sc.close();
    }
}
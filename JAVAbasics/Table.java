import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int num = sc.nextInt();
        for(int i = 0 ;i<=10;i++){
            System.out.println(num +"x "+i +"=" + num * i);
        }
    sc.close();
    }
}

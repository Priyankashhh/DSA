import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int a = sc.nextInt();
        System.out.println("enter no");
        int b = sc.nextInt();
        System.out.println("enter no");
        int c = sc.nextInt();

        // int d = Math.max(a, b);
        // int res=Math.max(d, c);
        // System.out.println("largest no. betn a, b, c is:" + res);

        
        // int res = 0;
        // if(a>b){
        //     res = a;
        // }else{
        //     res = b;
        // }
        // if(res>c){
        //     System.out.println("largest no:"+res);
        // }
        // else{
        //     System.out.println("largest no"+c);
        // }
        
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }else{
                if(b>c){
                    System.out.println(b);
                }else{
                    System.out.println(c);
                }
            }
        sc.close();
    }
}

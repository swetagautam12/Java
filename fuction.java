
import java.util.*;

public class fuction {
    public static void printheelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }


    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("sum is : "+ sum);
    }
    

    public static void main(String args[]){
        calculatesum();
        printheelloworld();

    }
}

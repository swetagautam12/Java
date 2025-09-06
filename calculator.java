// import java.util.*;

// public class calculator {
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int number1=sc.nextInt();
//         int number2=sc.nextInt();
//         int sum =number1+number2;
//         System.out.println(sum);
//         int sub = number1-number2;
//         System.out.println(sub);
//         int multi =number1*number2;
//         System.out.println(multi);
//         int div = number1/number2;
//         System.out.println(div);
//         int mod =number1%number2;
//         System.out.println(mod);

//     }
    
// }



// calculator


import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter b: ");
        int b =sc.nextInt();
        System.out.println("enter operator: ");
        char operator =sc.next().charAt(0);
        switch (operator){
            case '+': System.out.println(a+b);
                         break;
            case '-' : System.out.println(a-b);
                          break;
            case '*' :System.out.println(a*b);
                           break;
            case '/' :System.out.println(a+b);
                           break;
            case '%' :System.out.println(a/b);
                           break;
            default : System.out.println("not avlaible");
        }
    }
}
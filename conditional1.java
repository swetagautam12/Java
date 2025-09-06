

// public class conditional1 {
//     public static void main(String args[]){
//         int age =13;
//         if (age >=18){
//             System.out.println("adult");

//         }
//         else if (age>=13 && age < 18){
//             System.out.println("teenager");

//         }
//         else {
//             System.out.println("chlid");
//         }
//     }
    
// }
import java.util.*;
public class conditional1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if (income< 500000){
            tax=0;
            //.out.println()
        }
        else if (income>=500000 && income < 1000000){
            tax= (int) (income*0.2);

        }
        else{
            tax =(int)(income *0.3);
           
        }

        System.out.println("your tax is :"+ tax);
           
        
    }
    
}

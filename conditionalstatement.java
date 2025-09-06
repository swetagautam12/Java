

// public class conditionalstatement {
//     public static void main(String args[]){
//         int age =16;
//         if (age>=18){
//             System.out.println("adult: drive,vote");
//         }
//         if (age>13 && age <18){
//             System.out.println("teenager");

//         }        
//         else{
//             System.out.println("not adult");
//         }

//     }
// }

// public class conditionalstatement {
//     public static void main(String args[]){
//        int A=1;
//        int B=3;
//        if (A>=B){
//         System.out.println("A");
//        }
//        else{
//         System.out.println("B");
//        }

//     }

// }

import java.util.*;
public class conditionalstatement {

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number =sc.nextInt();
        if (number % 2 == 0){
            System.out.println("Even");

        }
        else{
            System.out.println("odd");
        }

    }
}




// public class breakkeyword {
//     public static void main(String args[]){
//         for(int i =1; i<=5;i++){
//             if (i == 3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("im  out of the loop ");
//     }
    
// }



import java.util.*;
public class breakkeyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("enter your number : ");
            int n = sc.nextInt();
             
            if (n%10 ==0){
                break ;
            }
            System.out.println(n);
        } while (true);
    }
}

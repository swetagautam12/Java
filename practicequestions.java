
// import java.util.*;
// public class practicequestions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int number =sc.nextInt();
//         if (number > 0) {
//             System.out.println("positive number");
//         }else {
//             System.out.println("negative number");
//         }
//         }
//     }
    







// import java.util.*;
// public class practicequestions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int number =sc.nextInt();
//         if (number > 0) {
//             System.out.println("positive number");
//         }else {
//             System.out.println("negative number");
//         }
//         }
//     }
    




// public class practicequestions {
//     public static void main(String args[]){
//         double temp = 103.5;
//         if ( temp >100){
//             System.out.println("Have a fever");
        
//         }
//         else {
//             System.out.println("No fever");
//         }

//     }

// }






// import java.util.*;
// public class practicequestions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the week number: ");
//         int day = sc.nextInt();
        
//         switch (day){
//         case 1 :System.out.println("Sunday");
//                     break;
//         case 2: System.out.println("Monday");
//                     break;
//         case 3: System.out.println("tuesday");
//                     break;
//         case 4: System.out.println("wednesday");
//                     break;
//         case 5: System.out.println("thursday");
//                     break;
//         case 6: System.out.println("Friday");
//                     break;
//         case 7 : System.out.println("Saturday");
//                     break ;
//         default : System.out.println("invalid number");
//         }

//     }

// }




// import java.util.*;
// public class practicequestions {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the year: ");
//         int year = sc.nextInt();
//         if (year % 4 ==0 || year% 100==0 || year %400==0) {

//             System.out.println("Leap year");
//         }
//         else {
//             System.out.println("Not a Leap Year");
//         }
        
//     }
    
// }




import java.util.*;
public class practicequestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        boolean x =(year%4)==0;
        boolean y =(year%100) != 0;
        boolean z = ((year % 100 ==0) && (year % 400 == 0));
        
        if (x && (y||z)){
            System.out.println(year + " is a leap year ");

        }
        else {
            System.out.println(year + "is not a leap year");
        }
    }
    
}
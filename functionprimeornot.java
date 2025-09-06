

// method 1

// public class functionprimeornot {
//     public static boolean isprime(int n){
//         boolean isprime =true;
//         for (int i =2;i<=n-1;i++){
//             if(n%i==0){  // completely dividing
//                 isprime=false;
//                 break;
//             }

//         }
//         return isprime;
//     }
//     public static void main(String args[]){
//         System.out.println(isprime(5));

//     }

        
    
    
// }


//method 2

// public class functionprimeornot {
//     public static boolean isprime(int n){
        
//         for (int i =2;i<=n-1;i++){
//             if(n%i==0){  // completely dividing
//                 return false;
            
//             }

//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isprime(5));

//     }

        
    
    
// }


// method 3


// public class functionprimeornot {

//     // only for n>=2
//     public static boolean isprime(int n){
//         // corner cases 
//         // 2
//         if (n==2){
//             return true;

//         }
        
//         for (int i =2;i<=n-1;i++){
//             if(n%i==0){  // completely dividing
//                 return false;
            
//             }

//         }
//         return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isprime(2));

//     }

        
    
    
// }







//optimised method always use this method in code


// public class functionprimeornot {
    
    
//     public static boolean isprime(int n){
//         if (n==2){
//             return true;
//         }
//         for (int i = 2; i<=Math.sqrt(n); i++){
//             if (n%i == 0){
//                 return false;

//             }
//         }
//         return true;
//     }
//     public static void main (String args[]){
//         System.out.println(isprime(16));
//     }

    
// }





// print all primes in a range


public class functionprimeornot {
    
    
    
    public static boolean isprime(int n){
        if (n==2){
            return true;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
                return false;

            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for (int i =2 ; i <=n; i++){
            if (isprime(i)){  //true 
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main (String args[]){
        primesInRange(20);

    }

    
}


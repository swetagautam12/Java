// public class reversenumber {
//     public static void main(String args[]){
//         int n = 10899;
//         while (n>0){
//             int lastdigit = n%10;
//             System.out.print(lastdigit);
//             n = n /10; //n/=10
//         }
//         System.out.println();

//     }
    
// }



public class reversenumber {
    public static void main(String args[]){
        int n = 234;
        int rev =0;
        while (n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n /10; //n/=10
        }
        System.out.println(rev);

    }
    
}
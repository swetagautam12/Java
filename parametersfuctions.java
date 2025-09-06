

// import java.util.*;

// public class parametersfuctions {
    


//     public static void printheelloworld(){
//         System.out.println("Hello world");
//         System.out.println("Hello world");
//         System.out.println("Hello world");

//     }


//     public static void calculatesum(int a ,int b){
        
//         int sum =a+b;
//         System.out.println("sum is : "+ sum);
//     }
    

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         calculatesum(a,b);
        

//     }
// }

    




import java.util.*;

public class parametersfuctions {
    


    public static void printheelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }


    public static int  calculatesum(int num1 ,int num2){ //parameters or formal parameters
        
        int sum =num1+num2;
        return sum;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b);// arguments or actual parameters
        System.out.println("sum is : "+ sum);

        calculatesum(a,b);
        

    }
}

    


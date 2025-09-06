// function overlaoding using parameters

// public class functionoverloading {
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static int sum (int a , int b, int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(1,1,1));

//     }
// }


//funtion overloading using data type


public class functionoverloading {
    
    
    // func to calc int sum
    public static int sum(int a ,int b){
        return a +b;

    }
    // function to cal float sum 
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.8f));

    }
}

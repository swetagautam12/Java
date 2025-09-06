

// Pairs in an Array

public class Array_pairs_in_an_array {
    public static void printpairs(int numbers[]){
        int totalpairs=0;
        for (int i =0;i<numbers.length;i++){ //array element 
            int curr = numbers[i]; // 2,4,6,8,10
            for(int j = i+1;  j<numbers.length;j++){ //inner loop (pairs print)
                System.out.print("(" + curr +","+ numbers[j] +")");
                totalpairs++;

            }
            System.out.println();// print nextline  
        }
        System.out.println("total_pairs = " + totalpairs);

    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);

    }
    


    
}

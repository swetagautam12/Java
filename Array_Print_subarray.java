// // print Subarrays 
// public class Array_Print_subarray {
//     public static void printSubarrays(int numbers[]){
//        for(int i =1 ; i< numbers.length;i++){//0 to n loop (start)

//         int start = numbers[i]; // or int start =i

//         for(int j =i ;j <numbers.length;j++){ //start to end loop (end )
//             int end = numbers[j]; // or int end =j
//             for(int k = start;k<= end; k++){// print 
//                 System.out.print(numbers[k] + " ");// subaaray 

//             } 
//             System.out.println();


//         }
//         System.out.println();
//     }
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         printSubarrays(numbers);

//     }



// }
// print subaarys
public class Array_Print_subarray{
    public static void printSubarrays(int numbers[]){
        int ts =0;
        for (int i =0; i<numbers.length; i++){//start niklega 
            int start =i;
            for(int j = i ; j<numbers.length;j++){//end niklega 
                int end =j;
                for(int k = start ; k <= end ;k++){ //print subarray
                    System.out.print(numbers[k]+ " ");//subarray

                }
                ts++;
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("total subarrays =" + ts  );
    }
    public static void main(String args[]){
        int numbers[] = { 2, 4,6,8,10};
        printSubarrays(numbers);
    }

} 


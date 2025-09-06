public class pattern_half_pyramid_with_number {
    public static void  inverted_half_pyramid_with_number(int n ){
        for(int i =1;i<=n;i++){   // outer loop for lines
            for(int j =1;j<=n-i+1;j++){  // inner loop for numbers
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_half_pyramid_with_number(5);

    }
    
}

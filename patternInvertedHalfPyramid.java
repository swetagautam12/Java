public class patternInvertedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int n){// n = no of rows or line
        for(int i = 1; i<=n;i++){    // outer loop for number of line 
            for (int j = 1; j<=n-i;j++){  // loop for spaces 
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){  // loop for stars
                System.err.print("*");



            }
            System.out.println();

            }
            
        }
        public static void main (String args[]){
            inverted_rotated_half_pyramid(4);
        }



    } 
    


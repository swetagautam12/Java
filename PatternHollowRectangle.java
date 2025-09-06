public class PatternHollowRectangle {
    public static void hollow_rectangle(int totalRows,int totalColumn){
        // outer loop (row)
        for (int i =1;i<=totalRows;i++){  // i = no of line of the rows
            // inner loop (coulmn)
            for (int j=1;j<=totalColumn;j++){ // j = column
                // cell number -(i,j)(row,column)
                if (i == 1|| i == totalRows|| j ==1||j ==totalColumn ){
                    // boundary cells
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println(); 
                }
            }
        public static void main(String args[]){
            hollow_rectangle(4,5);
        }


        
    }
    


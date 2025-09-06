public class pattern_floyd_triangle {
    public static void FLOYDs_triangle(int n){
        // outer loop (number line to print)
        int counter =1;
        for (int i =1; i<=n;i++){
            // inner loop (how many times counter be printed)
            for (int j = 1; j<=i;j++){
                System.out.print(counter+" ");
                counter ++;
            }
            System.out.println();
        }

    }
    public static void main(String args[]) {
        FLOYDs_triangle(5);
    }
    
}

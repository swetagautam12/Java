
public class typepromotion1 {
    public static void main(String agrs[]){
        short a =5;
        byte b =25;
        char c ='c';
        // byte bt = a+b+c;//error ouccerd int to byte conversion not possible 
        byte bt = (byte)(a+b+c);
        System.out.println(bt);
    }    
}

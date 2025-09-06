
public class typepromotion {
    public static void main(String agrs[]){
        char a = 'a';
        char b= 'b';
        //char c=a-b;//not posible due to data lose int to char not possible
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);//not ouccred of type promotion,type promotion only in expresion 
        System.out.println(b-a);//oucred of type promotion in this expresion
    }    


    
}

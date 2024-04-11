import java.util.*;
public class Factorial{
    public static void main(String[]args){
        int num;
        int product=1;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        for (int i=num;num>0;i++){
            product*=num;
            num-=1;
        }
        
        System.out.println(product);

    }
}
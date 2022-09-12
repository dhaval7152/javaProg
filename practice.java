
import  java.util.*;
public class practice {
        static public int factorial(int no){
            if(no==0 || no==1){
                return 1;
            }
            else{
                return no*factorial(no-1);
            }
        }
public static void main(String[] args) {
//
        int f=factorial(4);
        System.out.println(f);
        }

}
//    Sum of digit
//        int Value=876;
//        int digit=0,sum=0,temp=0;
//       while (Value>0){
//            digit=Value%10;
//            sum+=digit;
//            Value=Value/10;
//
//       }
//        System.out.println(sum);
//    String a=null;
//        System.out.println(new StringBuilder(a).reverse());
//        new StringBuilder(Name).reverse(),
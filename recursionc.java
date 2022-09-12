public class recursionc {


    public static int factorial(int n){
         if(n==0 || n==1){
             return 1;
         }
         else{
             // Using Recursion method
             return n*factorial(n-1);
            // Using For Loop
//             int product=1;
//             for(int i=1;i<=n;i++){
//                 product*=i;
//             }
//             return product;


         }
    }
    public static void main(String[] args) {
          int fct=  factorial(4);
        System.out.println("Factorial of Number is: "+fct);
    }
}

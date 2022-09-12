package Inteview;

class pal{

    static public void isPalindrome(int no){
        int temp=0, sum=0,remd=0;
        temp=no;
        while (no>0){
            remd=no%10;
            sum=(sum*10)+remd;
            no=no/10;
        }
        if(temp==sum){
            System.out.println("its palidrome");
        }
        else {
            System.out.println("it's not");
        }

    }
}
public class palindrome {
    public static void main(String[] args) {
        pal.isPalindrome(121);
    }
    }


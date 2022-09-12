package Inteview;

class method{
    static public int reverse(int no){
        int temp=0,rm=0,rv=0;

        temp=no;
        while (temp>0){
            rm=temp%10;
            rv=(rv*10)+rm;
            temp=temp/10;

        }
        return rv;

    }
}



public class reverseInt {
    public static void main(String[] args) {
        System.out.println(method.reverse(586));

    }
}

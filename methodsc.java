import java.lang.reflect.Method;

public class methodsc {
     int sum(int a, int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {

        methodsc mc=new methodsc();
        int c=mc.sum(5,5);
        System.out.println(c);

    }
}

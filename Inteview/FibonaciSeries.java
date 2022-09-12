package Inteview;

public class FibonaciSeries {
    static int seriesFibonaci(int maxNo){
    int previousNo=0;
    int nextNo=1;
        System.out.println("Fibonaci Series of :"+maxNo+"numbers:");
        for(int i=1;i<=maxNo;++i){
            System.out.print(previousNo+ " ");

            int sum=previousNo+nextNo;
            previousNo=nextNo;
            nextNo=sum;
        }
        return previousNo;
    }


    public static void main(String[] args) {
       int result= seriesFibonaci(9);
        System.out.print(result);
    }
}

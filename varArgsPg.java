public class varArgsPg {
    static public int sum_of_no(int...values){
        int add=0;
        for (int value:values){
            add+=value;
        }
        return add;
    }
    public static void main(String[] args) {
        System.out.println("Sum of No: "+sum_of_no(1,2,3,4,9));



    }
}

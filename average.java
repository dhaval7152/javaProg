public class average {

    static int avgNo(int...arr){
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        int avg= sum/ arr.length;
        return avg;

    }
    public static void main(String[] args) {

        int ans= avgNo(10,20,30);
        System.out.println(ans);
    }
}

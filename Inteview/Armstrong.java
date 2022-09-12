import  java.util.*;
class arm{
    static public void isArmstrong(int no){
        int temp=0,digit=0,sum=0,last=0;
        temp=no;

        while (temp>0){
            temp=temp/10;
            digit++;
        }
        temp=no;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if(sum==no){
            System.out.print(no+",");
        }
        else {
//            System.out.println("No");
        }

    }
    }

public class Armstrong {
    public static void main(String[] args) {

//        armstrong Number
        int num=5550;
        System.out.print("Armstrong numbers are : ");
        for(int i=0;i<num;i++){
            arm.isArmstrong(i);
        }
    }
}

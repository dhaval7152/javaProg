class placement extends Thread{
    public void run(){

        int i=0;
        while( i < 40){
        i++;
        System.out.println("Asite Exam Tommorow");
        }
    }
}
class study extends Thread{
    public void run(){
        int i=0;
        while( i < 40){
            i++;
            System.out.println("Final Exam is Comminngg");
        }
    }
}

public class ThreadProg {
    public static void main(String[] args) {
        placement plc=new placement();
        study std=new study();
        plc.start();
        std.start();
    }
}

class One{
    public void name(){
        System.out.println("My name is One Method");
    }

    public void music(){
        System.out.println("Playing.....");
    }
}
class  Two extends One{
    @Override
    public void name() {
        System.out.println("My name is Two Method");
    }
}

public class DyanamicMethod {
    public static void main(String[] args) {
//        Two two=new Two();
//        two.name();
        One obj=new Two();
        obj.name();
        obj.music();
    }
}

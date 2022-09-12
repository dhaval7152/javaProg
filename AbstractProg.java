abstract class blockChain{
    abstract public void eth();
    public void demo(){
        System.out.println("This is demo Method");
    }
}
 class currency extends blockChain{
    public void eth(){
        System.out.println("priniting from non abstract class");
    }
        }
 class Tree extends currency{


}

public class AbstractProg {
    public static void main(String[] args) {
//You can not create object pf abstract class because it's yet to be intialized
//    blockChain  block=new blockChain(); <<Error
    Tree jad=new Tree();
    jad.eth();

}
}

import java.util.ArrayDeque;

public class ArrayDequeProg {
    public static void main(String[] args) {
    ArrayDeque<Integer> ad =new ArrayDeque<>();
    ad.add(5);
    ad.add(655);
        System.out.println(ad.getFirst());
//        System.out.println(ad.getLast());
//        System.out.println(ad.pollFirst());
        System.out.println(ad.removeLast());
        System.out.println(ad);

    }
}

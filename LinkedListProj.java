import java.util.LinkedList;

public class LinkedListProj {
    public static void main(String[] args) {
//      typeCollection<DataTYpe> Name=new TypeCOllection<>();
        LinkedList <Integer> arr=new LinkedList<>();
        LinkedList <Integer> arr2=new LinkedList<>();
        arr.add(5);
        arr.add(6);
        arr.addFirst(55);
        arr.addLast(0);
        arr2.add(28);
        arr2.add(6);
        arr.addAll(arr2);
//        arr.add(0,555);
//        arr.set(0,786);


//        System.out.println(arr.toArray().length);
//        System.out.println(arr);
        for(int i=0;i<arr.size();i++)
        {
//            System.out.println(arr.get(i));
//            System.out.println(arr.indexOf(6));
        }
        System.out.println(arr.contains(5));

//        arr.removeIf(n -> (n.charAt(0) == 'd'));
        System.out.println(arr);



    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String[] studentName = new String[30];
//        studentName[0]="Rakesh";
//
//        studentName[29]="Harish";
//
//        // new student
//        studentName[30] = "Raman";

//        ArrayList<String> studentName = new ArrayList<>();
//        studentName.add("Rakesh");
//        studentName.add("Ramesh");

//        size = n
//                n + n/2 + 1

        // add function in array List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4); // this will add integer to last of list
        System.out.println(list);
        list.add(1,20);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(300);
        newList.add(350);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(300));
        System.out.println(list);

//        list.clear();
//        System.out.println(list);

        list.set(2,300);
        System.out.println(list); // o(1)

        System.out.println(list.contains(300)); // o(n)

        // how to iterate over the list

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("The element is "+ list.get(i));
//
//        }
//        for (Integer val: list
//             ) {
//            System.out.println("for each is " + val);
//
//        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }








    }
}
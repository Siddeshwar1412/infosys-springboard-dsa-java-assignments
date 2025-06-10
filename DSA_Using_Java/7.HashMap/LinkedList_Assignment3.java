import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

class Tester {

    public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> mergedList = new LinkedList<Integer>();
        Iterator<Integer> it1 = listOne.iterator();
        Iterator<Integer> it2 = listTwo.iterator();

        Integer val1 = it1.hasNext() ? it1.next() : null;
        Integer val2 = it2.hasNext() ? it2.next() : null;

        while (val1 != null && val2 != null) {
            if (val1 <= val2) {
                mergedList.add(val1);
                val1 = it1.hasNext() ? it1.next() : null;
            } else {
                mergedList.add(val2);
                val2 = it2.hasNext() ? it2.next() : null;
            }
        }

        while (val1 != null) {
            mergedList.add(val1);
            val1 = it1.hasNext() ? it1.next() : null;
        }

        while (val2 != null) {
            mergedList.add(val2);
            val2 = it2.hasNext() ? it2.next() : null;
        }

        return mergedList;
    }

    public static void main(String args[]) {
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(13);
        listOne.add(21);
        listOne.add(42);
        listOne.add(56);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(15);
        listTwo.add(20);
        listTwo.add(21);
        listTwo.add(85);
        listTwo.add(92);

        List<Integer> mergedList = mergeLists(listOne, listTwo);
        System.out.println(mergedList);
    }
}

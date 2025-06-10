import java.util.LinkedList;
import java.util.List;

class Tester {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
        LinkedList<Integer> result = new LinkedList<>();
        for(int i=0; i<listOne.size(); i++){
            if(listTwo.contains(listOne.get(i))){
                result.add(listOne.get(i));
            }
        }
        return result;
    }
    
    public static void main(String arga[]){
        List<Integer> listOne = new LinkedList<>();
        listOne.add(101);
        listOne.add(211);
        listOne.add(101);
        listOne.add(35);
        listOne.add(28);

        List<Integer> listTwo = new LinkedList<>();
        listTwo.add(101);
        listTwo.add(211);
        listTwo.add(10);

        System.out.println(findCommonElements(listOne, listTwo));  // Output: [101, 211, 101]
    }
}

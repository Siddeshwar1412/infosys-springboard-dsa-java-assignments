import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
        final int N_BOTTOM_TO_MOVE = 3;
        Deque<Character> auxStack = new ArrayDeque<>();
        while (!inputStack.isEmpty()) {
            auxStack.push(inputStack.pop());
        }
        LinkedList<Character> originalBottomElements = new LinkedList<>();
        for (int i = 0; i < N_BOTTOM_TO_MOVE && !auxStack.isEmpty(); i++) {
            originalBottomElements.addFirst(auxStack.pop());
        }
        LinkedList<Character> originalTopElements = new LinkedList<>();
        while (!auxStack.isEmpty()) {
            originalTopElements.addFirst(auxStack.pop());
        }

        LinkedList<Character> finalDesiredList = new LinkedList<>();
        finalDesiredList.addAll(originalBottomElements);
        finalDesiredList.addAll(originalTopElements);
        Deque<Character> resultStack = new ArrayDeque<>();
        for (int i = finalDesiredList.size() - 1; i >= 0; i--) {
            resultStack.push(finalDesiredList.get(i));
        }

        return resultStack;
    }

    public static void main(String[] args) {
        Deque<Character> inputStack = new ArrayDeque<>();
        inputStack.push('y');
        inputStack.push('t');
        inputStack.push('r');
        inputStack.push('e');
        inputStack.push('w');
        inputStack.push('q');
        System.out.println("Original Stack (top to bottom):");
        Deque<Character> tempPrintStack = new ArrayDeque<>();
        while (!inputStack.isEmpty()) {
            tempPrintStack.push(inputStack.pop());
        }
        while (!tempPrintStack.isEmpty()) {
            Character c = tempPrintStack.pop();
            System.out.println(c);
            inputStack.push(c);
        }

        Deque<Character> resultStack = updateStack(inputStack);

        System.out.println("\nThe alphabets in updated stack (top to bottom) are:");
        for (Character alphabet : resultStack) {
            System.out.println(alphabet);
        }
    }
}
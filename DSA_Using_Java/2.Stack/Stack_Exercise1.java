class Stack {
    
    private int top; 
    private int maxSize; 
    private int[] arr;

    Stack(int maxSize) {
        this.top = -1; 
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        if (top >= (maxSize - 1)) {
            return true;
        }
        return false;
    }

    public boolean push(int data) {
        if (isFull()) {
            return false;
        } 
        else {
            arr[++top] = data;
            return true;
        }
    }

    public int peek() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        else
            return arr[top];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is empty!");
        else {
            System.out.println("Displaying stack elements");
            for (int index = top; index >= 0; index--) {
                System.out.println(arr[index]);
            }
        }
    }

    public boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    public int pop() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        else
            return arr[top--];
    }
}


class Tester {
    
    public static void main(String args[]) {
        
        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(25);
        stack.push(30);
        stack.push(40);
        
        stack.display();
        
        if (checkTop(stack)) {
            System.out.println("The top most element of the stack is an even number");
        } else {
            System.out.println("The top most element of the stack is an odd number");
        }
    }

    public static boolean checkTop(Stack stack) {
        int topElement = stack.peek();
        if (topElement == Integer.MIN_VALUE) {
            System.out.println("Stack is empty.");
            return false;
        }
        return topElement % 2 == 0;
    }
}

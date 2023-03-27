public class StackUsingArray {

    private int data[];
    private int topIndex;

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;

    }

    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        // if(topIndex== -1){
        // return true;
        // }
        // else{
        // return false;
        // }

        return topIndex == -1;

    }

    public void push(int elem) throws StackFullException {
        // if stack is full
        if (topIndex == data.length - 1) {
            StackFullException e = new StackFullException();
            throw e;
            // throw exception
        }
        topIndex++;
        data[topIndex] = element;
    }

    public int top() throws StackFullException {
        if (topIndex == -1) {
            // Throw stack empty exception
            throw new StackFullException();
        }
        return data[topIndex];
    }

    public int pop() throws

    StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    public class StackUse {

        public static void main(String[] args) throws StackFullExceptio {

            StackUsingArray stack = new StackUsingArray();
            int arr[] = { 5, 6, 7, 1, 9 };
            for (int i = 0; i < arr.length; i++) {
                stack.push(arr[i]);
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            // stack.push(10);
            // System.out.println(stack.top());
            // stack.pop();
            // stack.size();
            // System.out.println(stack.isEmpty());
            // stack.isEmpty();
        }
    }
}
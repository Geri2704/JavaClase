public class Main {
    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        System.out.println("Content: " + stack.toString());
        System.out.println(stack.removeFirst() + " Has been removed");
        System.out.println("Actual first number: " + stack.getFirst());
        System.out.println("Content: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Array is not empty");
        } else {
            System.out.println("Array is empty");
        }


    }
}
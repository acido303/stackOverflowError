public class Main {

    // Method 'stackOverflow()' recurses infinitely, and can only end by throwing an exception
    private static int stackOverflow(int i){
        return stackOverflow(i);
    }

    public static void main(String[] args) {
        stackOverflow(1);
    }
}

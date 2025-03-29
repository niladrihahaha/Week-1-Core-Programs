public class NullPointerDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = null;
        System.out.println("Length: " + text.length()); // This will throw NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}


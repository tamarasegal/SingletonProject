public class Main {
    public static void main(String[] args) throws Exception {
        MessageLogger ml = MessageLogger.getInstance();
        ml.logMessage("hello");
        ml.logMessage("hi");
        ml.logMessage("hey");
        ml.printAll();

    }
}
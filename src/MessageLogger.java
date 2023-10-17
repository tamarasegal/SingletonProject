import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MessageLogger {
    public String s;
    private File f;
    private static MessageLogger single_instance = null;

    PrintWriter pw;

    private MessageLogger()  {
        try { s = "Hello I am a string part of MessageLogger class";
        f = new File("msgs.txt");
        pw = new PrintWriter(f);
        }

        catch (Exception e) {
            System.out.println("file msgs.txt could not be found");
        }
    }

    public static synchronized MessageLogger getInstance() {
        if (single_instance == null)
            single_instance = new MessageLogger();
        return single_instance;
    }
    public void logMessage(String str) throws Exception {
            pw.println(str);
    }

    public void printAll() throws Exception {
        pw.close();
        Scanner scan = new Scanner(f);
        while (scan.hasNext())
            System.out.println(scan.nextLine());
    }
}

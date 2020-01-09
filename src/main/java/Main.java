import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;
        do {
            Write write = new Write();
            write.save();
            System.out.println("Type Yes to Add more Visitors or No to exit");
            input = s.nextLine();
        } while (input.equalsIgnoreCase("yes"));

        do {
            Read read = new Read();
            read.load();
            System.out.println("Type Yes to Add more Visitors or No to exit");
            input = s.nextLine();
        } while (input.equalsIgnoreCase("yes"));
    }
}

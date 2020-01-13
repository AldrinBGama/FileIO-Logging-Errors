import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String input;
        String rerun;

    do {
        int opt;
        System.out.println("Press 1 to enter add visitor or Press 2 to view  visitors profile");
        opt=s.nextInt();
        if (opt == 1) {
            do {
                Write write = new Write();
                write.save();

                input = s.nextLine();
            } while (input.equalsIgnoreCase("q"));

        } else if (opt == 2) {
            do {
                Read read = new Read();
                read.load();
                System.out.println("A to Add more Visitors or No to exit");
                input = s.nextLine();
            } while (input.equalsIgnoreCase("yes"));
        }
        System.out.println("Type Yes to run or No to exit");
        rerun=s.nextLine();
    }while (rerun.equalsIgnoreCase("yes"));
}}

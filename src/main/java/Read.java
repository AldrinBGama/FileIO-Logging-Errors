import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Read {
    static String name;
    static String surname;
    private final static Logger LOGGER = Logger.getLogger(Read.class.getName());

    public static String load() throws IOException {
        String file =("visitor_" + name + "_" + surname + ".txt");
        File file1 = new File(file);
        String[] files = file1.list();
        System.out.println(files);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        name = scanner.nextLine();
        System.out.println("Enter Surname");
        surname = scanner.nextLine();


        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
            LOGGER.info(file + " profile view");
        } catch (FileNotFoundException e) {
            LOGGER.info("file not found");
        }
        return ("visitor_" + name + "_" + surname + ".txt");
    }

    public String load(String tfn) {
        return "Users/bahlegama/IdeaProjects/FileIOLoggingErrors";
    }
}

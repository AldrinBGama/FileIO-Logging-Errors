import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Write {
    String  name;
    String  surname;
    int     age;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    Scanner scanner = new Scanner(System.in);

    public void save() {
            System.out.println("Enter Name");
            name =scanner.nextLine();
            System.out.println("Enter Surname");
            surname =scanner.nextLine();
            System.out.println("Enter Age");
            age= scanner.nextInt();
            System.out.println("File Saved");

            while (true) {
                FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter("visitor_"+name+"_"+surname+".txt");
                fileWriter.write("Full name: " + name + " " + surname + "\n" + "Age: " + Integer.toString(age)
                        + "\n" + "Date of visit: " + sdf.format(date));
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
    }
}

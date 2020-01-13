import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Time;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Write {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    Date date = new Date();
    Date time = new Date();
    String  vis_name, att_name;
    String  surname;
    String  comment;
    int     age;


    Scanner input = new Scanner(System.in);

    public void save() {
        final Logger LOGGER = Logger.getLogger(Read.class.getName());
            System.out.println("Enter Visitor's Name: ");
            vis_name = input.nextLine();
            System.out.println("Enter Visitor's Surname: ");
            surname = input.nextLine();
            System.out.println("Enter Age: ");
            age = input.nextInt();
            input.nextLine();
            System.out.println("Please comments about the visitor and press ENTER: ");
            comment = input.nextLine();
            System.out.println("Enter attendant's Name: ");
            att_name = input.nextLine();
            String run;

                while (true) {
                    FileWriter fileWriter = null;
                    try {
                        File file = new File("visitor_" + vis_name + "_" + surname + ".txt");
                        boolean fileExists = file.exists();
                        if (fileExists){
                            LOGGER.info("visitor_" + vis_name + "_" + surname + ".txt"+" file exist");
                        }else{
                            fileWriter = new FileWriter("visitor_" + vis_name + "_" + surname + ".txt");
                            fileWriter.write("Full name: " + vis_name + " " + surname + "\n" + "Age: "
                                    + Integer.toString(age) + "\n" + "Date of visit: " + sdf.format(date) + "\n"
                                    + "Time of visit: " + timeFormat.format(time) + "\n"
                                    + "Attendant's Comments about the visitor" + "\n" + comment + "\n"
                                    + "name of the person who assisted the visitor: \n" + att_name);
                            fileWriter.close();
                            LOGGER.info("visitor_" + vis_name + "_" + surname + ".txt"+" file saved!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        LOGGER.info("INPUT MISMATCH");
                    }
                    return;
                }
            }
}

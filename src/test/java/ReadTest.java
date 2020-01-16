import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {

    @Test
    void load() throws IOException {
        Read load2 = new Read();
        String tfn = "/Users/bahlegama/IdeaProjects/FileIOLoggingErrors/visitor_Alice_Cooper.txt";
        String ept = "visitor_Alice_Cooper.txt";
        String res = load2.load(tfn);
        assertEquals(ept,res);
    }
}
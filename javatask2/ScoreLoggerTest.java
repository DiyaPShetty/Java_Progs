package codes;

import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreLoggerTest {

    @Test
    void testFileWriteAndThreadCompletion() throws IOException, InterruptedException {
        ScoreLogger logger = new ScoreLogger();
        File file = new File("student_scores.csv");
        if (file.exists()) file.delete();

        Thread t1 = new StudentThread(new Student("riya", 1, 90), logger);
        Thread t2 = new StudentThread(new Student("Ram", 2, 85), logger);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertTrue(file.exists(), "File should be created");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        long lineCount = reader.lines().count();
        reader.close();

        assertEquals(2, lineCount, "File should contain two student records");
    }
}

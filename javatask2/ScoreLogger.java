package codes;

import java.io.FileWriter;
import java.io.IOException;

public class ScoreLogger {

    private final String fileName = "student_scores.csv";

    // synchronized → ensures only one thread writes at a time
    public synchronized void logScore(Student s) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(s.getName() + "," + s.getRoll() + "," + s.getMarks() + "\n");
            System.out.println("Saved: " + s.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

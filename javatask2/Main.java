package codes;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ScoreLogger logger = new ScoreLogger();

        Thread t1 = new StudentThread(new Student("Diya", 1, 90), logger);
        Thread t2 = new StudentThread(new Student("Rahul", 2, 85), logger);
        Thread t3 = new StudentThread(new Student("Neha", 3, 95), logger);

        t1.start();
        t2.start();
        t3.start();

        // Wait until all threads finish
        t1.join();
        t2.join();
        t3.join();

        System.out.println("✅ All student scores logged successfully!");
    }
}

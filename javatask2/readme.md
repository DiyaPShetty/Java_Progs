Student Exam Score Logger

This task simulates multiple students submitting their exam scores at the same time using threads, and safely writes the data to a file with synchronization.

 Features

Multiple threads writing to the same file

Thread-safe file writing using synchronized

Stores student name, roll number, and marks

Verified using JUnit test cases

 Functionality Overview

Each student (thread) submits their score.

All threads write to the same file (student_scores.csv).

Synchronization ensures no data overlap.

JUnit test checks if all threads completed and file contains correct records.
Example Output (Main Program)
Saved: Diya
Saved: Rahul
Saved: Neha
✅ All student scores logged successfully!

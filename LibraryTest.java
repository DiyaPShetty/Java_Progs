package library;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library lib;

    @BeforeEach
    public void setup() {
        lib = new Library();
        lib.Bookadd("101", "Java Basics", "James");
        lib.Bookadd("102", "Algorithms", "Cormen");
    }

    @Test
    public void testAddBook() {
        lib.Bookadd("103", "DBMS", "Navathe");
        assertEquals(3, lib.getBooks().size());
    }

    @Test
    public void testIssueBookSuccess() {
        boolean issued = lib.issueBook("101");
        assertTrue(issued);
        assertTrue(lib.getBooks().get(0).isIssued());
    }

    @Test
    public void testIssueBookFail() {
        lib.issueBook("101"); // issue once
        boolean secondTry = lib.issueBook("101"); // try again
        assertFalse(secondTry);
    }

    @Test
    public void testDeleteBook() {
        boolean deleted = lib.deleteBook("102");
        assertTrue(deleted);
        assertEquals(1, lib.getBooks().size());
    }

    @Test
    public void testDeleteBookFail() {
        boolean deleted = lib.deleteBook("999");
        assertFalse(deleted);
    }
}

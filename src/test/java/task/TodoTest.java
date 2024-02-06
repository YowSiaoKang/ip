package task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    @Test
    public void toString_todoObject_todoString() {
        assertEquals("[T][ ] read book", new Todo("read book").toString());
    }

    @Test
    public void toString_markedTodoObject_markedTodoString() {
        assertEquals("[T][X] read book", new Todo("read book", true).toString());
    }
}
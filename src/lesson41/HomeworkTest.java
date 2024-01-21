package lesson41;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private Homework homework;
@BeforeEach
    public void setUp(){
        homework = new Homework();
    }
    @Test
    public void findNameToNumberOccurrenceWhen2_test() {

               List<String> actual = Arrays.asList("John", "Marry", "Peter", "John");
        assertEquals(1,homework.findNameToNumberOccurrence(actual,"John"));
    }
    @Test
    public void findNameToNumberOccurrenceWhen0_test(){
        List<String> actual = Arrays.asList("John", "Marry", "Peter", "John");
        assertEquals(2,homework.findNameToNumberOccurrence(actual,"John"));
    }
    @Test
    public void findNameToNumberOccurrenceWhen2JohnsOnly_test() {
        List<String> actual = Arrays.asList("John", "John");
        assertEquals(2, homework.findNameToNumberOccurrence(actual, "John"));
    }

}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testReverseSimpleWord() {
        String result = Main.reverse("Hello");
        assertEquals("olleH", result);
    }

    @Test
    void testReverseWithNumbers() {
        String result = Main.reverse("abc123");
        assertEquals("cba123", result);
    }

    @Test
    void testReverseEmpty() {
        String result = Main.reverse("");
        assertEquals("", result);
    }

    @Test
    void testReverseNull() {
        String result = Main.reverse(null);
        assertEquals("", result);
    }

    @Test
    void testReverseOnlyLetters() {
        String result = Main.reverse("Java");
        assertEquals("avaJ", result);
    }

    @Test
    void testReverseSymbolsOnly() {
        String result = Main.reverse("!@#$%");
        assertEquals("!@#$%", result);
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void mainTest() {
        Main main = new Main();
        Assertions.assertEquals(4, main.sum(1, 3));
    }
}
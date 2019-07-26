import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    private static void dotest(int n, int expected) {
        int actual = Main.cycle(n);
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        dotest(33, 2);
    }

    @Test
    public void test2() {
        dotest(18118, -1);
    }

    @Test
    public void test3() {
        dotest(69, 22);
    }

    @Test
    public void test4() {
        dotest(197, 98);
    }

    @Test
    public void test5() {
        dotest(65, -1);
    }


}


package annotations;

public class MyTest {
    @Test
    public void testLess() {
        assert 1 < 2;
    }
    @Test
    public void testMore() {
        assert 2 > 1;
    }

    @Test
    public void testFail() {
        assert false;
    }
}

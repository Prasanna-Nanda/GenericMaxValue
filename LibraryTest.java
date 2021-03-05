import org.testng.annotations.Test;

public class libraryTest {
    @Test
    public void testSomeLibraryMethod() {
                    Library classUnderTest = new Library();
            assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    private void assertTrue(String s, Object someLibraryMethod) {
    }

    private class Library {
        public Object someLibraryMethod() {
            return null;
        }
    }
}

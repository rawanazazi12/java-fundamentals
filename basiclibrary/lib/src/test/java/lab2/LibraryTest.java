/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    public void testContainsDuplicatesMethod() {
        Library classUnderTest = new Library();
        int[] RandomArray = {2, 5, 3};
        assertFalse( classUnderTest.containsDuplicates(RandomArray));
    }
    @Test void testCalculatingAvgMethod(){
        Library library = new Library();
        int [] array = {1,2,3};
        assertEquals(2,library.calculatingAverage(array),"Average value should be 2");

    }
}

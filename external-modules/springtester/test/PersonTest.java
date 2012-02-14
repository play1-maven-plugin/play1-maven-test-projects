import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import play.modules.springtester.SpringMockitoUnitTestCase;
import play.modules.springtester.Subject;
import springtester.AgeCalculator;
import springtester.Person;

public final class PersonTest extends SpringMockitoUnitTestCase {
    @Subject private Person subject;
    @Mock(name = "ageCalculator") AgeCalculator mockAgeCalculator;

    @Test
    public void testCanVote() throws Exception {
        checkCanVote(false, 0);
        checkCanVote(false, 17);
        checkCanVote(true, 18);
        checkCanVote(true, 19);
        checkCanVote(true, 20);
    }

    private void checkCanVote(boolean expected, int age) {
        Mockito.when(mockAgeCalculator.calculate("1-January-1980")).thenReturn(age);
        boolean actual = subject.canVote();
        assertEquals(expected, actual);
    }
}

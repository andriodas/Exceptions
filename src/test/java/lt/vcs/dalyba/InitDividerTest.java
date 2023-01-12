package lt.vcs.dalyba;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitDividerTest {
    @Test
    public void testDivision() throws ArgumentisZeroException {
        //1.duomenys
        String pirmasSkaicius = "8";
        String antrasSkaicius = "2";
        int expectdResult = 4;
        int actualResult;
        //2.atliekam veiksmus
        String[] skaiciai = {pirmasSkaicius, antrasSkaicius};
        actualResult = InitDivider.divide(skaiciai);
        //3.sulyginam rezultatus
        Assert.assertEquals(expectdResult,actualResult);
    }

    @Test
    public void testDivision02() {
        String expected = "Dailius";
        String actual ;
        String  resultInfo = String.format(
                "Expected: %s; Actual: %s",
                expected,
                actual);
        Assert.assertTrue(resultInfo, actual.contains(actual));
    }
}
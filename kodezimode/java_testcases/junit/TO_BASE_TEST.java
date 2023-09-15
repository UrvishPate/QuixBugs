
import org.junit.Test;
import org.junit.Assert;
import java_programs.TO_BASE;
import java_testcases.junit.QuixFixOracleHelper;

public class TO_BASE_TEST {

    @Test(timeout = 3000)
    public void test_0() throws Exception {
        String result = TO_BASE.to_base(31,16);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("1F", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_1() throws Exception {
        String result = TO_BASE.to_base(41,2);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("101001", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_2() throws Exception {
        String result = TO_BASE.to_base(44,5);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("134", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_3() throws Exception {
        String result = TO_BASE.to_base(27,23);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("14", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_4() throws Exception {
        String result = TO_BASE.to_base(56,23);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("2A", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_5() throws Exception {
        String result = TO_BASE.to_base(8237,24);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("E75", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_6() throws Exception {
        String result = TO_BASE.to_base(8237,34);
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("749", resultFormatted);
    }
}

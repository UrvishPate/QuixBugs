
package java_testcases.junit;

import org.junit.Test;
import org.junit.Assert;
import java_programs.LONGEST_COMMON_SUBSEQUENCE;
import java_testcases.junit.QuixFixOracleHelper;

public class LONGEST_COMMON_SUBSEQUENCE_TEST {
    @Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("headache","pentadactyl");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("eadac", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("daenarys","targaryen");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("aary", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("XMJYAUZ","MZJAWXU");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("MJAU", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("thisisatest","testing123testing");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("tsitest", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("1234","1224533324");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("1234", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("abcbdab","bdcaba");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("bcba", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("TATAGC","TAGCAG");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("TAAG", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("ABCBDAB","BDCABA");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("BCBA", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("ABCD","XBCYDQ");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("BCD", resultFormatted);
    }

    @Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.lang.String result = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("acbdegcedbg","begcfeubk");
        String resultFormatted = QuixFixOracleHelper.format(result,true);
        Assert.assertEquals("begceb", resultFormatted);
    }
}

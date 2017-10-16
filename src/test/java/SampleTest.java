import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
    private int a,b;

    @BeforeTest
    public void setup(){
        a=5;
        b=7;
    }

    @Test
    public void addTest() {
        Assert.assertEquals(a + b, 12);
    }

    @Test
    public void deleteTest(){
        Assert.assertEquals(b-a,2);
    }

    @Test
    public void addTest02(){
        Assert.assertEquals(a+b,11);
    }
}

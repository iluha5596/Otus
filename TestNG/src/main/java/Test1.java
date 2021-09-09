import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test (dependsOnMethods = {"test1"}, alwaysRun = true)
    public void test2 () {
        System.out.println("Test 2");
        }

}



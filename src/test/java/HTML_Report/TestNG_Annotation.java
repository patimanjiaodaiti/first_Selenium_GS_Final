package HTML_Report;

import org.testng.annotations.*;

public class TestNG_Annotation {
    @BeforeMethod
    public void X1(){
        System.out.println("Before Methods comes fourth ");
    }
    @BeforeClass
    public void X2(){
        System.out.println("Before Class comes third. Only executes once");
        //only looks at one class and executes once only
    }
    @BeforeTest
    public void X3(){
        System.out.println("Before Test comes second. Only executes once");
        //it includes multiple classes to execute the test and
        //which are any classes it extends TestBase
        //creates only one html report
    }
    @BeforeSuite
    public void X4(){
        System.out.println("Before Suite comes first. Only executes once");
        //multiple before test(different packages(classes inside package) which extends TestBase)
    }
    //@After will be same logic but it executes from =>small to large annotation
    // methods < class < test < suit
    @Test
    public void DD(){

    }
    @Test
    public void ZZ(){

    }
}

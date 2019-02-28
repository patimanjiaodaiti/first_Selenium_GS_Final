package FileHandling;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile_Handling {
    public static void main(String[] args) {
        //configuration reader is called properties file
        //Step one: make the file readable in java using FileInputStream and it always thows checked exception
        try {
            FileInputStream file = new FileInputStream("info.properties");
            //step two: store the file in to it's java type file
            Properties myProFile = new Properties();
            myProFile.load(file);

            //Verify process
            String myName = myProFile.getProperty("Name");
            System.out.println(myName);
            Assert.assertTrue(myName.equals("Patima"));
            System.out.println("Test Finish");

            String expectedResult = "Patima";
            Assert.assertTrue(myName.equals(expectedResult));
            System.out.println("Test Finished");
            Assert.assertFalse(false);

            //soft assert:it ignores the false statement and keeps executing the code
            //Asser is a break statement and Soft assert is continues statement
            //used in the cases which one test has to fail but we need to execute the code
            SoftAssert ast = new SoftAssert();
            ast.assertTrue(false);

            String actualresult=myProFile.getProperty("Gender");
            Assert.assertEquals("Male",actualresult);
            System.out.println(actualresult);

            String AA=myProFile.getProperty("UserName");
            System.out.println(AA);

        }catch (Exception e){//we don't have to give budy for checked exception cz it will not execute
        }
    }
}

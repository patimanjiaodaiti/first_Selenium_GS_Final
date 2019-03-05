package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class simpleReport {
    //This is java application cz it has main to write
    //the first step fails it will not create report file cz it's a java application
    //but in TestNG since we have before and after method even it fails it still execute the after method to create a report
    //myreport.attachReport(htmlreport);
    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("Reports/report1.html");
        //we can only create once in before method and call it in order to use
        //as soon as we create a html reporter we will need to write file location and file name,
        //report1 file will automatically create after executing the code
        //ExtentReport only reports Extent tests

        ExtentReports myreports = new ExtentReports();//it's the one it generated the report.
        // we are creating a report document and we are attaching the file to it
        myreports.attachReporter(htmlReporter);

        //below is a test definition
        ExtentTest myTest = myreports.createTest("Print first report on the console");
        myTest.log(Status.INFO,"Log in functionality");//this is indicating the the test steps
        //we must indicate the info in every single step when we test in order to get the report
        //below is a step definition
        myTest.log(Status.FAIL,"Invalid Website");
        myTest.log(Status.SKIP,"Privious test faild");
        myTest.log(Status.ERROR,"There has been error");
        myTest.log(Status.PASS,"Test passed");
        //we must refresh my report else it will not give html file
        myreports.flush();
        //it allow us to give the information to the dash bord
        myreports.setSystemInfo("Browser","www.yahoo.com");
        myreports.setSystemInfo("UserName","Tester");
        myreports.setSystemInfo("Password","admin");
        myreports.flush();


        ExtentTest myTest2 = myreports.createTest("Log off fuctionality");
        //first we must write step definition to create report
        myTest2.log(Status.INFO,"Logging in");
        myTest2.log(Status.INFO,"Logging out");
        myTest2.log(Status.INFO,"Closing the browser");
        //creating a note for the test we executed we use below method and Step is a node
        myTest2.createNode("any additional notes we wat to add we will use this createNode method");
        //if we have used any data we will write the informations to dashbord
        myreports.setSystemInfo("Website number two"," facebook.com");
        myreports.setSystemInfo("facebook user name","Tester");
        myreports.setSystemInfo("facebook passeord","admin");
        myreports.flush();



    }
}

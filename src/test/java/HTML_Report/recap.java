package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class recap {
    //this page can't report a html file if test fail cz we are running as java
    public static void main(String[] args) {
        ExtentReports reportdocument=new ExtentReports();
        ExtentHtmlReporter htmlFile=new ExtentHtmlReporter("Reports/recapInfo.html");
        reportdocument.attachReporter(htmlFile);

        ExtentTest Tests = reportdocument.createTest("Testing the log in functionality");
        //extent report only reports extent tests
        Tests.info("open browser, go to website");
        System.out.println("Go to Web");

        Tests.log(Status.INFO,"Logging in");
        System.out.println("Log in");

        Tests.log(Status.INFO,"Logging out");
        System.out.println("Log out");

        Tests.info("Quite the browser");
        System.out.println("Close the browser");

        reportdocument.setSystemInfo("Website","www.facebook.com");
        reportdocument.setSystemInfo("UserName","Tester");
        reportdocument.setSystemInfo("PassWord","Admin");

        htmlFile.config().setDocumentTitle("Facebook LogIn");
        //renaming html file title
        htmlFile.config().setReportName("patima");
        htmlFile.config().setTheme(Theme.DARK);

        reportdocument.flush();
    }
}

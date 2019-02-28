package FileHandling;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelFileHandling_DDT {
    //DDT=>data-driven testing
    //most cases it's done in excel sheet to test data driven
    //BDT=> behaviour-driven testing
    //BDD=> Behavior-driven development
    public static void main(String[] args) {
        try {
            FileInputStream Excel = new FileInputStream("TestingOne.xlsx");
            //if we did not download the excel sheet we will paste
            //C:\\Users\\fjiaodaiiti\\Documents\\GitHub\\first_Selenium_GS_Final" =>to the ileInputStream
            XSSFWorkbook TestingOne = new XSSFWorkbook(Excel);//we must gave a java file
            XSSFSheet Patima = TestingOne.getSheet("PatimaJawdat");
            String AA = Patima.getRow(1).getCell(1).getStringCellValue();
            System.out.println(AA);

            int rowNumbers = Patima.getLastRowNum();
            System.out.println(rowNumbers);//row counts the index
            int cellNumber = Patima.getRow(0).getLastCellNum();
            System.out.println(cellNumber);//cell count the length
            //in order to print all the data
            for (int y=0; y<=3; y++){
                for (int x=0; x<=2; x++){
                    String BB = Patima.getRow(y).getCell(x).getStringCellValue();
                    System.out.println(BB);
                }
            }

        } catch(Exception e) {
        }
    }
}

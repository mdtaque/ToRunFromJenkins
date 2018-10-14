package TestTableDataRead;

import ReadingTableData.ReadDataFromTable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableDataReadTest extends ReadDataFromTable {

    @Test
    public void tableRead() throws InterruptedException {
        driver.get("https://www.w3schools.com/sql/sql_select.asp");
        Thread.sleep(5000);
        readTable();
        Assert.assertEquals("Mataderos 2312",readTable());
    }
    @Test
    public void failedTest(){
        failed();
    }
}

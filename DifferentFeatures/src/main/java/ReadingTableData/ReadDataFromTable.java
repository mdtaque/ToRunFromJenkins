package ReadingTableData;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ReadDataFromTable extends CommonAPI {

    public String readTable(){
        //List<String> list = getTextFromWebElements(".w3-table-all notranslate");
        String cellData = driver.findElement(By.cssSelector(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(4)")).getText();
        //String cellData = getTextByCss(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(4)");
//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        System.out.println(cellData);
        return cellData;
    }
    public void failed(){
        String data = null;
        Assert.assertEquals(data, "65");
    }
}

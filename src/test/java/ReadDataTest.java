import com.utils.ExcelReader;
import com.utils.GetExcelData;
import com.utils.ReadExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class ReadDataTest {
    private final ReadExcel readExcel = new ReadExcel();

    @DataProvider(parallel = true)
    public Object[] getData() {
//        List<ExcelReader> testData = GetExcelData.getGetTestData();
//        return testData.toArray();
         return readExcel.getReadExcelData(ExcelReader.class, "src/test/resources/Excel.xlsx", "Sheet1").toArray();
    }

    @Test(dataProvider = "getData")
    public void abc(ExcelReader data){
        System.out.println(data);
    }

}

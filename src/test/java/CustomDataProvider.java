import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "loginDatprovider")
    public Object[][] getData()
    {
        Object[][] data= {{"pjain@ijonaservices.com","1"},{"pjain@gmail.com","1"}};
        return data;
    }

}

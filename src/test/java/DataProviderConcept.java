import org.testng.annotations.Test;

public class DataProviderConcept {

    @Test(dataProvider = "loginDatprovider", dataProviderClass = CustomDataProvider.class)
    public void loginData(String email, String pswd)
    {
        System.out.println(email+" "+pswd);
    }
/*
    @DataProvider(name = "loginDatprovider")
    public Object[][] getData()
    {
        Object[][] data= {{"pjain@ijonaservices.com","1"},{"pjain@gmail.com","1"}};
        return data;
    }*/
}

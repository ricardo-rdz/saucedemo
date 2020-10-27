import org.testng.annotations.DataProvider;

public class DataProviderClass {

	
	@DataProvider(name = "authenticationData")
	public static  Object[][] getData() {

		Object[][] data = new Object[1][2];
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";

		return data; 
		
				
	}
	
	@DataProvider(name = "wrongData")
	public static  Object[][] getwrongData() {

		Object[][] data = new Object[1][2];
		data[0][0] = "wrong_user";
		data[0][1] = "secret_sauce";

		return data;
	}

	@DataProvider(name="userInfo")
	public static Object[][] getUserInfo(){

		Object[][] data = new Object[1][3];
		data[0][0] = "first";
		data[0][1] = "second";
		data[0][2] = "45060";

		return data;
	}
	
	
}

package testng_Demo;


import org.testng.annotations.DataProvider;


public class DataProviderDemo2 {
	// for three keyword combination 
		// 1. India  QutubMinar
		//2. Agra Tajmahal
		//3. Hyderabad Charminar
		
		@DataProvider(name ="searchDataSet")
		public Object[][] searchData() {
			Object[][] searchKeyword = new Object[3][2];
			searchKeyword[0][0]="India";
			searchKeyword[0][1]="QutubMinar";
			searchKeyword[1][0]="Agra";
			searchKeyword[1][1]="TajMahal";
			searchKeyword[2][0]="Hyderabad";
			searchKeyword[2][1]="Charminar";
		
			return searchKeyword;
		}
		          
		
}

package Important_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_WebTable {
public static void main(String[] args) {
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("file:///C:/table.html");  // your table URL
	        // 1️⃣ Locate the table
	        WebElement table = driver.findElement(By.id("productTable"));

	        // 2️⃣ Get all rows
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        System.out.println("Total Rows: " + rows.size());

	        // 3️⃣ Get total columns (from header row)
	        List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
	        System.out.println("Total Columns: " + columns.size());

	        // 4️⃣ Read a specific cell (2nd row, 1st column)
	        String cellValue = rows.get(1).findElements(By.tagName("td")).get(0).getText();
	        System.out.println("Cell Value (Row 2 Col 1): " + cellValue);

	        // 5️⃣ Read full table
	        System.out.println("\n===== Full Table =====");
	        for (int r = 0; r < rows.size(); r++) {
	            List<WebElement> cols;

	            // header row uses <th>, others <td>
	            if (r == 0) {
	                cols = rows.get(r).findElements(By.tagName("th"));
	            } else {
	                cols = rows.get(r).findElements(By.tagName("td"));
	            }

	            for (WebElement col : cols) {
	                System.out.print(col.getText() + "  ");
	            }
	            System.out.println();
	        }

	        // 6️⃣ Dynamic Table Example: Find price of "Book"
	        for (int i = 1; i < rows.size(); i++) {
	            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

	            if (cols.get(0).getText().equals("Book")) {
	                System.out.println("\nPrice of Book = " + cols.get(1).getText());
	            }
	        }

	        driver.quit();
	
}
}

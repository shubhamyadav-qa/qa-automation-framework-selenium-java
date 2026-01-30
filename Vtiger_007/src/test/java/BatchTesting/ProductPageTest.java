package BatchTesting;
import org.testng.annotations.*;
public class ProductPageTest {

	@Test
	public void  AddProductToWishList() {
		System.out.println("product added to wishlist successfully ");
	}
	
	@Test
	public void  AddProductToCart() {
		System.out.println("product added to cart successfully ");
	}
	
	@Test
	public void  SelectQuantity() {
		System.out.println("select quantity successfully ");
	}
	
}

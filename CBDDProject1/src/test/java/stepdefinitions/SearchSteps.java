package stepdefinitions;

import org.testng.Assert;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	Product product;
	Search search;
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Step 1: I am on the search page");
	}

	@When("I search for a product name {string} and price {int}")
	public void i_search_for_a_product_name_and_price(String productName, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2: Search the product name:" +productName+ "price:" +price);
		product = new Product(productName,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3: product:"+productName+"is displayed");
		
		search = new Search();
		String name=search.displayProduct(product);
		System.out.println("Search product is:" +name);
		Assert.assertEquals(product.getProductName(), name);
		
	}


}

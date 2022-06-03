package features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	@Given("^I visit the website as a guest user$")
    public void i_visit_the_website_as_a_guest_user()  {
		System.out.println("Given --I visit the website as a guest user");
        
    }

    @When("^I select the books options from the search dropdown$")
    public void i_select_the_books_options_from_the_search_dropdown() {
        System.out.println("When--I select the books options from the search dropdown");
    }

    @When("^I select the baby options from the search dropdown$")
    public void i_select_the_baby_options_from_the_search_dropdown()  {
    	System.out.println("When --I select the baby options from the search dropdown");
        
    }

    @Then("^I should see the page having heading Amazon Best Reads is getting displayed$")
    public void i_should_see_the_page_having_heading_amazon_best_reads_is_getting_displayed()  {
       System.out.println("Then--I should see the page having heading Amazon Best Reads is getting displayed");
    }

    @Then("^I should see the page having heading as Offers on Baby products is getting displayed$")
    public void i_should_see_the_page_having_heading_as_offers_on_baby_products_is_getting_displayed() {
        System.out.println("Then --I should see the page having heading as Offers on Baby products is getting displayed");
    }

    @And("^I click on search icon option$")
    public void i_click_on_search_icon_option()  {
    	System.out.println("And -- I click on search icon option");
        
    }

    @But("^I should not see other category products$")
    public void i_should_not_see_other_category_products()  {
        System.out.println("But--I should not see other category products");
    }
	
	
}

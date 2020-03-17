package StepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static StepDefination.Hooks.driver;

import javax.naming.directory.SearchResult;

import POM.HomePage;
import POM.LoginPage;
import POM.searchResultspage;

public class Stepdefination {
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage = new HomePage();
	searchResultspage srpage = new searchResultspage();
	
	 	@Given("^User visits the website$")
	    public void user_visits_the_website() throws Throwable {
	       driver.get("https://www.myntra.com/");
	    }

	    @Then("^User login to the myntra$")
	    public void user_login_to_the_myntra() throws Throwable {
	        loginpage.clickOnLoginButton();
	        loginpage.enterTheUsernameandPassword();
	    }

	    @And("^User search for the products$")
	    public void user_search_for_the_products() throws Throwable {
	      homepage.searchforproducts();
	      homepage.selectgender();
	      homepage.selectBrand();
	    }

	    @And("^User select the product from the search results$")
	    public void user_select_the_product_from_the_search_results() throws Throwable {
	    	srpage.selectediteam();
	    }

	    @And("^User get the all details of product$")
	    public void user_get_the_all_details_of_product() throws Throwable {
	    	srpage.windowshandle();
	    	srpage.selectSize();
	    }

	    @And("^User add the product to cart$")
	    public void user_add_the_product_to_cart() throws Throwable {
	    	 srpage.clickOnAddToBagbutton();
	    }

	    @Then("^User click on the buy the product$")
	    public void user_click_on_the_buy_the_product() throws Throwable {
	    	 srpage.clickOnGotoBag();
	    }

	    @And("^User logout from the website$")
	    public void user_logout_from_the_website() throws Throwable {
	       srpage.logoutfromwebsite();
	    }

}

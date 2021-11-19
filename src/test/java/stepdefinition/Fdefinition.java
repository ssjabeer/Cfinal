package stepdefinition;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.Cfinal.Baseclass;
import com.Cfinal.Pomclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fdefinition extends Baseclass{
	Logger Log = Logger.getLogger(Fdefinition.class);
	
	public  String url;
	public static  String user;
	public static  String pass;
	

	@Given("^User need to launch Webpage$")
	public void user_need_to_launch_Webpage() throws Throwable {
	   browser("chrome");
	   getProperties();
	   url = prop.getProperty("url");
	   geturl(url);
	   System.out.println(url);
	    
	}

	@When("^User provides a valid username and password$")
	public static void user_provides_a_valid_username_and_password() throws Throwable {
	   PageFactory.initElements(driver, Pomclass.class);
	   BasicConfigurator.configure();
	   user = prop.getProperty("uid");
	   senddata(Pomclass.username, user);
	   pass = prop.getProperty("pwd");
	   senddata(Pomclass.password, pass);
	    
	}

	@Then("^click on signin$")
	public void click_on_signin() throws Throwable {
	    clickelement(Pomclass.login);
	}

	@Given("^Select your location from the list$")
	public void select_your_location_from_the_list() throws Throwable {
	    selectbyValue(Pomclass.Location, "London");
	}

	@When("^Select your hotel$")
	public void select_your_hotel() throws Throwable {
	   selectbyValue(Pomclass.Hotels, "Hotel Cornice");
	    
	}

	@When("^Select your room type$")
	public void select_your_room_type() throws Throwable {
	   selectbyValue(Pomclass.Roomtype, "Deluxe");
	    
	}

	@When("^select number of rooms you want$")
	public void select_number_of_rooms_you_want() throws Throwable {
	   selectbyVisibleText(Pomclass.NoofRooms, "2 - Two");
	    
	}

	@When("^Enter your Check in date when you need to book$")
	public void enter_your_Check_in_date_when_you_need_to_book() throws Throwable {
	   System.out.println("Check in date selected ");
	 }

	@When("^Enter Check out data when you leave the hotel$")
	public void enter_Check_out_data_when_you_leave_the_hotel() throws Throwable {
	   
	    Log.info("Check out date confirmed");
	}

	@When("^Select number of persons to stay$")
	public void select_number_of_persons_to_stay() throws Throwable {
	   selectbyVisibleText(Pomclass.Adults, "3 - Three");
	}

	@When("^Select if any child is there$")
	public void select_if_any_child_is_there() throws Throwable {
	    selectbyVisibleText(Pomclass.Children, "2 - Two");
	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
	   clickelement(Pomclass.search);
	 }

	@Given("^check hotel details$")
	public void check_hotel_details() throws Throwable {
	   Log.info("Hotels are available");
	    
	}

	@When("^click on selecthotel radio button$")
	public void click_on_selecthotel_radio_button() throws Throwable {
	   clickelement(Pomclass.radiobutton);
	    
	}

	@Then("^Move to Book hotel$")
	public void move_to_Book_hotel() throws Throwable {
	   clickelement(Pomclass.continuebutton);
	   Log.info("Navigating to Payment Section");
	}

	@Given("^Enter your First name$")
	public void enter_your_First_name() throws Throwable {
	   senddata(Pomclass.firstname, "Jabeer");
	    
	}

	@When("^Enter your Last name$")
	public void enter_your_Last_name() throws Throwable {
	   senddata(Pomclass.lastname, "Syed Youssuff");
	    
	}

	@When("^Entr your Address$")
	public void entr_your_Address() throws Throwable {
	   senddata(Pomclass.address, "cambridge, London");
	    
	}

	@When("^Enter a Valid CREDITCARD NUMBER$")
	public void enter_a_Valid_CREDITCARD_NUMBER() throws Throwable {
	   senddata(Pomclass.creditcard, "9988776655443322");
	   
	    
	}

	@When("^Select your Card type$")
	public void select_your_Card_type() throws Throwable {
	   selectbyVisibleText(Pomclass.creditcardtype, "Master Card");
	    
	}

	@When("^Select your valid Expiry month$")
	public void select_your_valid_Expiry_month() throws Throwable {
	   selectbyValue(Pomclass.Expirymonth, "7");
	    
	}

	@When("^Select your Valid Expiry Year$")
	public void select_your_Valid_Expiry_Year() throws Throwable {
	   selectbyValue(Pomclass.Expiryyear, "2022");
	    
	}

	@When("^Enter your CVV number of the selected card$")
	public void enter_your_CVV_number_of_the_selected_card() throws Throwable {
	   senddata(Pomclass.cvv, "786");
	    
	}

	@Then("^Click on booknow button$")
	public void click_on_booknow_button() throws Throwable {
	    
		clickelement(Pomclass.book);
		Thread.sleep(3000);
	}

	@Given("^Navigate to Booking confirm page$")
	public void navigate_to_Booking_confirm_page() throws Throwable {
		iwait();
		clickelement(Pomclass.itenary);
		Thread.sleep(3000);
	    
	}

	@When("^Take a screenshot of confirmed booking$")
	public void take_a_screenshot_of_confirmed_booking() throws Throwable {
		Thread.sleep(3000);
		totakeScreenshot("Confirmation");
	    
	}

	@Then("^Click on Logout Button$")
	public void click_on_Logout_Button() throws Throwable {
	   clickelement(Pomclass.logout);
	    
	}
}

package com.Cfinal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Pomclass {

	@FindBy (xpath = "//input[@name='username']")
	public static WebElement username;
	
	@FindBy (xpath = "//input[@id='password']")
	public static WebElement password;
	
	@FindBy (xpath = "//input[@id='login']")
	public static WebElement login;
	
	@FindBy (xpath = "//select[@name='location']")
	public static WebElement Location;
	
	@FindBy (xpath = "//select[@id='hotels']")
	public static WebElement Hotels;
	
	@FindBy (xpath = "//select[@name='room_type']")
	public static WebElement Roomtype;
	
	@FindBy (xpath = "//select[@id='room_nos']")
	public static WebElement NoofRooms;
	
	@FindBy (xpath = "//select[@id=\"adult_room\"]")
	public static WebElement Adults;
	
	@FindBy (xpath = "//select[@name='child_room']")
	public static WebElement Children;
	
	@FindBy (xpath = "//input[@value='Search']")
	public static WebElement search; 
	
	@FindBy (xpath = "//input[@type='radio']")
	public static WebElement radiobutton;
	
	@FindBy (xpath = "//input[@name='continue']")
	public static WebElement continuebutton;
	
	@FindBy (xpath = "//input[@id='first_name']")
	public static WebElement firstname;
	
	@FindBy (xpath = "//input[@id='last_name']")
	public static WebElement lastname;
	
	@FindBy (xpath = "//textarea[@id='address']")
	public static WebElement address;
	
	@FindBy (xpath = "//input[@id='cc_num']")
	public static WebElement creditcard;
	
	@FindBy (xpath = "//select[@id='cc_type']")
	public static WebElement creditcardtype;
	
	@FindBy (xpath = "//select[@id='cc_exp_month']")
	public static WebElement Expirymonth;
	
	@FindBy (xpath = "//select[@name='cc_exp_year']")
	public static WebElement Expiryyear;
	
	@FindBy (xpath = "//input[@id='cc_cvv']")
	public static WebElement cvv;
	
	@FindBy (xpath = "//input[@id='book_now']")
	public static WebElement book;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	public static WebElement itenary;
	
	@FindBy (xpath = "//input[@id='logout']")
	public static WebElement logout;
	
	
	
}

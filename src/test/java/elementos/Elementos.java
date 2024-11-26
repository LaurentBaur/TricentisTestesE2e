package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	//HomePage 
	public By automobile = By.id("nav_automobile");
	
	//Enter Vehicule Data
	public By make = By.id("make");
	public By enginePerformance = By.id("engineperformance");
	public By dataOfManifacture = By.id("dateofmanufacture");
	public By numberOfSeats = By.id("numberofseats");
	public By fuelType = By.id("fuel");
	public By listPrice = By.id("listprice");
	public By licensePlateNumber = By.id("licenseplatenumber");
	public By annualMileage = By.id("annualmileage");
	public By btnNextVehiculeData = By.id("nextenterinsurantdata");
	
	//Enter Insurant Data
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By dateOfBirth = By.id("birthdate");
	public By genderMale = By.xpath("//*[text()='Male']/span");
	public By genderFemale = By.xpath("//*[text()='Female']/span");
	public By streetAddress = By.id("streetaddress");
	public By country = By.id("country");
	public By zipCode = By.id("zipcode");
	public By city= By.id("city");
	public By occupation = By.id("occupation");
	public By speeding = By.xpath("//*[text()=' Speeding']/span");
	public By bungeejumping = By.xpath("//*[text()=' Bungee Jumping']/span");
	public By cliffdiving = By.xpath("//*[text()=' Cliff Diving']/span");
	public By skydiving = By.xpath("//*[text()=' Skydiving']/span");
	public By other = By.xpath("//*[text()=' Other']/span");
	public By website = By.id("website");
	public By btnPrev = By.id("preventervehicledata");
	public By btnNextInsuranceData = By.id("nextenterproductdata");
	
	//Enter Product Data
	public By startData = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By meritRating = By.id("meritrating");
	public By damageInsurance = By.id("damageinsurance");
	public By optionalProducts = By.id("EuroProtection");
	public By courtesyCar = By.id("courtesycar");
	public By btnPrevProductData = By.id("preventerinsurancedata");
	public By btnNextProductData = By.id("nextselectpriceoption");
	
	//Select Price Option
	public By selectOptionUltimate = By.cssSelector("th[colspan='4'] input[type='radio'][value='Ultimate']");
	public By btnNextPriceOption = By.id("nextsendquote");
	
	//Send Quote
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confirmPassword = By.id("confirmpassword");
	public By btnPrevSendQuote = By.id("prevselectpriceoption");
	public By btnSendQuote = By.id("sendemail");
	public By mensagemConfirmacao = By.xpath("//h2[text()='Sending e-mail success!']");
	public By btnOkSentQuote = By.xpath("//div[@class='sa-confirm-button-container']");
	
	
}

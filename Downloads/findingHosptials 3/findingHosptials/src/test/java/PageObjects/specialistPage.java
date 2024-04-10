package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class specialistPage extends BasePage {

	public specialistPage(WebDriver driver) {
		super(driver);
		
	}
	
    //locating dropDown PatientStories
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[2]")
public	WebElement patientStoriesDropdownClick;
	
	//locating dropDown Experience
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]")
public	WebElement experienceDropdownClick;
	
	//locating dorpDown allFilters
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[4]/i")
public	WebElement allFiltersClick;
	
	//locating dropDown sortBy
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[6]/div/div/div/span")
public 	WebElement sortByClick;//not locating

	//location dropDownList patientStories
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[2]/ul/li")
public 	List<WebElement> patientStories;
	
	//location dropDownList experience
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[3]/ul/li")
public	List<WebElement> experience;
    
	//locating dropDownList Fees
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[1]/div/label[1]/span/span")
public	List<WebElement> feeDropdown;//appollo white dental
	
	//locating dropDownList availability
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[2]/div/div[2]/div/label/span")
public	List<WebElement> availability;//frr drp
	
	//locating dropDownList sortBy
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div/div/header/div[1]/div/div[6]/div/div/div/ul/li")
public	List<WebElement> sortBy;//not locating
	
	//locating doctorDetials
	@FindBy(xpath="//*[@class=\"info-section\"]")
public	List<WebElement> doctorDetials;
	
	//locating forCoperate icon
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/span/span[2]")
public	WebElement forCorporatesIcon;
	
	//locating health and wellness plan
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[3]/div[1]/span/div/div[1]/a")
public	WebElement healthandWellness;
	
	//locating selected location
	@FindBy(xpath="//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[1]/div[1]/h1")
	public WebElement selectedLocation;
	
	//locating selected specialist
	@FindBy(xpath="//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div[1]/span")
	public WebElement selectedSpecialist;
	
	public String getSelectedLocation() {
		return selectedLocation.getText();
	}
	
	public String getSelectedSpecialist() {
		return selectedSpecialist.getText();
	}
	public void dropDownclick(WebElement dropDown) {
		dropDown.click();
	}
	
	public void selectDropdown(List<WebElement> dropDown) {
		dropDown.get(0).click();
	}
	
	public List<String> getString(List<WebElement> doc){
		List<String> s=new ArrayList<String>();
		for(int i=0;i<5;i++) {
			s.add(doc.get(i).getText());
			
		}
		return s;
	}
	
	public void printDetials() {
		for(int i=0;i<5;i++) {
			System.out.println(doctorDetials.get(i).getText());
		}
	}
	
	public void openHealthform() throws InterruptedException {
		forCorporatesIcon.click();
		Thread.sleep(2000);
		healthandWellness.click();
	}
}

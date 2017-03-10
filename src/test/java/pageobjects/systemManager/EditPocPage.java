package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import capribedsidetransfusionpageobjects.EndTransfusionPage;
import common.IEDriver;

public class EditPocPage extends IEDriver {
	private static WebElement element = null;
	EditPocPage editpocpage = PageFactory.initElements(IEDriver.driver, EditPocPage.class);

	// Section Secondary Identifier
	public WebElement utilizeSecondaryIdentifier() {
		element = driver.findElement(By.id("lstSecondaryIndentifier"));
		return element;
	}

	public void selectUtilizeSecondaryIdentifier(String a) {
		//PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = editpocpage.utilizeSecondaryIdentifier();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	public static WebElement secondaryIdName() {
		element = driver.findElement(By.id("txtSecondaryIdName"));
		return element;
	}

	public static WebElement secondaryIdFormat() {
		element = driver.findElement(By.id("txtSecondaryIdFormat"));
		return element;
	}

	public  WebElement turnOffSecondaryIdCheckForTxWristband() {
		element = driver.findElement(By.id("lstNoTxWristbandSecIdCheck"));
		return element;
	}

	public void selectOptionForTurnOffSecondaryIdCheckForTxWristband(String a) {
		//PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = editpocpage.turnOffSecondaryIdCheckForTxWristband();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	// Breast Milk Setting
	public static WebElement requireScanInRecieveBtl() {
		element = driver.findElement(By.id("lstRequireScanReceive"));
		return element;
	}

	public static WebElement requireScanningInEndTransfusion() {
		element = driver.findElement(By.id("ListRequireScanEndTx"));
		return element;
	}

	public void selectOptionRequireScanningInEndTransfusion(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.checkCenterCode();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement checkCenterCode() {
		element = driver.findElement(By.id("ListCenterCodes"));
		return element;
	}

	public void selectYesOrNoForCheckCenterCode(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.checkCenterCode();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement checkPatientName() {
		element = driver.findElement(By.id("ListPatientNameForTransfusions"));
		return element;
	}

	public void selectOptionForCheckPatientName(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.checkPatientName();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement checkDisplayCommentsInStartTransfusion() {
		element = driver.findElement(By.id("ListStartComments"));
		return element;
	}

	public void selectOptionForDisplayCommentsInStartTransfusion(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.checkDisplayCommentsInStartTransfusion();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement requireCosignature() {
		element = driver.findElement(By.id("ListTransfusionCosignRequired"));
		return element;
	}

	public static WebElement requireCosignOnBloodTypeMismatch() {
		element = driver.findElement(By.id("ListRequireCosign"));
		return element;
	}

	public void selectOptionForRequireCosignOnBloodTypeMismatch(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.displayBothCelsiusAndFahrenheitFieldsForTemperature();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	public void selectOptionForRequireCosignature(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.requireCosignature();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement displayCommentsInRapidStartTransfusion() {
		element = driver.findElement(By.id("ListRapidStartComments"));
		return element;
	}

	public void selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.displayCommentsInRapidStartTransfusion();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement promptForUnitNumberDivisionField() {
		element = driver.findElement(By.id("ListUnitNumerDivision"));
		return element;
	}

	public void selectOptionPromptForUnitNumberDivisionField(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.promptForUnitNumberDivisionField();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement promptForVolume() {
		element = driver.findElement(By.id("ListPromptTransVolume"));
		return element;
	}

	public void selectOptionPromptForVolume(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.promptForVolume();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	// Checks Modify link.
	public static WebElement linkModifyChecksTransfusionSettings() {
		element = driver.findElement(By.id("lnkPreChecks"));
		return element;
	}

	public static WebElement checkboxCheckTheOriginalTransfusionOrder() {
		element = driver.findElement(By.id("dlItems__ctl2_cboxItem"));
		return element;
	}

	public static WebElement linkBackModifyChecksTransfusionSettings() {
		element = driver.findElement(By.id("cmdOK"));
		return element;
	}

	// Vital Signs Section
	public static WebElement collectVitalSignsOnStartTransfusion() {
		element = driver.findElement(By.id("ListCollOnBegin"));
		return element;
	}

	public void selectOptionForCollectVitalSignsOnStartTransfusion(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.displayCommentsInRapidStartTransfusion();
		Select sel = new Select(wb);
		sel.selectByValue(a);
	}

	public static WebElement collectVitalSignsOnEndTransfusion() {
		element = driver.findElement(By.id("ListCollOnEnd"));
		return element;
	}

	public void selectOptionForCollectVitalSignsOnEndTransfusion(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.collectVitalSignsOnEndTransfusion();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	public static WebElement displayHeartRateSite() {
		element = driver.findElement(By.id("ListDisplayHeartRateSite"));
		return element;
	}

	public void selectOptionForDisplayHeartRateSite(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.displayHeartRateSite();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	public static WebElement displayBloodPressureMethod() {
		element = driver.findElement(By.id("ListDisplayBloodPressureMethod"));
		return element;
	}

	public void selectOptionForDisplayBloodPressureMethod(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.displayBloodPressureMethod();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	public static WebElement displayBothCelsiusAndFahrenheitFieldsForTemperature() {
		element = driver.findElement(By.id("ListAcceptAltTempUnits"));
		return element;
	}

	public void selectOptionForDisplayBothCelsiusAndFahrenheitFieldsForTemperature(String a) {
		PageFactory.initElements(IEDriver.driver, EditPocPage.class);
		WebElement wb = EditPocPage.displayBothCelsiusAndFahrenheitFieldsForTemperature();
		Select sel = new Select(wb);
		sel.selectByVisibleText(a);
	}

	public static WebElement buttonConfirm() {
		element = driver.findElement(By.id("cmdOKUp"));
		return element;
	}

	public static WebElement buttonCancel() {
		element = driver.findElement(By.id("btnCancelUp"));
		return element;
	}

}

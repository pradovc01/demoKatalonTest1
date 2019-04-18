import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/HomePage/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/LoginPage/emailTxt'), 'pradovc01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/passwordTxt'), '15vY55HfNEocmsnUm6x6eA==')

WebUI.click(findTestObject('Object Repository/LoginPage/sigInButton'))

WebUI.click(findTestObject('Object Repository/MyAccountPage/addressLink'))

WebUI.click(findTestObject('Object Repository/MyAddressPage/updateButton'))

WebUI.setText(findTestObject('Object Repository/EditAddressPage/address1TextBox'), newAdrress)

WebUI.click(findTestObject('Object Repository/EditAddressPage/SaveButton'))

WebUI.waitForElementVisible(findTestObject('Object Repository/MyAddressPage/addressText'), 10)

def address = WebUI.getText(findTestObject('Object Repository/MyAddressPage/addressText'))

//Assert.AssertTrue(address.equals(newAdrress))
WebUI.verifyMatch(address, newAdrress, true)

assert (address.equals(newAdrress))

WebUI.click(findTestObject('Object Repository/MyAddressPage/a_SignLink'))

WebUI.closeBrowser()


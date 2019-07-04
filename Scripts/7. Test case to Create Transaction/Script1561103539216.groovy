import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
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

WebUI.delay(10, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Click Menu Option/Page_Clozio  Transactions/span'))

not_run: WebUI.click(findTestObject('Click Transaction Menu Option/Page_Clozio  Transactions/span_Transactions'))

not_run: WebUI.click(findTestObject('Create Transaction/Start New Transaction button'))

WebUI.navigateToUrl('https://staging.cloz.io/app/#/home/transactions')

WebUI.delay(10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Create Transaction/Start New Transaction button'))

WebUI.delay(10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Create Transaction/Click on I for google places'))

WebUI.delay(4)

WebUI.setText(findTestObject('Create Transaction/StreetNo'), '9889')

WebUI.setText(findTestObject('Create Transaction/Address'), 'Cypresswood Dr ')

WebUI.setText(findTestObject('Create Transaction/City'), 'Houston')

WebUI.setText(findTestObject('Create Transaction/State'), 'TX')

WebUI.setText(findTestObject('Create Transaction/ZipCode'), '77070')

WebUI.click(findTestObject('Create Transaction/Submit button'))

WebUI.setText(findTestObject('Create Transaction/Escrow number'), '77070')

WebUI.selectOptionByValue(findTestObject('Create Transaction/Select Stage'), '1: 1', true)

WebUI.selectOptionByValue(findTestObject('Create Transaction/Select role'), '2: 13', true)

WebUI.setText(findTestObject('Create Transaction/Date of offer'), '6/19/2019')

WebUI.setText(findTestObject('Create Transaction/Description'), '9889 Cypresswood Dr,Houston,TX')

WebUI.click(findTestObject('Create Transaction/Create transaction button'))

WebUI.scrollToElement(findTestObject('Create Transaction/Sellers Team Contact Section'), 10)

WebUI.click(findTestObject('Create Transaction/Sellers team contact drop down'))

WebUI.delay(10, FailureHandling.OPTIONAL)


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

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('Abhi_Page_Clozio Login/input_LOGIN_email'), varUserName)

WebUI.setText(findTestObject('Abhi_Page_Clozio Login/input_Max 254 characters_password'), varPassword)

WebUI.click(findTestObject('Abhi_Page_Clozio Login/span_LOGIN'))

not_run: WebUI.callTestCase(findTestCase('Login/Login to Logout'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


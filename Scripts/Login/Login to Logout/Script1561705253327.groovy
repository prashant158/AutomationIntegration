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

WebUI.callTestCase(findTestCase('Login/Login successful'), [('varUserName') : GlobalVariable.usrName, ('varPassword') : GlobalVariable.pwd], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.verifyElementVisible(findTestObject('Abhi_Page_Clozio Transactions/span'))

WebUI.waitForElementVisible(findTestObject('Abhi_Page_Clozio Transactions/span'), 30)

WebUI.verifyElementClickable(findTestObject('Abhi_Page_Clozio Transactions/span'))

WebUI.delay(2)

WebUI.click(findTestObject('Abhi_Page_Clozio Transactions/span'))

WebUI.waitForElementClickable(findTestObject('Abhi_Page_Clozio Transactions/span_Logout'), 0)

WebUI.click(findTestObject('Abhi_Page_Clozio Transactions/span_Logout'))


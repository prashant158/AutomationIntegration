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

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('Abhi_Profile/Menu_button'))

WebUI.waitForElementClickable(findTestObject('Abhi_Teams/Teams_menu'), 20)

WebUI.click(findTestObject('Abhi_Teams/Teams_menu'))

WebUI.click(findTestObject('Abhi_Teams/Create Team_button'))

WebUI.setText(findTestObject('Abhi_Teams/Team Name_field'), 'ABCDEFG')

WebUI.click(findTestObject('Abhi_Teams/Select User_field'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Abhi_Teams/Team Owner_radio button'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Abhi_Teams/Create_button'))

WebUI.delay(5)

WebUI.click(findTestObject('Abhi_Profile/Menu_button'))

WebUI.waitForElementClickable(findTestObject('Abhi_Teams/Teams_menu'), 20)

WebUI.click(findTestObject('Abhi_Teams/Teams_menu'))

WebUI.delay(5)


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

WebUI.waitForElementClickable(findTestObject('Abhi_Users/Users_menu'), 20)

WebUI.click(findTestObject('Abhi_Users/Users_menu'))

WebUI.click(findTestObject('Abhi_Users/i icon_button'))

WebUI.setText(findTestObject('Abhi_Users/First name_field'), 'Vimalkumar')

WebUI.setText(findTestObject('Abhi_Users/Last name_field'), 'Bohra')

WebUI.setText(findTestObject('Abhi_Users/Phone number_field'), '(987) 654-4321')

WebUI.setText(findTestObject('Abhi_Users/Real estate license_field'), 'qwerty12345')

WebUI.click(findTestObject('Abhi_Users/State of license_DDL'))

WebUI.click(findTestObject('Abhi_Users/Select organization_DDL'))

WebUI.click(findTestObject('Abhi_Users/Save_button'))

WebUI.setText(findTestObject('Abhi_Users/DateVar_calender'), '07-07-2019')

WebUI.click(findTestObject('Abhi_Users/Save 1_button'))

WebUI.click(findTestObject('Abhi_Users/Select team_DDL'))

WebUI.delay(5)


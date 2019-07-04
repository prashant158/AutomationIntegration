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

WebUI.callTestCase(findTestCase('Transactions/Create a transaction'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Abhi_Transactions_Appointment/Add_button'))

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/Title_field'), 'Test Appointment')

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/Location_field'), 'Texas')

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/Start date_calender'), '07-07-2019')

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/Start time_DDL'), '12:23')

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/End date_calender'), '17-07-2019')

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/End time_DDL'), '12:22')

WebUI.setText(findTestObject('Abhi_Transactions_Appointment/Reminder_DDL'), '05:00')

WebUI.click(findTestObject('Abhi_Transactions_Appointment/Save_button'))

WebUI.delay(5)


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

WebUI.delay(10, FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://staging.cloz.io/app/#/home/profile')

WebUI.setText(findTestObject('Check or Update Profile/First name'), 'Katalon')

WebUI.setText(findTestObject('Check or Update Profile/Last name'), 'Script')

WebUI.setText(findTestObject('Check or Update Profile/Real estate license'), 'wwwwwwwww')

WebUI.click(findTestObject('Check or Update Profile/State'))

WebUI.click(findTestObject('Check or Update Profile/Contact type'))

WebUI.setText(findTestObject('Check or Update Profile/Contact number'), '7894561326')

WebUI.click(findTestObject('Check or Update Profile/Save profile details'))


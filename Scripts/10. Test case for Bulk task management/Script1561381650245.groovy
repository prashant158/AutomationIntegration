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

WebUI.callTestCase(findTestCase('2. Test case to Login into system'), [('Username') : 'asd@winjit.com', ('Password') : 'Winjit@123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://staging.cloz.io/app/#/home/action-item')

WebUI.delay(10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Bulk task management/Select action item'))

WebUI.click(findTestObject('Bulk task management/Update action items'))

WebUI.click(findTestObject('Bulk task management/Update title'))

WebUI.setText(findTestObject('Bulk task management/New title'), 'Updated using Katalon')

WebUI.click(findTestObject('Bulk task management/Update start date'))

WebUI.setText(findTestObject('Bulk task management/Start date'), '24-06-2019')

WebUI.click(findTestObject('Bulk task management/Update description'))

WebUI.setText(findTestObject('Bulk task management/Description'), 'Katalon script')

WebUI.click(findTestObject('Bulk task management/Update deadline date'))

WebUI.setText(findTestObject('Bulk task management/Deadline date'), '24-06-2019')

WebUI.click(findTestObject('Bulk task management/Update stage'))

WebUI.click(findTestObject('Bulk task management/New stage'))

WebUI.click(findTestObject('Bulk task management/Update user'))

WebUI.click(findTestObject('Bulk task management/New user'))

WebUI.click(findTestObject('Bulk task management/Update team visibility'))

WebUI.click(findTestObject('Bulk task management/New team visibility'))

WebUI.click(findTestObject('Bulk task management/Update data'))


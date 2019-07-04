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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.cloz.io/app/#/register-user')

WebUI.setText(findTestObject('Register new user/Register user email address'), 'NewUserele@gm.com')

WebUI.setText(findTestObject('Register new user/Register user password'), 'Winjit@123')

WebUI.setText(findTestObject('Register new user/Register Retype password'), 'Winjit@123')

WebUI.click(findTestObject('Register new user/Register user register button'))

WebUI.delay(10, FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('6. Test case to Skip Tour'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('3. Test case to Logout from system'), [:], FailureHandling.STOP_ON_FAILURE)


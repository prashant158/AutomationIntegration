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

not_run: WebUI.verifyElementClickable(findTestObject('Abhi_Profile/Profile_menu'))

WebUI.waitForElementClickable(findTestObject('Abhi_Profile/Profile_menu'), 20)

not_run: WebUI.delay(5)

WebUI.click(findTestObject('Abhi_Profile/Profile_menu'))

WebUI.setText(findTestObject('Abhi_Profile/Name_field'), 'Abhijeet')

WebUI.setText(findTestObject('Abhi_Profile/Surname_field'), 'Kulthe')

WebUI.setText(findTestObject('Abhi_Profile/Real estate license_field'), 'qwerty12345')

WebUI.click(findTestObject('Abhi_Profile/Country name_DDL'))

WebUI.click(findTestObject('Abhi_Profile/Phone type1_DDL'))

WebUI.setText(findTestObject('Abhi_Profile/Phone type1 data_field'), '(912) 144-2332')

WebUI.click(findTestObject('Abhi_Profile/contact_button'))

WebUI.click(findTestObject('Abhi_Profile/Phone type2_DDL'))

WebUI.setText(findTestObject('Abhi_Profile/Phone type2 data_field'), '(912) 144-2356')

not_run: WebUI.uploadFile(findTestObject('Upload File'), 'C:\\Users\\AbhijitKulte\\Downloads\\download')

not_run: FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')

not_run: WebUI.verifyMatch(FilePath, 'C:\\fakepath\\download.jpg', false)

WebUI.click(findTestObject('Abhi_Profile/Save_button'))

WebUI.delay(5)


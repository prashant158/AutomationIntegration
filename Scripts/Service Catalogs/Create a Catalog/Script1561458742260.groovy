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

WebUI.waitForElementClickable(findTestObject('Abhi_Profile/Menu_button'), 20)

WebUI.click(findTestObject('Abhi_Profile/Menu_button'))

WebUI.waitForElementClickable(findTestObject('Abhi_Service Catalogs/Service Catalog_menu'), 20)

WebUI.click(findTestObject('Abhi_Service Catalogs/Service Catalog_menu'))

WebUI.waitForElementClickable(findTestObject('Abhi_Service Catalogs/Catalog_button'), 20)

WebUI.click(findTestObject('Abhi_Service Catalogs/Catalog_button'))

WebUI.setText(findTestObject('Abhi_Service Catalogs/Service catalog name_field'), 'Test catalog')

WebUI.waitForElementClickable(findTestObject('Abhi_Service Catalogs/Seller agent_field'), 20)

WebUI.click(findTestObject('Abhi_Service Catalogs/Seller agent_field'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Seller agent_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Buyer agent_field'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Buyer agent_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Team_field'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Team_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Organization_field'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Organization_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Add 1_button'))

WebUI.setText(findTestObject('Abhi_Service Catalogs/Action item title1_field'), 'test title')

WebUI.setText(findTestObject('Abhi_Service Catalogs/Description1'), 'test description')

WebUI.setText(findTestObject('Abhi_Service Catalogs/Action item title2_field'), 'test title2')

WebUI.setText(findTestObject('Abhi_Service Catalogs/description2'), 'test description 2')

WebUI.setText(findTestObject('Abhi_Service Catalogs/Start date_calender'), '29-06-2019')

WebUI.setText(findTestObject('Abhi_Service Catalogs/Deadline date_calender'), '07-07-2019')

WebUI.click(findTestObject('Abhi_Service Catalogs/Select stage_DDL'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Abhi_Service Catalogs/Select team visibility_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Select user_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Select contact type_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Select team_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Select status_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Select action item type_DDL'))

WebUI.setText(findTestObject('Abhi_Service Catalogs/Next index_field'), 'end')

WebUI.click(findTestObject('Abhi_Service Catalogs/Select variable_DDL'))

WebUI.click(findTestObject('Abhi_Service Catalogs/Create_button'))

not_run: WebUI.delay(10)


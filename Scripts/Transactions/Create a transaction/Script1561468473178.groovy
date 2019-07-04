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

WebUI.waitForElementPresent(findTestObject('Abhi_Transactions/Start new transaction_button'), 20)

WebUI.waitForElementClickable(findTestObject('Abhi_Transactions/Start new transaction_button'), 20)

WebUI.click(findTestObject('Abhi_Transactions/Start new transaction_button'))

WebUI.waitForElementPresent(findTestObject('Abhi_Transactions/Google search i_button'), 20)

WebUI.waitForElementClickable(findTestObject('Abhi_Transactions/Google search i_button'), 20)

WebUI.click(findTestObject('Abhi_Transactions/Google search i_button'))

WebUI.setText(findTestObject('Abhi_Transactions/Street number_field'), '999')

WebUI.setText(findTestObject('Abhi_Transactions/Address_field'), 'Fashion Street')

WebUI.setText(findTestObject('Abhi_Transactions/City_field'), 'Dallas')

WebUI.setText(findTestObject('Abhi_Transactions/State_field'), 'Texas')

WebUI.setText(findTestObject('Abhi_Transactions/Zipcode_field'), '75001')

WebUI.click(findTestObject('Abhi_Transactions/Submit_button'))

WebUI.setText(findTestObject('Abhi_Transactions/Escrow number_field'), 'qwerty12345')

WebUI.click(findTestObject('Abhi_Transactions/Select stage_DDL'))

WebUI.click(findTestObject('Abhi_Transactions/Select role_DDL'))

WebUI.setText(findTestObject('Abhi_Transactions/Description'), 'Test')

not_run: WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Abhi_Transactions/Seller team DDL_icon'), 20)

WebUI.click(findTestObject('Abhi_Transactions/Seller team DDL_icon'))

WebUI.click(findTestObject('Abhi_Transactions/Seller team data_DDL'))

WebUI.click(findTestObject('Abhi_Transactions/Buyer team DDL_icon'))

WebUI.waitForElementClickable(findTestObject('Abhi_Transactions/Buyer team data_DDL'), 20)

WebUI.click(findTestObject('Abhi_Transactions/Buyer team data_DDL'))

WebUI.click(findTestObject('Abhi_Transactions/Escrow team DDL_icon'))

WebUI.click(findTestObject('Abhi_Transactions/Escrow team data_DDL'))

WebUI.click(findTestObject('Abhi_Transactions/Create transaction_button'))

not_run: WebUI.delay(10)


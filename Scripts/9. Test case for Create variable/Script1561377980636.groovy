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

WebUI.navigateToUrl('https://staging.cloz.io/app/#/home/variables')

WebUI.click(findTestObject('Create variable/Add variable'))

WebUI.setText(findTestObject('Create variable/Variable name'), 'Variableone')

WebUI.click(findTestObject('Create variable/Select data type'))

WebUI.setText(findTestObject('Create variable/Instructional text'), 'INST TEXT')

WebUI.click(findTestObject('Create variable/Allow yes'))

WebUI.click(findTestObject('Create variable/Save variable'))

WebUI.click(findTestObject('Create variable/Refresh grid'))


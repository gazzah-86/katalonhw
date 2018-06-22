import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('www.bbc.co.uk')

not_run: if (true) {
    not_run: System.getProperty('os.name') === 'windows'
}

not_run: WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.closeBrowser()

WebUI.openBrowser('www.bbc.co.uk')

WebUI.verifyElementPresent(findTestObject('BBC/button_Continue'), 5)

WebUI.takeScreenshot('BBC test')

WebUI.click(findTestObject('BBC/button_Continue'))

WebUI.scrollToPosition(186, 1008)

not_run: WebUI.verifyElementText(findTestObject('BBC/span_Home Secretary Rudd hits'), 'Home Secretary Rudd hits back at Tory Brexiteers')

not_run: WebUI.closeBrowser()


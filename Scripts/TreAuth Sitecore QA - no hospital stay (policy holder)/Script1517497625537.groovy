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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://bupa.portal.sitecore.qa.hwuat.co.uk')

WebUI.deleteAllCookies()

WebUI.openBrowser('https://bupa.portal.sitecore.qa.hwuat.co.uk')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Login to MembersWorld/div_X_2'), 
    5)

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Login to MembersWorld/div_X_2'))

WebUI.setText(findTestObject('TreAuth Sitecore/Login/input_signInUsername'), 'BI-6000-0180-9257')

WebUI.click(findTestObject('TreAuth Sitecore/Login/button_Next'))

WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/Login/input_password_update'), 2)

WebUI.setText(findTestObject('TreAuth Sitecore/Login/input_password_update'), 'P@ssword123')

WebUI.click(findTestObject('TreAuth Sitecore/Login/button_Next'))

WebUI.delay(10)

WebUI.navigateToUrl('https://bupa.portal.sitecore.qa.hwuat.co.uk/treatment-authorisation')

not_run: WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/TreAuth_menu'), 5)

not_run: WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/TreAuth_menu'))

WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/h2_Request treatment pre-appro'), 
    5)

WebUI.verifyElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/h2_Request treatment pre-appro'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/a_navigation-link'), 2)

not_run: WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/a_navigation-link'))

not_run: WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/h2_About the treatment_update'), 
    5)

not_run: WebUI.verifyElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/h2_About the treatment_update'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/a_navigation-link'))

not_run: WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/h2_Before you begin...'), 0)

not_run: WebUI.verifyElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/h2_Before you begin...'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/a_Start application (1)'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/div_valueRegion placeholder (1)'))

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/li_first_option_TreAuth'))

WebUI.delay(2)

WebUI.scrollToPosition(537, 219)

WebUI.verifyElementAttributeValue(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/div_contactEmailPreferencework'), 
    'aria-checked', 'true', 5)

WebUI.scrollToPosition(616, 478)

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/input_TreatmentCountryName'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation (1)/UK_country_flag'), 
    5)

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/li_United Kingdom'))

WebUI.scrollToPosition(530, 525)

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/input_treatmentStartDateDay'), 
    '11')

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/input_treatmentStartDateMonth'), 
    '06')

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/input_treatmentStartDateYear'), 
    '2018')

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/div_hospitalStayNo-module'))

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/button_Continue'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementPresent(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Calendar symptoms'), 
    5)

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/input_dateOfsymtomsDay'), 
    '30')

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/input_dateOfsymtomsMonth'), 
    '05')

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/input_dateOfsymtomsYear'), 
    '2018')

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/textarea_Diagnosis'), 'Bad back')

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/textarea_TreatmentRequired'), 'Massage')

WebUI.scrollToPosition(50, 60)

WebUI.setText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/textarea_TreatmentProvider'), 'Hospital')

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/TreAuth Continue step 2'))

WebUI.waitForElementVisible(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/TreAuth step 3 summary card'), 
    5)

WebUI.takeScreenshot()

WebUI.scrollToPosition(606, 629)

WebUI.takeScreenshot()

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Patient_Name_Step 3 summary'), 
    'Bedlington Green-and-rufous')

not_run: WebUI.verifyElementPresent(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/span_flag'), 
    5)

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/United Kingdom_Step 3 summary'), 
    'United Kingdom')

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Treatment Date summary 11 March 2018'), 
    '11 March 2018')

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/In Patient Step 3 summary'), 
    'Non-hospital stay')

not_run: WebUI.scrollToPosition(50, 60)

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Symptoms first noticed 01 February 2018'), 
    '01 February 2018')

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Diagnosis step 3 summary'), 
    'Bad back')

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Treatment required Step 3 summary'), 
    'Massage')

not_run: WebUI.verifyElementText(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Facility step 3 summary'), 
    'Hospital')

WebUI.click(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/TreAuth Step 3 submit'))

WebUI.waitForPageLoad(20)

WebUI.waitForElementPresent(findTestObject('TreAuth Sitecore/TreaAuth/Page_Treatment Authorisation/Page_Treatment Authorisation/Page_Treatment Authorisation/Confirmation tick'), 
    3)

WebUI.closeBrowser()


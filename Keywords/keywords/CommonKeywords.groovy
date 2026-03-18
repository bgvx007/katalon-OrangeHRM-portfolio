package keywords

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ObjectRepository as OR

public class CommonKeywords {

    public static void loginAsAdmin() {
        WebUI.openBrowser('https://opensource-demo.orangehrmlive.com')
        WebUI.waitForElementPresent(OR.findTestObject('Page_OrangeHRM/input_Username'), 10)
        WebUI.setText(OR.findTestObject('Page_OrangeHRM/input_Username'), 'Admin')
        WebUI.setText(OR.findTestObject('Page_OrangeHRM/input_Password'), 'admin123')
        WebUI.click(OR.findTestObject('Page_OrangeHRM/button_Login'))
        WebUI.waitForElementPresent(OR.findTestObject('Page_OrangeHRM/h6_Dashboard'), 10)
    }
}
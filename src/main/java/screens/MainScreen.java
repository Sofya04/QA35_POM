package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen extends BaseScreen{

    public MainScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
    AndroidElement detailView;

    public String getDetail() {
        return detailView.getText();
    }
}

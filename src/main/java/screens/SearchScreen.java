package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class SearchScreen extends BaseScreen{
    public SearchScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "org.wikipedia:id/search_src_text")
    AndroidElement textBox;
    @FindBy(xpath = "org.wikipedia:id/page_list_item_container")
    AndroidElement liner;
    public SearchScreen fillInText(String text) {
        type(textBox,text);
        return this;
    }
    public boolean isLiner(){
        return liner.isDisplayed();
    }


}

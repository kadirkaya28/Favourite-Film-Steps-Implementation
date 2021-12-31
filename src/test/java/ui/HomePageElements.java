package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {

    public static Target SEARCH_FIELD = Target.the("Search field")
            .located(By.id("search_title"));
    public static Target SEARCH_BTN = Target.the("Search button")
            .located(By.id("search"));

    public static Target SEARCHRESULT_DIALOG  = Target.the("Search result dialog message")
            .located(By.id("android:id/message"));

    public static Target FAVORITOS_TAB = Target.the("Favoritos tab")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]"));

    public static Target EMTPY_FAVORITOS_TAB_TEXT = Target.the("Empty favoritos tab text").located(By.xpath("\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ViewFlipper/android.widget.TextView"));

}

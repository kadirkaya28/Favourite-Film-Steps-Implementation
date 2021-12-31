package utiities.swipeutilites;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import tasks.SearchTitle;
import ui.HomePageElements;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwipeFromRightToLeft  implements Interaction {

    public static void swipteFromRightToLeft(){
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = getDriver().manage().window().getSize();
        int edgeBorder = 10; // better avoid edges

        pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);

        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);

       /* withAction(actor).press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX, endY))
                .release().perform();*/
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        swipteFromRightToLeft();
    }

    public static SwipeFromRightToLeft swipeFromRightToLeft(){
        return instrumented(SwipeFromRightToLeft.class);
    }

}

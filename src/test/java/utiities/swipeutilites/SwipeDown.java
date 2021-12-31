package utiities.swipeutilites;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;
import tasks.SearchTitle;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwipeDown   implements Interaction {

    @Override
    @Step("{0} swipes down screen")
    public <T extends Actor> void performAs(T actor) {

        Dimension size =  getDriver().manage().window().getSize();

        int startY = (int) (size.getHeight() * 0.50);
        int endY = (int) (size.getHeight() * 0.20);
        int startX = size.getWidth() / 2;

        /*withAction(actor).press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX, endY))
                .release().perform();*/


    }
    public static SwipeDown swipeDown(String title){
        return instrumented(SwipeDown.class);
    }


}

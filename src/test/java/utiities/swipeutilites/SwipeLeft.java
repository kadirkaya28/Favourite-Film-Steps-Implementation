package utiities.swipeutilites;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;

public class SwipeLeft implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {

        SwipeFromRightToLeft.swipeFromRightToLeft();
    }
}

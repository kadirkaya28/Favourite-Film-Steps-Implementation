package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.HomePageElements;

public class CurrentDialogMessage  implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return HomePageElements.SEARCHRESULT_DIALOG.resolveFor(actor).getText();
    }

    public static CurrentDialogMessage dialog() {
        return new CurrentDialogMessage();
    }
}

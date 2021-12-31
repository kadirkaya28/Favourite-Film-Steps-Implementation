package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.HomePageElements;

public class IsShowFavoritosDefaultMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return HomePageElements.EMTPY_FAVORITOS_TAB_TEXT.resolveFor(actor).getText();
    }

    public static IsShowFavoritosDefaultMessage favoritosDefaultMessage(){return new IsShowFavoritosDefaultMessage();}

}

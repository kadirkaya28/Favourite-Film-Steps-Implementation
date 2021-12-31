package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.HomePageElements;

public class IsSelectedFavoritosTab implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePageElements.FAVORITOS_TAB.resolveFor(actor).isSelected();
    }

    public static IsSelectedFavoritosTab isSelected() {return new IsSelectedFavoritosTab();}

}

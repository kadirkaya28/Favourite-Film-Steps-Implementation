package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FavoritosFilmes implements Task {
    @Override
    @Step("{0} clicks favoritos tab")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.FAVORITOS_TAB)
        );
    }

    public static FavoritosFilmes tabFavoritos(){
        return instrumented(FavoritosFilmes.class);
    }
}

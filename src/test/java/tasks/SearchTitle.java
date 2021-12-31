package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTitle implements Task {
    private String title="";

    public SearchTitle(String title) {
        this.title = title;
    }


    @Override
    @Step("{0} searchs the keyword")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.title).into(HomePageElements.SEARCH_FIELD),
                Click.on(HomePageElements.SEARCH_BTN)
        );
    }

    public static SearchTitle searchMovie(String title){
        return instrumented(SearchTitle.class, title);
    }


}

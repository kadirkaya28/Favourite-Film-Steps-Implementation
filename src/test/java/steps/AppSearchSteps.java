package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import questions.CurrentDialogMessage;
import tasks.SearchTitle;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class AppSearchSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="hhag";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Actor is on the movie list")
    public void actor_is_on_the_movie_list() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
    }

    @When("Actor performs a title search")
    public void actor_performs_a_title_search() {
        actor.attemptsTo(SearchTitle.searchMovie("spider"));
    }
    @Then("Actor checks the search result")
    public void actor_checks_the_search_result() {

        actor.should(seeThat(CurrentDialogMessage.dialog(),
                is("Alguma coisa errada não está certa. Whaaaat?")));
    }

}

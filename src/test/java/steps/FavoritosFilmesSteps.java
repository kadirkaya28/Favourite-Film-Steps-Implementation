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
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import org.openqa.selenium.WebDriver;
import questions.IsSelectedFavoritosTab;
import questions.IsShowFavoritosDefaultMessage;
import tasks.FavoritosFilmes;

public class FavoritosFilmesSteps {


    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName="kadir";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("User without favoritos opens favoritos tab")
    public void user_without_favoritos_opens_favoritos_tab() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(FavoritosFilmes.tabFavoritos());
    }

    @When("Favoritos screen is opened")
    public void favoritos_screen_is_opened() {
        actor.should(seeThat(IsSelectedFavoritosTab.isSelected(),
                is(true)));

    }
    @Then("Default message appeared")
    public void default_message_appeared() {
        actor.should(seeThat(IsShowFavoritosDefaultMessage.favoritosDefaultMessage(),
                is("Você ainda não favoritou nenhum filme, que tal começar agora? (:")));
    }
}

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;


public class MainTest {
    //@BeforeAll
    //static void beforeAll(){
        //Configuration.browser ="chrome"; //selenide include web driver manager! At the moment, we use a gradle config
    //}
    private TodoMVCPage page = new TodoMVCPage();

    @Test
    void todoMvc(){
        open("https://todomvc.com/examples/angularjs/");
        page.addItem("Show selenide");


        page.shouldHaveShowItem(); //exist on the page
        page.clickShowItem();
    }

}

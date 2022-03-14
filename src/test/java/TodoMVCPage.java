import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TodoMVCPage {

    public SelenideElement newTodoInput = $("input.new-todo");
    public SelenideElement showItem = $(withText("Show selenide"));


    void addItem(String text){
        newTodoInput.sendKeys(text);
        newTodoInput.pressEnter();
    }

    void shouldHaveShowItem(){
        showItem.shouldBe(visible);
    }

    void clickShowItem(){
        showItem.click();
    }
}



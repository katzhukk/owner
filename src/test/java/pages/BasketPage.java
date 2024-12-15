package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasketPage {

    @Step("Открытие страницы профиля")
    public BasketPage openPage(){
        open("/profile");
        return this;
    }

    @Step("Удаление одной книги из корзины")
    public BasketPage deleteFirstBook(){
        $("#delete-record-undefined").click();
        $("#closeSmallModal-ok").click();
        return this;
    }

    @Step("Проверка успешного удаления книги из корзины")
    public BasketPage checkEmptyBookList(){
        $(".ReactTable").shouldNotHave(text("Speaking JavaScript"));
        return this;
    }
}

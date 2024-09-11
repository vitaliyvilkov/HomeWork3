package ru.netology.order;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderPositiveTest {

    @Test
    public void testSuccessfulForm() {
        open("http://localhost:9999/");
        $("[data-test-id='name'] input").setValue("Виталий Вилков");
        $("[data-test-id='phone'] input").setValue("+79004567666");
        $("[data-test-id='agreement']").click();
        $("button.button").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
package ru.ibs.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/scenario"},
        glue = {"ru.ibs.tests.steps"},
        //tags = "@regress"
        tags = "@uniqueTag"
//        plugin = {""} это листнер, можно подключить здесь, а не в мавен
// Я не сделал 1 час 32 минута
//        *Заполняем поля формы:
//            | "Застрахованные - Фамилия"    | "Privet" |
//            | "Застрахованные - Имя"    | "Privet" |
//            | "Застрахованные - День рождения"    | "12.06.1990" |

)
public class CucumberRunner {
}

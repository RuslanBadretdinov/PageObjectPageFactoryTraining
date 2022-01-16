package ru.ibs.tests.utils;

import io.qameta.allure.Attachment;
//import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.ibs.tests.managers.DriverManager;
import org.junit.jupiter.api.extension.*;

//public class MyAllureListener /*extends AllureJunit5*/ implements /*AfterTestExecutionCallback (не получилось)*/ TestWatcher {
//
//    /**
//     *  Рабочий метод на JUnit4
//     */
//    /*
//    нужно добавить вместо обычного listener
//                   <properties>
//                        <property>
//                            <name>listener</name>
//                            <value>ru.ibs.framework.utils.MyAllureListener</value>
//                        </property>
//                    </properties>
//    * */
//
//
//    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
//    public byte[] getScreenshot() {
//        return  ((TakesScreenshot) DriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
//    }
//
////    @Override
////    public void afterTestExecution(ExtensionContext context) throws Exception {
////        if (context.getExecutionException().isPresent()) {
////            getScreenshot();
////        }
////    }
//
//    @Override
//    public void testFailed(ExtensionContext context, Throwable cause) {
//        getScreenshot();
//    }
//}

public class MyAllureListener extends AllureCucumber6Jvm {
    //Реализация скриншота
}

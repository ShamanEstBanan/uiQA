package PageAutoresation;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class AutoresationPage {

    By login = By.xpath("//*[@id=\"mobileOrEmail\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By buttomOk = By.xpath("//*[@id=\"loginByPwdButton\"]");

    public void sendLogin (String login) {
        Selenide.$(login).setValue(login);
    }

    public void sendPassword (String password){
        Selenide.$(password).setValue(password);
    }

    public void clickButtomOk (){
        Selenide.$(buttomOk).click();
    }
}

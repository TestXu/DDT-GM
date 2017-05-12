package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 2017/5/12.
 */
public class LoginPage {
    @FindBy()
    @CacheLookup
    private static WebElement nameInput;//账号输入框

    private static WebElement pwdInput;//密码输入框

    private static WebElement server;//选择服务器

    private static WebElement language;//选择语言

    private static WebElement loginButten;//用户登录按钮
}

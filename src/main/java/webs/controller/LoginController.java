package webs.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> loginData, HttpSession session) {
        String captcha = loginData.get("captcha");
        String sessionCaptcha = (String) session.getAttribute("captcha");

        if (captcha == null || !captcha.equalsIgnoreCase(sessionCaptcha)) {
            return "验证码错误";
        }

        // 继续验证用户名和密码
        //String username = loginData.get("username");
        //String password = loginData.get("password");
        // 验证用户名和密码逻辑

        return "登录成功";
    }
}

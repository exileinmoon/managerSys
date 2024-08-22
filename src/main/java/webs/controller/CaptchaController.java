package webs.controller;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {

    @Autowired
    private DefaultKaptcha defaultKaptcha;

    @GetMapping("/image")
    public void getCaptcha(HttpServletResponse response, HttpSession session) throws IOException {
        // 生成验证码文本
        String captchaText = defaultKaptcha.createText();
        session.setAttribute("captcha", captchaText);

        // 生成验证码图片
        BufferedImage captchaImage = defaultKaptcha.createImage(captchaText);
        response.setContentType("image/jpeg");
        ImageIO.write(captchaImage, "jpg", response.getOutputStream());
    }
}
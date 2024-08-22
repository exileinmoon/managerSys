package webs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webs.service.RegisterService;
import webs.pojo.Result;
import webs.pojo.Register;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @PostMapping("/registerAdd")
    public Result add(@RequestBody Register register){
        registerService.add(register);

        return new Result().success();
    }



}

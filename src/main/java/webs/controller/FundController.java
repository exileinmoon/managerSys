package webs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webs.pojo.Fund;
import webs.service.FundService;
import webs.pojo.Result;

import java.util.List;

@RestController
@RequestMapping("/fund")
public class FundController {
    @Autowired
    private FundService fundService;
    @PostMapping("/fundAdd")
    public Result add(@RequestBody Fund fund) {
        fundService.add(fund);
        return new Result().success();
    }
    @DeleteMapping("/fundDelete/{id}")
    public Result delete(@PathVariable int id) {
        fundService.delete(id);
        return new Result().success();
    }
    @GetMapping("/fundList")
    public Result list() {

        List<Fund> fundList = fundService.list();
        return new Result().success(fundList);
    }
}
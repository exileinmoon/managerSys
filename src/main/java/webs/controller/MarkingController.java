package webs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webs.pojo.Marketing;
import webs.service.MarketingService;
import webs.pojo.Result;

import java.util.List;

@RestController
@RequestMapping("/maretking")
public class MarkingController {
    @Autowired
    private MarketingService marketingService;
    @PostMapping("/marketingAdd")
    public Result add(@RequestBody Marketing marketing) {
        marketingService.add(marketing);
        return new Result().success();
    }
    @DeleteMapping("/marketingDelete/{id}")
    public Result delete(@PathVariable int id) {
        marketingService.delete(id);
        return new Result().success();
    }
    @GetMapping("/marketingList")
    public Result list() {

        List<Marketing> marketingList = marketingService.list();
        return new Result().success(marketingList);
    }
}
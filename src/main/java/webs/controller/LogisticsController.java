package webs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webs.pojo.Logistics;
import webs.pojo.Result;
import webs.service.LogisticsService;
import java.util.List;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {
    @Autowired
    private LogisticsService logisticsService;
    @PostMapping("/logisticsAdd")
    public Result add(@RequestBody Logistics logistics) {
        logisticsService.add(logistics);
        return new Result().success();
    }
    @DeleteMapping("/logisticsDelete/{id}")
    public Result delete(@PathVariable int id) {
        logisticsService.delete(id);
        return new Result().success();
    }
    @GetMapping("/logisticsList")
    public Result list() {

        List<Logistics> logisticsList = logisticsService.list();
        return new Result().success(logisticsList);
    }
}
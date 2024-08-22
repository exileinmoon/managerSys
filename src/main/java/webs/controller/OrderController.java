package webs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webs.pojo.Order;
import webs.service.OrderService;
import webs.pojo.Result;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/orderAdd")
    public Result add(@RequestBody Order order) {
        orderService.add(order);
        return new Result().success();
    }
    @DeleteMapping("/orderDelete/{id}")
    public Result delete(@PathVariable int id) {
        orderService.delete(id);
        return new Result().success();
    }
    @GetMapping("/orderList")
    public Result list() {

        List<Order> orderList = orderService.list();
        return new Result().success(orderList);
    }

}

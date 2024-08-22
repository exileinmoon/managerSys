package webs.controller;

import org.springframework.web.bind.annotation.*;
import webs.pojo.Goods;
import webs.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import webs.pojo.Result;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @PostMapping("/goodsAdd")
    public Result add(@RequestBody Goods goods) {
            goodsService.add(goods);
            return new Result().success();
    }
    @DeleteMapping("/goodsDelete/{id}")
    public Result delete(@PathVariable int id) {
        goodsService.delete(id);
        return new Result().success();
    }
    @GetMapping("/goodsList")
    public Result list() {

            List<Goods> goodsList = goodsService.list();
            return new Result().success(goodsList);
        }
    }


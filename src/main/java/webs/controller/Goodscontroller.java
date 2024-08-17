package webs.controller;

import webs.goods.pojo.Goods;
import webs.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webs.pojo.Result;

@RestController
@RequestMapping("/goods")
public class Goodscontroller {
    @Autowired
    private GoodsService goodsService;
    @PostMapping
    public Result add(@RequestBody Goods goods){
        goodsService.add(goods);

        return new Result().success();
    }

}

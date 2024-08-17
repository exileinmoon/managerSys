package webs.goods.service.impl;

import webs.goods.pojo.Goods;
import webs.goods.service.GoodsService;
import webs.goods.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 李
* @description 针对表【goods】的数据库操作Service实现
* @createDate 2024-08-16 14:20:41
*/

@Service

public  class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public void add(Goods goods){
        goodsMapper.insert(goods);
    }
    @Override
    public void delete(Integer id){
        goodsMapper.delete(id);
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Goods> list(){
        return goodsMapper.list();
    }

}





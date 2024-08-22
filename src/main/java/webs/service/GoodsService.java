package webs.service;

import webs.pojo.Goods;


import java.util.List;

/**
* @author 李
* @description 针对表【goods】的数据库操作Service
* @createDate 2024-08-16 14:20:41
*/
public interface GoodsService{
     void add(Goods goods);

     void delete(Integer id);
     List<Goods> list();

}

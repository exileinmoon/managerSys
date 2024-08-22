package webs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import webs.pojo.Order;

import java.util.List;

/**
* @author 李
* @description 针对表【order】的数据库操作Service
* @createDate 2024-08-19 09:44:24
*/
public interface OrderService extends IService<Order> {
    void add();
    void delete();
    List<Order> list();

    void add(Order goods);

    void delete(Integer id);
}

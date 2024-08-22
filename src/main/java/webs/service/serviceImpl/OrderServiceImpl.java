package webs.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webs.mapper.OrderMapper;
import webs.pojo.Order;
import webs.service.OrderService;

import java.util.List;
import java.util.Random;

/**
* @author 李
* @description 针对表【order】的数据库操作Service实现
* @createDate 2024-08-19 09:44:24
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public void add(Order order){
        Random random=new Random();
        int n=random.nextInt(1000000000)+1;
        order.setOrderId(n);
        orderMapper.insert(order);
    }
    @Override
    public void delete(Integer id){
        orderMapper.delete(id);
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Order> list(){
        return orderMapper.list();
    }

}





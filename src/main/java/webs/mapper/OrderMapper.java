package webs.mapper;
import org.apache.ibatis.annotations.*;
import webs.pojo.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 李
* @description 针对表【order】的数据库操作Mapper
* @createDate 2024-08-19 09:44:24
* @Entity order.pojo.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Insert("INSERT INTO `order` (order_id,customer_name,trade_name,number,amount)" +
            " VALUES (#{order.orderId}, #{order.customerName}, #{order.tradeName}, #{order.number}, #{order.amount})")
    int insert(@Param("order") Order order);

    @Delete("DELETE FROM `order` WHERE order_id = #{orderId}")
    void delete(@Param("orderId") Integer orderId);

    @Select("SELECT * FROM `order`")
    @Results({
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "customerName", column = "customer_name"),
            @Result(property = "tradeName", column = "trade_name"),
            @Result(property = "number", column = "number"),
            @Result(property = "amount", column = "amount")
    })
    List<Order> list();


}





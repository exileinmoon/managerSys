package webs.mapper;

import org.apache.ibatis.annotations.*;
import webs.pojo.Goods;

import java.util.List;

/**
 * @author 李
 * @description 针对表【goods】的数据库操作Mapper
 * @createDate 2024-08-16 14:20:41
 * &#064;Entity  goods.pojo.Member
 */
@Mapper
public interface GoodsMapper {

    @Insert("INSERT INTO goods(good_name, good_price, good_stock, good_id, good_type) VALUES (#{goods.goodName}, #{goods.goodPrice}, #{goods.goodStock}, #{goods.goodId}, #{goods.goodType})")
    void insert(@Param("goods") Goods goods);

    @Delete("DELETE FROM goods WHERE good_id = #{goodsId}")
    void delete(@Param("goodsId") Integer goodsId);

    @Select("SELECT * FROM goods")
    @Results({
            @Result(property = "goodId", column = "good_id"),
            @Result(property = "goodName", column = "good_name"),
            @Result(property = "goodPrice", column = "good_price"),
            @Result(property = "goodStock", column = "good_stock"),
            @Result(property = "goodType", column = "good_type")
    })
    List<Goods> list();

}





package webs.goods.mapper;

import webs.goods.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 李
 * @description 针对表【goods】的数据库操作Mapper
 * @createDate 2024-08-16 14:20:41
 * &#064;Entity  goods.pojo.Goods
 */
@Mapper
public interface GoodsMapper {

    @Insert("INSERT INTO goods (good_name,good_price,good_stock,good_id)VALUES(#{goods.goodsName}, #{goods.goodsPrice}, #{goods.goodsStock}, #{goods.goodsId})")
    void insert(@Param("goods") Goods goods);

    @Delete("DELETE FROM goods WHERE good_id = #{goodsId}")
    void delete(@Param("goodsId") Integer goodsId);

    @Select("SELECT * FROM goods")
    List<Goods> list();
}





package webs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import webs.pojo.Fund;

import java.util.List;

/**
 * @description 针对表【fund】的数据库操作Mapper
 * @createDate 2024-08-19 10:27:35
 * @Entity fund.pojo.Fund
 */
@Mapper
public interface FundMapper extends BaseMapper<Fund> {

    @Insert("INSERT INTO fund (fund_id, fund_day, information, price, fund_type) VALUES (#{fund.fundId}, #{fund.fundDay}, #{fund.information}, #{fund.price}, #{fund.fundType})")
    int insert(@Param("fund") Fund fund);

    @Delete("DELETE FROM fund WHERE fund_id = #{fundId}")
    void delete(@Param("fundId") Integer fundId);

    @Select("SELECT * FROM fund")
    @Results({
            @Result(property = "fundId", column = "fund_id"),
            @Result(property = "fundDay", column = "fund_day"),
            @Result(property = "information", column = "information"),
            @Result(property = "price", column = "price"),
            @Result(property = "fundType", column = "fund_type")
    })
    List<Fund> list();
}
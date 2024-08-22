package webs.mapper;
import org.apache.ibatis.annotations.*;
import webs.pojo.Marketing;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author 李
 * @description 针对表【marketing】的数据库操作Mapper
 * @createDate 2024-08-19 09:44:24
 * @Entity marketing.pojo.Marketinging
 */
@Mapper
public interface MarketingMapper extends BaseMapper<Marketing> {
    @Insert("INSERT INTO `marketing` (information, marketing_id) VALUES (#{marketing.information},#{marketing.markingId})")
    int insert(@Param("marketing") Marketing marketing);

    @Delete("DELETE FROM `marketing` WHERE marketing_id = #{marketingId}")
    void delete(@Param("marketingId") Integer marketingId);

    @Select("SELECT * FROM `marketing`")
    List<Marketing> list();


}





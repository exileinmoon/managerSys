package webs.mapper;
import org.apache.ibatis.annotations.*;
import webs.pojo.Logistics;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

@Mapper
public interface LogisticsMapper extends BaseMapper<Logistics> {
    @Insert("INSERT INTO `logistics` (number, state, phone_number, company, name, logistics_id)" +
            " VALUES (#{logistics.number}, #{logistics.state}, #{logistics.phoneNumber}, #{logistics.company}, #{logistics.name}, #{logistics.logisticsId})")
    int insert(@Param("logistics") Logistics logistics);

    @Delete("DELETE FROM `logistics` WHERE logistics_id = #{logisticsId}")
    void delete(@Param("logisticsId") Integer logisticsId);

    @Select("SELECT * FROM `logistics`")
    List<Logistics> list();
}
package webs.mapper;
import org.apache.ibatis.annotations.*;
import webs.pojo.Logistics;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

@Mapper
public interface LogisticsMapper extends BaseMapper<Logistics> {
    @Insert("INSERT INTO `logistics` (number, status, phone_number, company, name, logistics_id)" +
            " VALUES (#{logistics.number}, #{logistics.status}, #{logistics.phoneNumber}, #{logistics.company}, #{logistics.name}, #{logistics.logisticsId})")
    int insert(@Param("logistics") Logistics logistics);

    @Delete("DELETE FROM `logistics` WHERE logistics_id = #{logisticsId}")
    void delete(@Param("logisticsId") Integer logisticsId);

    @Select("SELECT * FROM `logistics`")
    @Results({
            @Result(property = "logisticsId", column = "logistics_id"),
            @Result(property = "number", column = "number"),
            @Result(property = "status", column = "status"),
            @Result(property = "phoneNumber", column = "phone_number"),
            @Result(property = "company", column = "company"),
            @Result(property = "name", column = "name")
    })
    List<Logistics> list();
}
package webs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import webs.pojo.Register;


/**
 * @author 李
 * @description 针对表【register】的数据库操作Mapper
 * @createDate 2024-08-16 14:21:32
 * @Entity register.pojo.Register
 *
 */
@Mapper
public interface RegisterMapper extends BaseMapper<Register> {

    @Insert("insert into register(username,password,phone_number)values(#{username},#{password},#{phoneNumber})")
    int insert(Register register);

}



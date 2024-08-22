package webs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import webs.pojo.Fund;

import java.util.List;

/**
* @author 李
* @description 针对表【fund】的数据库操作Service
* @createDate 2024-08-19 10:27:35
*/
public interface FundService extends IService<Fund> {

    List<Fund> list();

    void add(Fund fund);

    void delete(Integer id);
}

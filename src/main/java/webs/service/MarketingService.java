package webs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import webs.pojo.Marketing;

import java.util.List;

/**
* @author 李
* @description 针对表【marketing】的数据库操作Service
* @createDate 2024-08-19 10:27:16
*/
public interface MarketingService extends IService<Marketing> {
    void add();
    void delete();
    List<Marketing> list();

    void add(Marketing goods);

    void delete(Integer id);
}

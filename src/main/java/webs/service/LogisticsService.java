package webs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import webs.pojo.Logistics;

import java.util.List;

/**
 * @author 李
 * @description 针对表【logistics】的数据库操作Service
 * @createDate 2024-08-19 09:44:24
 */
public interface LogisticsService extends IService<Logistics> {
    void add();
    void delete();
    List<Logistics> list();

    void add(Logistics goods);

    void delete(Integer id);
}

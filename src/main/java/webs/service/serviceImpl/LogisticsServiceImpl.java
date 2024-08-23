package webs.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webs.mapper.LogisticsMapper;
import webs.pojo.Logistics;
import webs.service.LogisticsService;

import java.util.List;
import java.util.Random;

/**
 * @author 李
 * @description 针对表【logistics】的数据库操作Service实现
 * @createDate 2024-08-19 09:44:24
 */
@Service
public class LogisticsServiceImpl extends ServiceImpl<LogisticsMapper, Logistics>
        implements LogisticsService{
    @Autowired
    private LogisticsMapper logisticsMapper;
    @Override
    public void add(Logistics logistics){
        Random random=new Random();
        int n=random.nextInt(1000000000)+1;
        logistics.setLogisticsId(n);
        logisticsMapper.insert(logistics);
    }
    @Override
    public void delete(Integer id){
        logisticsMapper.delete(id);
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Logistics> list(){
        return logisticsMapper.list();
    }

}





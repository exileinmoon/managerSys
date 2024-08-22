package webs.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webs.mapper.MarketingMapper;
import webs.pojo.Marketing;
import webs.service.MarketingService;

import java.util.List;

/**
 * @author 李
 * @description 针对表【marketing】的数据库操作Service实现
 * @createDate 2024-08-19 09:44:24
 */
@Service
public class MarketingServiceImpl extends ServiceImpl<MarketingMapper, Marketing>
        implements MarketingService{
    @Autowired
    private MarketingMapper marketingMapper;
    @Override
    public void add(Marketing marketing){
        marketingMapper.insert(marketing);
    }
    @Override
    public void delete(Integer id){
        marketingMapper.delete(id);
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Marketing> list(){
        return marketingMapper.list();
    }

}


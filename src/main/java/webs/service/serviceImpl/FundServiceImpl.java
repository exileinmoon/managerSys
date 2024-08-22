package webs.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webs.mapper.FundMapper;
import webs.pojo.Fund;
import webs.service.FundService;

import java.util.List;
import java.util.Random;

/**
 * @description 针对表【fund】的数据库操作Service实现
 * @createDate 2024-08-19 09:44:24
 */
@Service
public class FundServiceImpl extends ServiceImpl<FundMapper, Fund>
        implements FundService {

    @Autowired
    private FundMapper fundMapper;

    @Override
    public void add(Fund fund) {
        Random random=new Random();
        int n=random.nextInt(1000000000)+1;
        fund.setFundId(n);
        fundMapper.insert(fund);
    }

    @Override
    public void delete(Integer id) {
        fundMapper.delete(id);
    }

    @Override
    public List<Fund> list() {
        return fundMapper.list();
    }
}
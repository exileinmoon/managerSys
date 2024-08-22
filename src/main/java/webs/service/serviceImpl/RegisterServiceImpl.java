package webs.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webs.mapper.RegisterMapper;
import webs.pojo.Register;
import webs.service.RegisterService;

/**
* @author 李
* @description 针对表【register】的数据库操作Service实现
* @createDate 2024-08-16 14:21:32
*/
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register>
        implements RegisterService {
    @Autowired
    private  RegisterMapper registerMapper;
    @Override
    public void add(Register register) {
        registerMapper.insert(register);
    }
}





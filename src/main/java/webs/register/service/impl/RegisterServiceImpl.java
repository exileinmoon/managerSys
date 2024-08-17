package webs.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import webs.register.service.RegisterService;
import webs.register.pojo.Register;
import webs.register.mapper.RegisterMapper;
import org.springframework.stereotype.Service;

/**
* @author 李
* @description 针对表【register】的数据库操作Service实现
* @createDate 2024-08-16 14:21:32
*/
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private  RegisterMapper registerMapper;
    @Override
    public void add(Register register) {
        registerMapper.insert(register);
    }
}





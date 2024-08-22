package webs.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webs.mapper.MemberMapper;
import webs.pojo.Member;
import webs.service.MemberService;

import java.util.List;
import java.util.Random;

/**
* @author 李
* @description 针对表【member】的数据库操作Service实现
* @createDate 2024-08-19 08:46:38
*/
@Service

public  class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public void add(Member member){
        Random random=new Random();
        int n=random.nextInt(1000000000)+1;
        member.setMemberId(n);
        memberMapper.insert(member);
    }

    @Override
    public void delete(Integer id){
        memberMapper.delete(id);
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Member> list(){
        return memberMapper.list();
    }

}

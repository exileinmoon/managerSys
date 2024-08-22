package webs.service;

import webs.pojo.Member;

import java.util.List;

/**
* @author 李
* @description 针对表【member】的数据库操作Service
* @createDate 2024-08-19 08:46:38
*/
public interface MemberService{
    void add();
    void delete();
    List<Member> list();

    void add(Member member);

    void delete(Integer id);
}

package webs.mapper;

import org.apache.ibatis.annotations.*;
import webs.pojo.Member;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO member (member_name, member_id, member_time, member_level) VALUES (#{member.memberName}, #{member.memberId}, #{member.memberTime}, #{member.memberLevel})")
    void insert(@Param("member") Member member);

    @Delete("DELETE FROM member WHERE member_id = #{memberId}")
    void delete(@Param("memberId") Integer memberId);

    @Select("SELECT * FROM member")
    @Results({
            @Result(property = "memberId", column = "member_id"),
            @Result(property = "memberName", column = "member_name"),
            @Result(property = "memberTime", column = "member_time"),
            @Result(property = "memberLevel", column = "member_level")
    })
    List<Member> list();
}
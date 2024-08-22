package webs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webs.pojo.Member;
import webs.pojo.Result;
import webs.service.MemberService;

import java.util.List;


    @RestController
    @RequestMapping("/member")
    public class MemberController {
        @Autowired
        private MemberService memberService;
        @PostMapping("/memberAdd")
        public Result add(@RequestBody Member member) {
            memberService.add(member);
            return new Result().success();
        }
        @DeleteMapping("/memberDelete/{id}")
        public Result delete(@PathVariable int id) {
            memberService.delete(id);
            return new Result().success();
        }
        @GetMapping("/memberList")
        public Result list() {

            List<Member> memberList = memberService.list();
            return new Result().success(memberList);
        }
    }




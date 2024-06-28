package hello.helloSpring;

import hello.helloSpring.repository.MemberRepository;
import hello.helloSpring.repository.MemoryMemberRepository;
import hello.helloSpring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();

        // 컴포넌트 스캔 말고 직접 스프링 빈을 주입하면 좋은 점
        // db를 바꿀 때 다른 코드 수정 없이
        // return new dbMemberRepository();
        // 로만 바꿔주면 된다
    }
}
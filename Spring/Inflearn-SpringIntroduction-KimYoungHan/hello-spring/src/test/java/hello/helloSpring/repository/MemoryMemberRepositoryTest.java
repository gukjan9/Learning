package hello.helloSpring.repository;

import hello.helloSpring.domain.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();  // get 으로 바로 꺼내는 방식은 좋지 않으나 테스트에서는 그냥 씀
        assertThat(member).isEqualTo(result);
    }
}

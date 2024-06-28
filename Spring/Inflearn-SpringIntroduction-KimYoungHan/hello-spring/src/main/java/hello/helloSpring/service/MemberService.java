package hello.helloSpring.service;

import hello.helloSpring.domain.Member;
import hello.helloSpring.repository.MemberRepository;
import hello.helloSpring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// component 스캔 방식과 자동 의존 관계 설정
// @Component 라고만 해도 된다
// @Service
public class MemberService {

    // private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 테스트 케이스에서 new MemoryMemberRepository(); 로 생성시 서로 다른 db 를 바라보는 것 방지하기 위해
    // new 가 아닌 constructor 로 설정
    private final MemberRepository memberRepository;

    // DI (Dependency Injection)
    @Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public long join(Member member){
        // 같은 이름인 중복 회원 x
        // 아래처럼 코드가 길 때는 메서드로 추출
        validateDuplicateMember(member);
        memberRepository.save(member);

        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        //        Optional<Member> result = memberRepository.findByName(member.getName());
//        result.ifPresent(m -> {
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });

        // Optional 직접 반환하지말고 아래처럼 권장
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}

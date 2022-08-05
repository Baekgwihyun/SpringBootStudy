package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(member).isNotEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);
    }


}

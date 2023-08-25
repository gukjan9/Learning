package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
// 기본 생성자로 객체 생성시 에러 발생
//public Memo(String username, String contents){
//    this.username = username;
//    this.contents = contents;
//}
@NoArgsConstructor
// 기본 생성자
//public Memo{
//
//        }
// @RequiredArgsConstructor
// final 이 걸려있는 필드로만 생성자 생성
public class Memo {
    private String username;
    private String contents;
}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("GJ");
        System.out.println(memo.getUsername());
    }
}
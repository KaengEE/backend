package com.mysite.backend.controller;

import com.mysite.backend.model.User;
import com.mysite.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*") //cors 설정 - 모든링크
@RequiredArgsConstructor
public class UserController {

    //생성자 주입
    private final UserRepository userRepository;

    //새 사용자 리스트 추가
    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        //서버 요청 @RequestBody 서버 응답 @ResponseBody
        return userRepository.save(newUser);
    }

    //모든 사용자 조회
    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}

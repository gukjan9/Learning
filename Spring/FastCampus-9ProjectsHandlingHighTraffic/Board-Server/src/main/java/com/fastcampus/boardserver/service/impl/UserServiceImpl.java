package com.fastcampus.boardserver.service.impl;

import com.fastcampus.boardserver.dto.UserDTO;
import com.fastcampus.boardserver.exception.DuplicateIdException;
import com.fastcampus.boardserver.mapper.UserProfileMapper;
import com.fastcampus.boardserver.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Log4j2
public class UserServiceImpl implements UserService {
    @Autowired
    public UserProfileMapper userProfileMapper;

    public UserServiceImpl(UserProfileMapper userProfileMapper){
        this.userProfileMapper = userProfileMapper;
    }

    @Override
    public void register(UserDTO userProfile) {
        boolean duplIdResult = isDuplicatedId(userProfile.getUserId());
        if(duplIdResult){
            throw new DuplicateIdException("중복된 아이디 입니다.");
        }
        userProfile.setCreateTime(new Date());
        userProfile.setPassword(encryptSHA(userProfile.getPassword()));
        int insertCount = userProfileMapper.insertUserProfile(userProfile);

        if(insertCount != 1){
            log.error("insertMember ERROR! {}", userProfile);
            throw new RuntimeException(
                    "insertUser ERROR! 회원가입 메서드를 확인해주세요\n" + "Params : " + userProfile);
        }
    }

    @Override
    public UserDTO login(String id, String password) {
        return null;
    }

    @Override
    public boolean isDuplicatedId(String id) {
        return userProfileMapper.idCheck(id) == 1;
    }

    @Override
    public UserDTO getUserInfo(String userId) {
        return null;
    }

    @Override
    public void updatePassword(String id, String beforePassword, String afterPassword) {

    }

    @Override
    public void deleteId(String id, String password) {

    }
}

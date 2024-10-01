package com.classroommission.infraestructure.repository.impl;

import org.springframework.stereotype.Repository;

import com.classroommission.infraestructure.entity.ClassroomUserEntity;
import com.classroommission.infraestructure.repository.ClassroomUserRepository;

@Repository
public class ClassroomUserRepositoryImpl implements ClassroomUserRepository {

  @Override
  public ClassroomUserEntity findByUserId(String userId) {
    return new ClassroomUserEntity("https://i.pinimg.com/originals/f0/18/12/f018121b5cbfb539f6e9fafa85da5300.jpg");
  }

}

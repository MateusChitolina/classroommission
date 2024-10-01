package com.classroommission.infraestructure.repository;

import com.classroommission.infraestructure.entity.ClassroomUserEntity;

public interface ClassroomUserRepository {
  public ClassroomUserEntity findByUserId(String userId);
}

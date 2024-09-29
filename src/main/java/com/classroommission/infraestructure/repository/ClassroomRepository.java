package com.classroommission.infraestructure.repository;

import java.util.List;

import com.classroommission.infraestructure.entity.ClassroomEntity;

public interface ClassroomRepository {
  public List<ClassroomEntity> findAllByUserId(String userId);
}

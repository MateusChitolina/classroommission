package com.classroommission.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.classroommission.infraestructure.entity.ClassroomEntity;
import com.classroommission.infraestructure.entity.ClassroomUserEntity;
import com.classroommission.infraestructure.repository.ClassroomRepository;
import com.classroommission.infraestructure.repository.ClassroomUserRepository;
import com.classroommission.models.converters.ClassroomConverter;
import com.classroommission.models.converters.ClassroomUserConverter;
import com.classroommission.models.outputs.ClassroomProfileImageSearchOutput;
import com.classroommission.models.outputs.ClassroomSearchAllOutput;

@Service
public class ClassroomService {
  
  private final ClassroomRepository classroomRepository;
  private final ClassroomUserRepository classroomUserRepository;

  public ClassroomService(ClassroomRepository classroomRepository, ClassroomUserRepository classroomUserRepository) {
    this.classroomRepository = classroomRepository;
    this.classroomUserRepository = classroomUserRepository;
  }

  public List<ClassroomSearchAllOutput> getAllClassrooms(String userId) {
    List<ClassroomEntity> classroomEntityList = classroomRepository.findAllByUserId(userId);

    List<ClassroomSearchAllOutput> classroomSearchAllOutputList = classroomEntityList.stream().map(ClassroomConverter::entityToSearchAllOutput).collect(Collectors.toList());

    return classroomSearchAllOutputList;
  }

  public ClassroomProfileImageSearchOutput getUserImage(String userId) {
    ClassroomUserEntity classroomUserEntity = classroomUserRepository.findByUserId(userId);

    ClassroomProfileImageSearchOutput classroomProfileImageSearchOutput = ClassroomUserConverter.entityToProfileImageSearchOutput(classroomUserEntity);

    return classroomProfileImageSearchOutput;
  }
}

package com.classroommission.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.classroommission.infraestructure.entity.ClassroomEntity;
import com.classroommission.infraestructure.repository.ClassroomRepository;
import com.classroommission.models.converters.ClassroomConverter;
import com.classroommission.models.outputs.ClassroomSearchAllOutput;

@Service
public class ClassroomService {
  
  private final ClassroomRepository classroomRepository;

  public ClassroomService(ClassroomRepository classroomRepository) {
    this.classroomRepository = classroomRepository;
  }

  public List<ClassroomSearchAllOutput> getAllClassrooms(String userId) {
    List<ClassroomEntity> classroomEntityList = classroomRepository.findAllByUserId(userId);

    List<ClassroomSearchAllOutput> classroomSearchAllOutputList = classroomEntityList.stream().map(ClassroomConverter::entityToSearchAllOutput).collect(Collectors.toList());

    return classroomSearchAllOutputList;
  }
}

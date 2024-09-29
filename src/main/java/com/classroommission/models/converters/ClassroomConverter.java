package com.classroommission.models.converters;

import java.util.List;
import java.util.stream.Collectors;

import com.classroommission.infraestructure.entity.ClassroomEntity;
import com.classroommission.models.outputs.ClassroomAssignmentsOutput;
import com.classroommission.models.outputs.ClassroomSearchAllOutput;

public class ClassroomConverter {
  public static ClassroomSearchAllOutput entityToSearchAllOutput(ClassroomEntity classroomEntity) {
    
    ClassroomSearchAllOutput classroomSearchAllOutput = new ClassroomSearchAllOutput();
    classroomSearchAllOutput.setTitle(classroomEntity.getTitle());
    classroomSearchAllOutput.setDescription(classroomEntity.getDescription());
    classroomSearchAllOutput.setAuxiliarLabel(classroomEntity.getAuxiliarLabel());
    classroomSearchAllOutput.setTopBackgroundSrc(classroomEntity.getTopBackgroundSrc());
    classroomSearchAllOutput.setUserImageSrc(classroomEntity.getUserImageSrc());

    if (classroomEntity.getClassroomAssignments() != null) {
      List<ClassroomAssignmentsOutput> classroomAssignmentsOutput = classroomEntity.getClassroomAssignments().stream().map(ClassroomAssignmentsConverter::entityToOutput).collect(Collectors.toList());

      classroomSearchAllOutput.setClassroomAssignments(classroomAssignmentsOutput);
    }

    return classroomSearchAllOutput;
  }
}

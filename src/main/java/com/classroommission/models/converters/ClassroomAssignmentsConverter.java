package com.classroommission.models.converters;

import com.classroommission.infraestructure.entity.ClassroomAssignmentsEntity;
import com.classroommission.models.outputs.ClassroomAssignmentsOutput;

public class ClassroomAssignmentsConverter {

  public static ClassroomAssignmentsOutput entityToOutput(ClassroomAssignmentsEntity classroomAssignmentsEntity) {

    ClassroomAssignmentsOutput classroomAssignmentsOutput = new ClassroomAssignmentsOutput();
    classroomAssignmentsOutput.setId(classroomAssignmentsEntity.getId());
    classroomAssignmentsOutput.setTopLabel(classroomAssignmentsEntity.getTopLabel());
    classroomAssignmentsOutput.setBottomLabel(classroomAssignmentsEntity.getBottomLabel());

    return classroomAssignmentsOutput;
  }
}

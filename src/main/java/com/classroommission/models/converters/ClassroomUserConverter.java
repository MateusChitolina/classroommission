package com.classroommission.models.converters;

import com.classroommission.infraestructure.entity.ClassroomUserEntity;
import com.classroommission.models.outputs.ClassroomProfileImageSearchOutput;

public class ClassroomUserConverter {
  public static ClassroomProfileImageSearchOutput entityToProfileImageSearchOutput(ClassroomUserEntity classroomUserEntity) {
    ClassroomProfileImageSearchOutput classroomProfileImageSearchOutput = new ClassroomProfileImageSearchOutput();
    classroomProfileImageSearchOutput.setProfileImageSrc(classroomUserEntity.getProfileImageSrc());

    return classroomProfileImageSearchOutput;
  }
}

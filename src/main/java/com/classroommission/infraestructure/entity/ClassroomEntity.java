package com.classroommission.infraestructure.entity;

import java.util.List;

//fake entity
public class ClassroomEntity {
  private String title;
  private String description;
  private String auxiliarLabel;
  private String topBackgroundSrc;
  private String userImageSrc;
  private List<ClassroomAssignmentsEntity> classroomAssignments;

  //entity não tem constructor, mas como vai ser simulado os dados precisa
  public ClassroomEntity(String title, String description, String auxiliarLabel, String topBackgroundSrc, String userImageSrc, List<ClassroomAssignmentsEntity> classroomAssignments) {
    this.title = title;
    this.description = description;
    this.auxiliarLabel = auxiliarLabel;
    this.topBackgroundSrc = topBackgroundSrc;
    this.userImageSrc = userImageSrc;
    this.classroomAssignments = classroomAssignments;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAuxiliarLabel() {
    return auxiliarLabel;
  }

  public void setAuxiliarLabel(String auxiliarLabel) {
    this.auxiliarLabel = auxiliarLabel;
  }

  public List<ClassroomAssignmentsEntity> getClassroomAssignments() {
    return classroomAssignments;
  }

  public void setClassroomAssignments(List<ClassroomAssignmentsEntity> classroomAssignments) {
    this.classroomAssignments = classroomAssignments;
  }

  public String getTopBackgroundSrc() {
    return topBackgroundSrc;
  }

  public void setTopBackgroundSrc(String topBackgroundSrc) {
    this.topBackgroundSrc = topBackgroundSrc;
  }

  public String getUserImageSrc() {
    return userImageSrc;
  }

  public void setUserImageSrc(String userImageSrc) {
    this.userImageSrc = userImageSrc;
  }

}

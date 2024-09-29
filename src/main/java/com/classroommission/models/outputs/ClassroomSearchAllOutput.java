package com.classroommission.models.outputs;

import java.util.List;

public class ClassroomSearchAllOutput {
  private String title;
  private String description;
  private String auxiliarLabel;
  private String topBackgroundSrc;
  private String userImageSrc;
  private List<ClassroomAssignmentsOutput> classroomAssignments;

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

  public List<ClassroomAssignmentsOutput> getClassroomAssignments() {
    return classroomAssignments;
  }

  public void setClassroomAssignments(List<ClassroomAssignmentsOutput> classroomAssignments) {
    this.classroomAssignments = classroomAssignments;
  }
  
}

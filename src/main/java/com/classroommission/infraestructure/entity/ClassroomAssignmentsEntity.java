package com.classroommission.infraestructure.entity;

//fake entity
public class ClassroomAssignmentsEntity {

  private String id;
  private String topLabel;
  private String bottomLabel;

  //entity não tem constructor, mas como vai ser simulado os dados precisa
  public ClassroomAssignmentsEntity(String id, String topLabel, String bottomLabel) {
    this.id = id;
    this.topLabel = topLabel;
    this.bottomLabel = bottomLabel;
  }
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTopLabel() {
    return topLabel;
  }

  public void setTopLabel(String topLabel) {
    this.topLabel = topLabel;
  }

  public String getBottomLabel() {
    return bottomLabel;
  }

  public void setBottomLabel(String bottomLabel) {
    this.bottomLabel = bottomLabel;
  }
}

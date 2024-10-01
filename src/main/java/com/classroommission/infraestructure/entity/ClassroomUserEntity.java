package com.classroommission.infraestructure.entity;

public class ClassroomUserEntity {
  private String profileImageSrc;

  public ClassroomUserEntity(String profileImageSrc) {
    this.profileImageSrc = profileImageSrc;
  }

  public String getProfileImageSrc() {
    return profileImageSrc;
  }

  public void setProfileImageSrc(String profileImageSrc) {
    this.profileImageSrc = profileImageSrc;
  }

  
}

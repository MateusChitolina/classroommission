package com.classroommission.models.input;

public class BookInput {
  private String title;
  private Long publishmentYear;
  private String publisher;
  private Long quantity;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getPublishmentYear() {
    return publishmentYear;
  }

  public void setPublishmentYear(Long publishmentYear) {
    this.publishmentYear = publishmentYear;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }
}

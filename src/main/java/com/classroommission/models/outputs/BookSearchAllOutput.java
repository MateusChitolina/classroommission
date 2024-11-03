package com.classroommission.models.outputs;

public class BookSearchAllOutput {
  private Long id;
  private String title;
  private Long publishmentYear;
  private String publisher;
  private Long quantity;
  private String author;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

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

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}

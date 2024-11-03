package com.classroommission.infraestructure.entity;

public class BookEntity {
  private Long id;
  private String title;
  private Long publishmentYear;
  private String publisher;
  private Long quantity;
  private String author;

  //entity não tem constructor, mas como vai ser simulado os dados precisa
  public BookEntity() {}
  public BookEntity(Long id, String title, Long publishmentYear, String publisher, Long quantity, String author) {
    this.id = id;
    this.title = title;
    this.publishmentYear = publishmentYear;
    this.publisher = publisher;
    this.quantity = quantity;
    this.author = author;
  }

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

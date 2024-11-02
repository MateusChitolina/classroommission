package com.classroommission.models.converters;

import com.classroommission.infraestructure.entity.BookEntity;
import com.classroommission.models.outputs.BookSearchAllOutput;

public class StorageManagementConverter {
  public static BookSearchAllOutput bookEntityToBookSearchAllOutput(BookEntity bookEntity) {
    
    BookSearchAllOutput bookSearchAllOutput = new BookSearchAllOutput();
    bookSearchAllOutput.setId(bookEntity.getId());
    bookSearchAllOutput.setTitle(bookEntity.getTitle());
    bookSearchAllOutput.setPublisher(bookEntity.getPublisher());
    bookSearchAllOutput.setPublishmentYear(bookEntity.getPublishmentYear());
    bookSearchAllOutput.setQuantity(bookEntity.getQuantity());

    return bookSearchAllOutput;
  }
}

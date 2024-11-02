package com.classroommission.infraestructure.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.classroommission.infraestructure.entity.BookEntity;
import com.classroommission.infraestructure.repository.StorageManagementRepository;
import com.classroommission.infraestructure.utils.JsonUtils;

@Repository
public class StorageManagementRepositoryImpl implements StorageManagementRepository {

  private final JsonUtils jsonUtils;

  public StorageManagementRepositoryImpl(JsonUtils jsonUtils) {
      this.jsonUtils = jsonUtils;
  }

  @Override
  public List<BookEntity> findAllBooks() {
      return jsonUtils.readBooksFromJson();
  }

  @Override
  public void saveBook(BookEntity bookEntity) {
    List<BookEntity> bookEntityList = jsonUtils.readBooksFromJson();

    Long newId = bookEntityList.stream()
            .mapToLong(BookEntity::getId)
            .max()
            .orElse(0L) + 1;

    BookEntity newBook = new BookEntity(
            newId,
            bookEntity.getTitle(),
            bookEntity.getPublishmentYear(),
            bookEntity.getPublisher(),
            bookEntity.getQuantity()
    );

    bookEntityList.add(newBook);

    jsonUtils.writeBooksToJson(bookEntityList);
  }
  
}

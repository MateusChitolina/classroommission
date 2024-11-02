package com.classroommission.infraestructure.repository;

import java.util.List;

import com.classroommission.infraestructure.entity.BookEntity;

public interface StorageManagementRepository {
  public List<BookEntity> findAllBooks();

  public void saveBook(BookEntity bookEntity);
}

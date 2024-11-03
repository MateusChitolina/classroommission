package com.classroommission.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.classroommission.infraestructure.entity.BookEntity;
import com.classroommission.infraestructure.repository.StorageManagementRepository;
import com.classroommission.models.converters.StorageManagementConverter;
import com.classroommission.models.input.BookInput;
import com.classroommission.models.outputs.BookSearchAllOutput;

@Service
public class StorageManagementService {

  private final StorageManagementRepository storageManagementRepository;

  public StorageManagementService(StorageManagementRepository storageManagementRepository) {
    this.storageManagementRepository = storageManagementRepository;
  }

  public List<BookSearchAllOutput> getAlBooks() {
    List<BookEntity> bookEntityList = storageManagementRepository.findAllBooks();

    List<BookSearchAllOutput> classroomSearchAllOutputList = bookEntityList.stream().map(StorageManagementConverter::bookEntityToBookSearchAllOutput).collect(Collectors.toList());

    return classroomSearchAllOutputList;
  }

  public void saveBook(BookInput bookInput) {
    BookEntity bookEntity = new BookEntity();
    bookEntity.setPublisher(bookInput.getPublisher());
    bookEntity.setPublishmentYear(bookInput.getPublishmentYear());
    bookEntity.setQuantity(bookInput.getQuantity());
    bookEntity.setTitle(bookInput.getTitle());
    bookEntity.setAuthor(bookInput.getAuthor());

    storageManagementRepository.saveBook(bookEntity);
}

}

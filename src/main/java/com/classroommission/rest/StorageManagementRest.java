package com.classroommission.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classroommission.models.input.BookInput;
import com.classroommission.models.outputs.BookSearchAllOutput;
import com.classroommission.service.StorageManagementService;

@RestController
@RequestMapping("/storage-management")
public class StorageManagementRest {
  private StorageManagementService storageManagementService;

  public StorageManagementRest(StorageManagementService storageManagementService) {
    this.storageManagementService = storageManagementService;
  }

  @GetMapping("/book/search-all")
  public ResponseEntity<List<BookSearchAllOutput>> getAlBooks() {
    return new ResponseEntity<>(storageManagementService.getAlBooks(), HttpStatus.OK);
  }

  @PostMapping("/book")
  public ResponseEntity<Void> saveBook(@RequestBody BookInput bookInput) {
    storageManagementService.saveBook(bookInput);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
}

package com.classroommission.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.classroommission.models.outputs.ClassroomSearchAllOutput;
import com.classroommission.service.ClassroomService;

@RestController
@RequestMapping("/classroom")
public class ClassroomRest {

  private ClassroomService classroomService;

  public ClassroomRest(ClassroomService classroomService) {
    this.classroomService = classroomService;
  }

  @GetMapping("/search-all")
  public ResponseEntity<List<ClassroomSearchAllOutput>> getAllClassrooms(@RequestParam("userId") String userId) {
    return new ResponseEntity<>(classroomService.getAllClassrooms(userId), HttpStatus.OK);
  }
  
}

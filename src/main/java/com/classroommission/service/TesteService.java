package com.classroommission.service;

import org.springframework.stereotype.Service;

import com.classroommission.infraestructure.entity.TesteEntity;
import com.classroommission.infraestructure.repository.TesteRepository;

@Service
public class TesteService {
  private final TesteRepository testeRepository;

  public TesteService(TesteRepository testeRepository) {
    this.testeRepository = testeRepository;
  }
  
  public Long testeSaveEntity() {
    TesteEntity testeEntity = new TesteEntity();
    testeEntity.setTeste("TEste 1");
    testeEntity = testeRepository.save(testeEntity);

    return testeEntity.getId();
  }
}

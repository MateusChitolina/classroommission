    package com.classroommission.infraestructure.utils;

    import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.classroommission.infraestructure.entity.BookEntity;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

    @Component
    public class JsonUtils {
    private final ObjectMapper objectMapper;

        public JsonUtils(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
        }

        public List<BookEntity> readBooksFromJson() {
            try {
                File file = new File("/db/books.json"); // Caminho relativo ao diretório do projeto
                return objectMapper.readValue(file, new TypeReference<List<BookEntity>>() {});
            } catch (IOException e) {
                throw new RuntimeException("Failed to read books from JSON file", e);
            }
        }

        public void writeBooksToJson(List<BookEntity> bookList) {
            try {
                File file = new File("/db/books.json"); // Caminho relativo ao diretório do projeto
                objectMapper.writeValue(file, bookList);
            } catch (Exception e) {
                throw new RuntimeException("Failed to write books to JSON file", e);
            }
        }
    }

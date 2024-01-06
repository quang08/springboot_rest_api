package com.devtiro.database.domain.dto;

import com.devtiro.database.domain.entities.AuthorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "books")
public class BookDto {
    private String isbn;

    private String title;

    private AuthorDto authorEntity;
}

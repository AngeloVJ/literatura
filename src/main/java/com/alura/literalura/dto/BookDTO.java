package com.alura.literalura.dto;

import com.alura.literalura.model.Language;

public record BookDTO(
        Long id,
        String title,
        String author,
        Language language,
        Integer downloads
) {
}

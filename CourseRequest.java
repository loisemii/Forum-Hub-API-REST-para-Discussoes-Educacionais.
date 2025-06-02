package com.forumhub.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Request para criação/edição de curso")
public class CourseRequest {
    
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
    @Schema(description = "Nome do curso", example = "Spring Boot Avançado")
    private String name;
    
    @Schema(description = "Descrição do curso", example = "Curso completo de Spring Boot...")
    private String description;
    
    @NotBlank(message = "Categoria é obrigatória")
    @Schema(description = "Categoria do curso", example = "Programação")
    private String category;
    
    @Schema(description = "Nome do instrutor", example = "João Silva")
    private String instructorName;
}
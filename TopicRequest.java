package com.forumhub.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Request para criação/edição de tópico")
public class TopicRequest {
    
    @NotBlank(message = "Título é obrigatório")
    @Size(min = 5, max = 200, message = "Título deve ter entre 5 e 200 caracteres")
    @Schema(description = "Título do tópico", example = "Como implementar autenticação JWT?")
    private String title;
    
    @NotBlank(message = "Mensagem é obrigatória")
    @Size(min = 10, message = "Mensagem deve ter pelo menos 10 caracteres")
    @Schema(description = "Conteúdo do tópico", example = "Estou com dúvidas sobre como implementar...")
    private String message;
    
    @NotNull(message = "ID do curso é obrigatório")
    @Schema(description = "ID do curso", example = "1")
    private Long courseId;
}
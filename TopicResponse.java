package com.forumhub.dto.response;

import com.forumhub.model.Topic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response de tópico")
public class TopicResponse {
    
    @Schema(description = "ID do tópico", example = "1")
    private Long id;
    
    @Schema(description = "Título do tópico", example = "Como implementar autenticação JWT?")
    private String title;
    
    @Schema(description = "Mensagem do tópico", example = "Estou com dúvidas sobre...")
    private String message;
    
    @Schema(description = "Nome do autor", example = "João Silva")
    private String authorName;
    
    @Schema(description = "Username do autor", example = "joao123")
    private String authorUsername;
    
    @Schema(description = "Nome do curso", example = "Spring Boot Avançado")
    private String courseName;
    
    @Schema(description = "Data de criação")
    private LocalDateTime createdAt;
    
    @Schema(description = "Data de atualização")
    private LocalDateTime updatedAt;
    
    public static TopicResponse fromEntity(Topic topic) {
        TopicResponse response = new TopicResponse();
        response.setId(topic.getId());
        response.setTitle(topic.getTitle());
        response.setMessage(topic.getMessage());
        response.setAuthorName(topic.getAuthor().getFullName());
        response.setAuthorUsername(topic.getAuthor().getUsername());
        response.setCourseName(topic.getCourse().getName());
        response.setCreatedAt(topic.getCreatedAt());
        response.setUpdatedAt(topic.getUpdatedAt());
        return response;
    }
}
package com.forumhub.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Request para login do usuário")
public class LoginRequest {
    
    @NotBlank(message = "Username é obrigatório")
    @Schema(description = "Nome de usuário", example = "joao123")
    private String username;
    
    @NotBlank(message = "Password é obrigatório")
    @Schema(description = "Senha do usuário", example = "senha123")
    private String password;
}
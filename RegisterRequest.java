package com.forumhub.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Request para registro de novo usuário")
public class RegisterRequest {
    
    @NotBlank(message = "Username é obrigatório")
    @Size(min = 3, max = 50, message = "Username deve ter entre 3 e 50 caracteres")
    @Schema(description = "Nome de usuário", example = "joao123")
    private String username;
    
    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email deve ter formato válido")
    @Schema(description = "Email do usuário", example = "joao@email.com")
    private String email;
    
    @NotBlank(message = "Password é obrigatório")
    @Size(min = 6, message = "Password deve ter pelo menos 6 caracteres")
    @Schema(description = "Senha do usuário", example = "senha123")
    private String password;
    
    @NotBlank(message = "Nome completo é obrigatório")
    @Schema(description = "Nome completo do usuário", example = "João Silva")
    private String fullName;
}
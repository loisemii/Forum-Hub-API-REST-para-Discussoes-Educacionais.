package com.forumhub.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response de autenticação")
public class AuthResponse {
    
    @Schema(description = "Token JWT", example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
    private String token;
    
    @Schema(description = "Tipo do token", example = "Bearer")
    private String type = "Bearer";
    
    @Schema(description = "Username do usuário", example = "joao123")
    private String username;
    
    @Schema(description = "Email do usuário", example = "joao@email.com")
    private String email;
    
    @Schema(description = "Nome completo do usuário", example = "João Silva")
    private String fullName;
    
    public AuthResponse(String token, String username, String email, String fullName) {
        this.token = token;
        this.username = username;
        this.email = email;
        this.fullName = fullName;
    }
}
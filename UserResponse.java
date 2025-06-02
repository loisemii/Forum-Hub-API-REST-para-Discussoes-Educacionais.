package com.forumhub.dto.response;

import com.forumhub.model.Role;
import com.forumhub.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response de usuário")
public class UserResponse {
    
    @Schema(description = "ID do usuário", example = "1")
    private Long id;
    
    @Schema(description = "Username", example = "joao123")
    private String username;
    
    @Schema(description = "Email", example = "joao@email.com")
    private String email;
    
    @Schema(description = "Nome completo", example = "João Silva")
    private String fullName;
    
    @Schema(description = "Role do usuário", example = "USER")
    private Role role;
    
    @Schema(description = "Data de criação")
    private LocalDateTime createdAt;
    
    public static UserResponse fromEntity(User user) {
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setUsername(user.getUsername());
        response.setEmail(user.getEmail());
        response.setFullName(user.getFullName());
        response.setRole(user.getRole());
        response.setCreatedAt(user.getCreatedAt());
        return response;
    }
}
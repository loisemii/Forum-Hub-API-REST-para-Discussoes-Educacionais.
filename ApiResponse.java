package com.forumhub.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response genérico da API")
public class ApiResponse<T> {
    
    @Schema(description = "Status da resposta", example = "success")
    private String status;
    
    @Schema(description = "Mensagem da resposta", example = "Operação realizada com sucesso")
    private String message;
    
    @Schema(description = "Dados da resposta")
    private T data;
    
    public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>("success", message, data);
    }
    
    public static <T> ApiResponse<T> success(String message) {
        return new ApiResponse<>("success", message, null);
    }
    
    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>("error", message, null);
    }
}
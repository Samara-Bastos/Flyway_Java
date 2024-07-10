package projeto.flyway.dto;

import jakarta.validation.constraints.NotBlank;

public record Request(
    @NotBlank
    String codigo, 
    
    @NotBlank
    String titulo, 
    
    @NotBlank
    String descricao, 
    
    @NotBlank
    String autor) {
}

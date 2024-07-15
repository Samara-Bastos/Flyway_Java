package projeto.flyway.dto;

import java.time.LocalDate;

import projeto.flyway.model.Noticia;

public record Response(
    String codigo , 
    String titulo, 
    String descricao, 
    String autor, 
    LocalDate dataPublicacao) {

    public Response(Noticia noticia){
        this(noticia.getCodigo(), noticia.getTitulo(), noticia.getDescricao(), noticia.getAutor(), noticia.getDataPublicacao());
    }

}

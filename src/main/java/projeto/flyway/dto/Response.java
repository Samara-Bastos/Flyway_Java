package projeto.flyway.dto;

import projeto.flyway.model.Noticia;

public record Response(String codigo , String titulo, String descricao, String autor) {
    public Response(Noticia noticia){
        this(noticia.getCodigo(), noticia.getTitulo(), noticia.getDescricao(), noticia.getAutor());
    }
}

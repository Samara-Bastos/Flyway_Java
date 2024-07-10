package projeto.flyway.service;

import java.util.List;
import projeto.flyway.dto.Request;
import projeto.flyway.dto.Response;

public interface NoticiaService {
    Response publicar(Request request);
    List<Response> visualizar();
    Response editar(String código, Request request);
    void excluir(String código);
}

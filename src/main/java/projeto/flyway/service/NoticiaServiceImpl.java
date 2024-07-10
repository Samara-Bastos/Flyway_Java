package projeto.flyway.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import projeto.flyway.Mapper.NoticiaMapper;
import projeto.flyway.dto.Request;
import projeto.flyway.dto.Response;
import projeto.flyway.model.Noticia;
import projeto.flyway.repository.NoticiaRepository;

@Service
public class NoticiaServiceImpl implements NoticiaService {
    
    @Autowired
    NoticiaRepository repository;

    @Override
    public Response publicar(Request request){
        Optional<Noticia> noticiaReturn =  repository.findByCodigo(request.codigo());
        if (noticiaReturn.isPresent()) {
            
        }
        Noticia noticia = NoticiaMapper.INSTANCE.dtoToNoticia(request);
        repository.save(noticia);
        return NoticiaMapper.INSTANCE.noticiaToResponse(noticia); 
    };

    @Override
    public List<Response> visualizar(){
        return repository.findAll().stream().map(Response::new).toList();
    };

    @Override
    public Response editar(String código, Request request){
        Optional<Noticia> noticiaReturn =  repository.findByCodigo(código);
        if (noticiaReturn.isEmpty()) {
            
        }
        Noticia noticia = NoticiaMapper.INSTANCE.dtoToNoticia(request);

        noticiaReturn.get().setTitulo(noticia.getTitulo());
        noticiaReturn.get().setDescricao(noticia.getDescricao());
        noticiaReturn.get().setAutor(noticia.getAutor());

        repository.save(noticiaReturn.get());
        return NoticiaMapper.INSTANCE.noticiaToResponse(noticiaReturn.get()); 
    };

    @Override
    public void excluir(String código){
        Optional<Noticia> noticiaReturn =  repository.findByCodigo(código);
        if (noticiaReturn.isEmpty()) {
            
        }
        repository.delete(noticiaReturn.get());
    };
}

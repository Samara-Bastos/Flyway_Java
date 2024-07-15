package projeto.flyway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import projeto.flyway.dto.Request;
import projeto.flyway.dto.Response;
import projeto.flyway.service.NoticiaService;

import java.util.List;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {
    
    @Autowired
    NoticiaService service;

    @PostMapping("/publicar")
    public ResponseEntity<Response> publicar(@RequestBody @Valid Request request ){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.publicar(request));
    }

    @GetMapping()
    public ResponseEntity<List<Response>> visualizar(){
        return ResponseEntity.status(HttpStatus.OK).body(service.visualizar());
    }

    @PutMapping("/editar/{codigo}")
    public ResponseEntity<Response> editar(@PathVariable String codigo, @RequestBody @Valid Request request ){
        return ResponseEntity.status(HttpStatus.OK).body(service.editar(codigo, request));
    }

    @DeleteMapping("/excluir/{codigo}")
    public ResponseEntity<Void> excluir(@PathVariable String codigo){
        service.excluir(codigo);
        return ResponseEntity.noContent().build();
    }
}

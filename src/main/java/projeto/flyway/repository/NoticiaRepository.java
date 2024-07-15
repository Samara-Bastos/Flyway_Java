package projeto.flyway.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.flyway.model.Noticia;
import java.util.List;


@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
    Optional<Noticia> findById(Long id);    
    Optional<Noticia> findByCodigo(String codigo);
    List<Noticia> findAll();
}

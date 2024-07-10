package projeto.flyway.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import projeto.flyway.dto.Request;
import projeto.flyway.dto.Response;
import projeto.flyway.model.Noticia;

@Mapper(componentModel = "spring")
public interface NoticiaMapper {
    NoticiaMapper INSTANCE = Mappers.getMapper(NoticiaMapper.class);
    Noticia dtoToNoticia(Request request);
    Response noticiaToResponse(Noticia noticia);
}

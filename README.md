# Projeto com Flyway

Esse projeto foi desenvolvido em java com spring boot e tem como a sua principal funcionalidade a publicação de noticias.

## Executar 

O projeto utiliza o Docker para subir um banco PostgreSQL, por isso ao abrir o mesmo execute:

docker compose up -d # Sobe o container do PostgreSQL

Após isso pode iniciar o projeto normalmente.

## Dependências

- Spring Data JPA
- Spring Web
- PostgreSQL Driver
- SpringBoot DevTools
- Docker Compose Support
- Flyway
- Bin Validation
- Swagger
- Mapstruct

## US's

- ✅ [US001] Criar entidade
    - ✅ [US001-1] Entidade noticia
- ✅  [US002] Aplicar a lib Flyway
    - ✅  [US002-1] Inserir a dependência
    - ✅  [US002-2] Criar migration na pasta resources/db/migration
- ✅  [US003] Publicação de noticias
    - ✅  [US003-1] Cadastrar noticia
    - ✅  [US003-2] Visualizar noticia
    - ✅  [US003-3] Editar noticia
    - ✅  [US003-4] Excluir noticia
- ✅  [US004] Criar exceptions personalizadas
    - ✅  [US004-1] Exception FindNoticiaException
    - ✅  [US004-2] Exception NotFoundNoticiaException
    - ✅  [US004-3] Tratativa com ErroHandler
    

## US's - EXTRA

- ✅ [US00X] Criar o campo de data na tabela noticia
    - ✅ [US00X-1] Adcionar campo dataPublicacao na tabela noticia
    - ✅ [US00X-2] Criar atributo dataPublicacao na entidade noticia
    - ✅ [US00X-3] Criar função na service para gravar a data da publicacao
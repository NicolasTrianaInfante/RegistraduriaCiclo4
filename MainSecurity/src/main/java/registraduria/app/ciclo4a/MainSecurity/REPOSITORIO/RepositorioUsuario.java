package registraduria.app.ciclo4a.MainSecurity.REPOSITORIO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import registraduria.app.ciclo4a.MainSecurity.MODELOS.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario, String> {
    @Query("{'correo':?0}")
    public Usuario getUserByMail(String correo);
}

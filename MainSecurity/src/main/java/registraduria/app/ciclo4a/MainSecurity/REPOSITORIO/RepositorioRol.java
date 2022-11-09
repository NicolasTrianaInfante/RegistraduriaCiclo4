package registraduria.app.ciclo4a.MainSecurity.REPOSITORIO;

import org.springframework.data.mongodb.repository.MongoRepository;
import registraduria.app.ciclo4a.MainSecurity.MODELOS.Rol;

public interface RepositorioRol extends MongoRepository<Rol, String > {
}

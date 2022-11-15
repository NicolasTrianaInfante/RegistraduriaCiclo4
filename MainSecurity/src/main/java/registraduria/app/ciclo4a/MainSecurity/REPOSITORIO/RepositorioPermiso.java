package registraduria.app.ciclo4a.MainSecurity.REPOSITORIO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import registraduria.app.ciclo4a.MainSecurity.MODELOS.Permiso;

public interface RepositorioPermiso extends MongoRepository<Permiso, String> {
    @Query("{'url':?0, 'metodo':?1}")
    Permiso getPermiso(String url, String metodo);
}

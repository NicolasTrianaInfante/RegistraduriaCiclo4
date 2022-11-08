package registraduria.app.ciclo4a.MainSecurity.MODELOS;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Rol {
    @Id
    private String _id;
    private  String nombre;
    //Se crea una modificación al modelo y se agrega una variable (descipción)
    private  String descripcion;

    /**
     * Constructor
     * @param nombre
     * @param descripcion
     */
    public Rol(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion= descripcion;
    }

    /**
     * Función para obtener el _id
     * @return
     */

    public String get_id(){
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

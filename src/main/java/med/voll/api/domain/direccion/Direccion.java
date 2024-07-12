package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String calle;
    private String numero;
    private String complemento;
    private String ciudad;
    private String distrito;

    public Direccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.complemento = direccion.complemento();
        this.ciudad = direccion.ciudad();
        this.distrito = direccion.distrito();
    }


    public Direccion actualizarDatos(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.ciudad = direccion.ciudad();
        this.distrito = direccion.distrito();
        this.numero = direccion.numero();
        this.complemento = direccion.complemento();
        return this;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDistrito() {
        return distrito;
    }
}
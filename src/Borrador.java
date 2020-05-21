import java.util.Objects;

public class Borrador {
    Tipo tipo;
    ColorRGB colorPrimario;
    ColorRGB colorSecundario;
    Material material;
    Trama trama;

    public Borrador(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo, "El tipo es obligatorio");
    }

    public void especificarTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public void especificarMaterial(Material material){
        //this.validarConsistenciaMaterialConTipo();
        this.material = Objects.requireNonNull(material, "El material es obligatorio");
    }

    public void especificarColorPrimario(ColorRGB colorPrimario){
        this.colorPrimario =  Objects.requireNonNull(colorPrimario, "El color primario es obligatorio");
    }

    public void especificarColorSecundario(ColorRGB colorSecundario){
        this.colorSecundario = colorSecundario;
    }

    public void especificarTrama(Trama trama){
        this.trama = trama;
    }

    public Prenda crearPrenda(){
        Objects.requireNonNull(this.material, "El material es obligatorio");
        Objects.requireNonNull(this.colorPrimario, "El color primario es obligatorio");
        if(this.trama == null)
            this.trama = Trama.LISA;
        return new Prenda(this.tipo, this.colorPrimario, this.colorSecundario, this.material, this.trama);
    }


}

import java.util.Objects;

public class Prenda {
    Tipo tipo;
    ColorRGB colorPrimario;
    ColorRGB colorSecundario;
    Material material;

    public Prenda(Tipo tipo, ColorRGB colorPrimario, ColorRGB colorSecundario, Material material){
        this.tipo = Objects.requireNonNull(tipo, "El tipo es obligatorio");
        this.colorPrimario = Objects.requireNonNull(colorPrimario, "El color primario es obligatorio");
        this.colorSecundario = colorSecundario;
        this.material = Objects.requireNonNull(material, "El material es obligatorio");
    }
}

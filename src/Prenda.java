import java.util.Objects;

public class Prenda {
    Tipo tipo;
    ColorRGB colorPrimario;
    ColorRGB colorSecundario;
    Material material;
    Trama trama;


    public Prenda(Tipo tipo, ColorRGB colorPrimario, ColorRGB colorSecundario, Material material, Trama trama) {
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.trama = trama;
    }
}

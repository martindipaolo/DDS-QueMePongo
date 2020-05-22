import java.util.Objects;

public class Prenda {
    Tipo tipo;
    ColorRGB colorPrimario;
    ColorRGB colorSecundario;
    Material material;
    Trama trama;
    double temperaturaMaxima;


    public Prenda(Tipo tipo, ColorRGB colorPrimario, ColorRGB colorSecundario, Material material, Trama trama, double temperaturaMaxima) {
        this.tipo = tipo;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.trama = trama;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMaxima(){
        return this.temperaturaMaxima;
    }
}

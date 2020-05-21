

public class Tipo {

    Categoria categoria;

    public Tipo(Categoria categoria) {
        this.categoria = categoria;
    }

    static final Tipo ZAPATOS = new Tipo(Categoria.CALZADO);
    static final Tipo ZAPATILLAS = new Tipo(Categoria.CALZADO);
    static final Tipo CHOMBA = new Tipo(Categoria.PARTE_SUPERIOR);
    static final Tipo PANTALON = new Tipo(Categoria.PARTE_INFERIOR);
    static final Tipo CAMISA = new Tipo(Categoria.PARTE_SUPERIOR);

}

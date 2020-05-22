import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    private Prenda parteSuperior;
    private Prenda parteInferior;
    private Prenda calzado;
    private Prenda accesorio;

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio) {
        validarPrendaConCategoria(parteSuperior, Categoria.PARTE_SUPERIOR);
        this.parteSuperior = parteSuperior;
        validarPrendaConCategoria(parteInferior, Categoria.PARTE_INFERIOR);
        this.parteInferior = parteInferior;
        validarPrendaConCategoria(calzado, Categoria.CALZADO);
        this.calzado = calzado;
        validarPrendaConCategoria(accesorio, Categoria.ACCESORIO);
        this.accesorio = accesorio;
    }

    private List<Prenda> prendasDelAtuendo(){
        List<Prenda> prendas = new ArrayList<Prenda>();
        prendas.add(this.parteSuperior);
        prendas.add(this.parteInferior);
        prendas.add(this.calzado);
        prendas.add(this.accesorio);
        return prendas;
    }

    private void validarPrendaConCategoria(Prenda prenda, Categoria categoria){
        if(prenda.tipo.categoria != categoria)
            throw new PrendaDeOtraCategoriaException();
    }

    public void esValidoParaTemperatura(double temperatura){
        if(this.prendasDelAtuendo().stream().filter(p -> temperatura > p.getTemperaturaMaxima()).count() > 0)
            throw new HaceMuchoCalorParaElAtuendoException();
    }

}

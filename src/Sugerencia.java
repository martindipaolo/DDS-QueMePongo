public class Sugerencia {
    private Atuendo atuendo;
    private InformadorClima informadorClima;

    public Sugerencia(Atuendo atuendo, InformadorClima informadorClima) {
        atuendo.esValidoParaTemperatura(informadorClima.temperaturaActual());
        this.atuendo = atuendo;
        this.informadorClima = informadorClima;
    }

}

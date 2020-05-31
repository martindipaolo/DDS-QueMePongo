public class Sugerencia {
    private Atuendo atuendo;
    private ServicioMeteorologico servicioMeteorologico;

    public Sugerencia(Atuendo atuendo, ServicioMeteorologico servicioMeteorologico) {
        atuendo.esValidoParaTemperatura(servicioMeteorologico.temperaturaActual());
        this.atuendo = atuendo;
        this.servicioMeteorologico = servicioMeteorologico;
    }

}

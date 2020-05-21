public abstract class CreadorUniformes {
    protected abstract Prenda crearParteSuperior();
    protected abstract Prenda crearParteInferior();
    protected abstract Prenda crearCalzado();

    public Uniforme crearUniforme(){
        return new Uniforme(this.crearParteSuperior(), this.crearParteInferior(), this.crearCalzado());
    }
}

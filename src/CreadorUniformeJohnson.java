public class CreadorUniformeJohnson extends CreadorUniformes {

    protected Prenda crearParteSuperior(){
        Borrador borrador = new Borrador(Tipo.CAMISA);
        borrador.especificarColorPrimario(new ColorRGB(255,255,255));
        borrador.especificarMaterial(Material.ALGODON);
        return borrador.crearPrenda();
    }

    protected Prenda crearParteInferior(){
        Borrador borrador = new Borrador(Tipo.PANTALON);
        borrador.especificarColorPrimario(new ColorRGB(0,0,0));
        borrador.especificarMaterial(Material.VESTIR);
        return borrador.crearPrenda();
    }

    protected Prenda crearCalzado(){
        Borrador borrador = new Borrador(Tipo.ZAPATOS);
        borrador.especificarColorPrimario(new ColorRGB(0,0,0));
        borrador.especificarMaterial(Material.CUERO);
        return borrador.crearPrenda();
    }


}

import java.awt.*;

public class CreadorUniformeSanJuan extends CreadorUniformes{

    protected Prenda crearParteSuperior(){
        Borrador borrador = new Borrador(Tipo.CHOMBA);
        borrador.especificarColorPrimario(new ColorRGB(0,255,0));
        borrador.especificarMaterial(Material.PIQUE);
        return borrador.crearPrenda();
    }

    protected Prenda crearParteInferior(){
        Borrador borrador = new Borrador(Tipo.PANTALON);
        borrador.especificarColorPrimario(new ColorRGB(155,155,155));
        borrador.especificarMaterial(Material.ACETATO);
        return borrador.crearPrenda();
    }

    protected Prenda crearCalzado(){
        Borrador borrador = new Borrador(Tipo.ZAPATILLAS);
        borrador.especificarColorPrimario(new ColorRGB(255,255,255));
        borrador.especificarMaterial(Material.LONA);
        return borrador.crearPrenda();
    }
}

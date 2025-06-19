package ar.utnba.ddsi.depoautomatizado.models.entities.robots;


import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Mercaderia;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.EstrategiaObstaculo;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Robot {
    protected Long id;
    protected boolean disponible;
    protected EstrategiaObstaculo estrategiaObstaculo;
    protected Mercaderia mercaderiaCargada;
    protected boolean tieneMercaderia;

    Robot(Long id) {
        this.id = id;
        this.disponible = true;
    }
    public abstract void agarrar(Mercaderia unaMercaderia);
    public abstract void dejar();
    public abstract void avanzar(Float distanciaEnMetros);
    public abstract void girar(Integer anguloDeGiro);
    public abstract void elevar(Float distanciaEnMetros);
} 
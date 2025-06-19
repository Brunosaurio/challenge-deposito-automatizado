package ar.utnba.ddsi.depoautomatizado.models.entities.robots;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Mercaderia;

public class Drone extends Robot {
    
    public Drone(Long id) {
        super(id);
    }

    @Override
    public void agarrar(Mercaderia unaMercaderia) {

    }

    @Override
    public void dejar() {
    }

    @Override
    public void avanzar(Float distanciaEnMetros) {

    }

    @Override
    public void girar(Integer anguloDeGiro) {

    }

    @Override
    public void elevar(Float distanciaEnMetros) {

    }
} 
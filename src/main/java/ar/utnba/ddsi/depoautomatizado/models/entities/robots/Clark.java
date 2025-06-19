package ar.utnba.ddsi.depoautomatizado.models.entities.robots;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Mercaderia;

public class Clark extends Robot {
    
    public Clark(Long id) {
        super(id);
    }

    @Override
    public void agarrar(Mercaderia unaMercaderia) {
        this.mercaderiaCargada = unaMercaderia;
    }

    @Override
    public void dejar() {
        this.mercaderiaCargada = null;
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
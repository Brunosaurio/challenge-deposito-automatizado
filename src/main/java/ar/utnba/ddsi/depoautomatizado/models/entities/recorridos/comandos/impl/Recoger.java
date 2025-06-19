package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.impl;

import ar.utnba.ddsi.depoautomatizado.models.entities.mercaderias.Mercaderia;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.IComando;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Recoger implements IComando {
  Mercaderia unaMercaderia;
  @Override
  public void ejecutar(Robot robot) {
    robot.agarrar(unaMercaderia);
  }
}

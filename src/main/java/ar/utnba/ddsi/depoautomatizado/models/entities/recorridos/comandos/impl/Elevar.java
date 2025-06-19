package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.impl;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.IComando;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Elevar implements IComando {
  private Float ditanciaAElevar;
  @Override
  public void ejecutar(Robot robot) {
    robot.elevar(ditanciaAElevar);
  }
}

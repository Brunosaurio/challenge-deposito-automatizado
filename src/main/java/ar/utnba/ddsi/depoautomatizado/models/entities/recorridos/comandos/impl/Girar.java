package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.impl;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.IComando;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Girar implements IComando {
  private Integer angulo;
  @Override
  public void ejecutar(Robot robot) {
    robot.girar(angulo);
  }
}

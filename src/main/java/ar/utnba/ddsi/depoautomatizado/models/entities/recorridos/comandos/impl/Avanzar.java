package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.impl;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.IComando;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Avanzar implements IComando {
  private Float distanciaEnMetros;

  public Avanzar(Float distanciaEnMetros){
    this.distanciaEnMetros = distanciaEnMetros;
  }
  @Override
  public void ejecutar(Robot robot) {
    robot.avanzar(distanciaEnMetros);
  }
}

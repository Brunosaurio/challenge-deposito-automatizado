package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos.IComando;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;
import java.util.List;

public class Recorrido {
    private List<IComando> comandos;
    public void ejecutarRecorrido(Robot robot) {
        comandos.forEach(c -> c.ejecutar(robot));
    }
} 
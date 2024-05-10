/* 7.- En un colegio se han formado 10 equipos de 5 estudiantes cada uno para participar en unas pruebas deportivas, y se quiere seleccionar al mejor equipo para unos campeonatos regionales. Para ello, el comité del colegio realiza dos pruebas a cada uno de los estudiantes: carrera de 200 m y carrera de 1500 m. El colegio ha establecido un tiempo máximo para cada una de las dos carreras de modo que si algún componente de un equipo supera el tiempo máximo establecido en alguna de las dos pruebas, el equipo es desestimado. De todos los posibles equipos candidatos (equipos no desestimados), el colegio seleccionará aquel cuya suma de tiempos se las dos pruebas de todos sus integrantes sea menor. Se pide un diagrama que resuelva el problema anterior y determine al final si existe algún equipo del colegio que pueda participar en los campeonatos regionales; en dicho caso mostrar por pantalla cuál es el equipo seleccionado (indicar simplemente el número de equipo) y el tiempo total empleado por dicho equipo. Nota: los tiempos máximos establecidos por el colegio para cada una de las dos pruebas pueden solicitarse por teclado o bien especificarlo al principio del diagrama como constantes o bien usar la función random de la librería Math. */

import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int tiempoMaxCarrera200 = 200;
    int tiempoMaxCarrera1500 = 1500;
    int tiempoTotalEquipo = 0;
    int equipoSeleccionado = 0;
    int tiempoTotalEquipoSeleccionado = Integer.MAX_VALUE;
    
    for (int i = 1; i <= 10; i++) {
      System.out.println("Equipo " + i + ":");
      
      for (int j = 1; j <= 5; j++) {
        
        int tiempoCarrera200 = random.nextInt(tiempoMaxCarrera200) + 1;
        int tiempoCarrera1500 = random.nextInt(tiempoMaxCarrera1500) + 1;
        tiempoTotalEquipo = tiempoCarrera200 + tiempoCarrera1500;
        System.out.println("Estudiante " + j + ": " + tiempoTotalEquipo);
        if (tiempoTotalEquipo < tiempoTotalEquipoSeleccionado) {
          tiempoTotalEquipoSeleccionado = tiempoTotalEquipo;
          equipoSeleccionado = i;
        } else {
          if (tiempoTotalEquipo == tiempoTotalEquipoSeleccionado) {
            equipoSeleccionado = 0;

          }

        }
      }
      

      
    }

  }

}
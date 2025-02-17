package team;
//Utilizamos los package en minusculas
public class Futbolista extends Personal{
    //Utilizamos las variables en formato lowerCamelCase

    private int numeroJugador;
    private String posicion;

    public Futbolista (int idTrabajdor, String nombre, String apellido, int numeroJugador, String posicion)  {
        super(idTrabajdor, nombre, apellido);
        this.numeroJugador = numeroJugador;
        this.posicion = posicion;
    }

    //Agregamos anotaciones
    @Override
    public void concentrarse() {
        System.out.println("Jugador concentrandose.");
    }

    @Override
    public void viajar() {
        System.out.println("Jugador viajando.");
    }

    public void jugarPartido() {
        System.out.println("Jugador en un partido.");
    }

    public void entrenar() {
        System.out.println("Jugador en entrenamiento");
    }

    @Override
    public String toString() {
        return "Futbolista " + nombre + "numero = " + numeroJugador + ",posicion = " + posicion;
    }
}

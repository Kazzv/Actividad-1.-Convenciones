package team;
// Utilizamos package en minisculas.
public class Entrenador extends Personal {
    // Nombre de clases en UpperCamelCase

    private int idFederacion;
    public Entrenador(int idTrabajador, String nombre, String apellido, int idFederacion) {
        super(idTrabajador, nombre, apellido);
        this.idFederacion = idFederacion;
    }
    // Uso de anotaciones
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose.");
    }
    @Override
    public void viajar() {
        System.out.println("Viajando.");
    }
    public void dirigirPartido() {
        System.out.println("Dirigiendo un partido.");
    }
    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo el entrenamiento.");
    }
    @Override
    public String toString() {
        return "Entrenador" + nombre;
    }
}
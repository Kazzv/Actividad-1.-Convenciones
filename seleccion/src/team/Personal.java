package team; //Definimos el package en minusculas

public abstract class Personal {
    //Definimos la clase usando UpperCamelCasse
    protected int idTrabajdor;
    protected String nombre;
    protected String apellido;
    //Definimos las variables con lowerCamelCase

    public Personal(int idTrabajdor, String nombre, String apellido) {
        this.idTrabajdor = idTrabajdor;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre; //lowerCamelCase
    }

    abstract void concentrarse();

    abstract void viajar();
}

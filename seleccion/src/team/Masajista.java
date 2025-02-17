package team;
//Utilizamos los packager en minusculas.
public class Masajista extends Personal {
    /*Nombre de las clases en UpperCamelCase y
    variables en lowerCamelCase */
    private String profesion;
    private int aniosExperiencia;

    public Masajista (int idTrabajador, String nombre, String apellido, String profesion, int aniosExperiencia) {
        super(idTrabajador, nombre, apellido);
        this.profesion = profesion;
        this.aniosExperiencia = 0;
    }

    //Agregamos anotaciones
    @Override
    public void concentrarse() {
        System.out.println("Concentrandose" + this.nombre);
    }

    @Override
    public void viajar() {
        System.out.println("En viaje");
    }

    public void darMasaje() {
        System.out.println("Dando un masaje");
    }

    @Override
    public String toString() {
        return "Masajista" + nombre + " con" +  aniosExperiencia + "años de experiencia " + "en: " + profesion;
    }
}

import team.*;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolista1 = new Futbolista (01, "Pancho", "Villa", 11, "Central");
        Entrenador entrenador1 = new Entrenador (02, "Ernesto", "Octavius", 2);
        Masajista masajista1 = new Masajista (03, "Lip", "Tripaloski", "Terapeuta", 11);

        System.out.println("Las actividades que realizan los integrantes del equipo son: ");

        System.out.println(futbolista1.getNombre() + " esta: ");
        futbolista1.concentrarse();

        System.out.println(entrenador1.getNombre() + " Se encuentra: ");
        entrenador1.dirigirEntrenamiento();

        System.out.println(masajista1.getNombre() + " esta: ");
        masajista1.darMasaje();

    }
}

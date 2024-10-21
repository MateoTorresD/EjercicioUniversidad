public class Universidad {
    private String nombreUniversidad;
    private int MaxEstudiantes = 200;
    private Estudiante[] estudiantes;

    //Constructores

    public Universidad() {
        this.estudiantes = new Estudiante[MaxEstudiantes];
    }

    public Universidad(String nombreUniversidad) {
        this();
        this.nombreUniversidad = nombreUniversidad;
    }


    public Universidad(String nombreUniversidad, int[] Estudiantes) {
        this(nombreUniversidad);
    }

    public void agregarEstudiante (String nombre, double[] notas){
        for(int i =0; i<estudiantes.length; i++){
            if (estudiantes[i] == null) {
                estudiantes[i] = new Estudiante(nombre, notas);
                break;
            }
        }

    }

    public void verDetalle() {
        // Imprimir título de la tabla
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Universidad", "Estudiante", "Ec. Diferenciales", "Programacion", "Fisica", "Promedio");

        // Imprimir detalles de los estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                double[] notas = estudiantes[i].getNotas();
                double promedio = Promedio(notas);
                System.out.printf("%-20s %-20s %-20.2f %-20.2f %-20.2f %-20.2f\n",
                        nombreUniversidad,
                        estudiantes[i].getNombreEstudiante(),
                        notas[0], notas[1], notas[2], promedio);
            }
        }
    }


    public double Promedio(double[] notas){
        double suma = 0;
        for (int i =0; i<notas.length; i++){
            suma += notas[i];
        }
        return (suma/notas.length);
    }


}

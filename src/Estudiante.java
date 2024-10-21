public class Estudiante {
    private String nombreEstudiante;
    private double[] notas;

    //constructores

    public Estudiante(){
    }

    public Estudiante (String nombreEstudiante){
        this.nombreEstudiante = nombreEstudiante;
    }

    public Estudiante (String nombreEstudiante, double[] notas){
        this(nombreEstudiante);
        this.notas = notas;
    }

    //getter y setter


    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


}
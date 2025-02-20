package ec.espoch.edu.recuperacion.Clases;

//Aqui los atributos
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int fechaNacimiento;

    //Constructor
    public Persona(int id, String nombre, String apellido, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    // Aqui van los metodos
    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Nacionalidad: " + this.nacionalidad);
        System.out.println("FechaNacimiento: " + this.fechaNacimiento);
    }

    public String imprimirDatos() {

        return "Nombre:" + this.nombre + "\n Apellido:" + this.apellido + "\n";

    }

    public String calcularEdad(int edad) {
        String msm;
        if (edad > 18) {
            if (edad > 18) {
                msm = "eres mayor de edad....";
            } else {
                msm = "eres menor de edad...";
            }
        } else {
            msm = "no existen edades negativas";

        }
        return msm;
    }

    public String situacionTrabajo(Horario objHorario) {
        String msm;
        if (objHorario.getNumeroHorasTrabajo() > 8) {
            msm = "Estas trabajando mas de lo establecido......";
        } else if (objHorario.getNumeroHorasTrabajo() == 8) {
            msm = "Estas trabajando lo normal...";
        } else {
            msm = "Aun no has trabajado lo suficiente....";
        }
        return msm;
    }

    public String identificarDiaTrabaj0(Horario objHorario) {
        String msm;

        switch (objHorario.getDiaTrabajo()) {
            case "lunes":
                msm = "Es un dia laborable";
                break;
            case "martes":
                msm = "Es un dia laborable";
                break;
            default:
                throw new AssertionError();
        }
        return msm;

    }

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}

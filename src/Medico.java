import java.util.Random;

public class Medico extends Persona{
    private String especialidad;
    private int añosExperiencia;
    private boolean disponibilidad;


    public Medico() {
        super();
        this.especialidad = Persona.IngresarDato("Ingrese la especialidad");
        this.añosExperiencia = IngresarNumero("Ingrese los años de experiencia");
        this.disponibilidad = new Random().nextBoolean();
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public int getAñosExperiencia() {
        return this.añosExperiencia;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }

    public void setEspecialidad(final String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(final int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setDisponibilidad(final boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Especialidad: "+getEspecialidad()+"\nAños de experiencia: "+getAñosExperiencia()+"\nDisponibilidad: "+isDisponibilidad()+"\n";
    }
}
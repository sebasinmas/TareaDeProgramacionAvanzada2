import java.util.ArrayList;
import java.util.List;

public class CentroMedico {
    private List<Persona> medicos = new ArrayList<Persona>();
    private List<Persona> pacientes = new ArrayList<Persona>();
    private final String nombre;
    private final String ubicacion;
    public CentroMedico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }


    @Override
    public String toString() {
        return nombre+" "+ubicacion+"."+"\nCantidad de pacientes: "+pacientes.size()+"\nCantidad de medicos: "+medicos.size();
    }

    // getters y setter
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setMedicos(List<Persona> medicos) {
        this.medicos = medicos;
    }

    public void setPacientes(List<Persona> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Persona> getMedicos() {
        return medicos;
    }

    public List<Persona> getPacientes() {
        return pacientes;
    }
}

import java.util.List;

public class CentroMedico {
    private List<Persona> medicos = new List<Persona>();
    private List<Persona> pacientes = new List<Persona>();

    public CentroMedico(){

    }

    
    // getters y setters
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

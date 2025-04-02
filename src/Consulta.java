import java.util.Scanner;

public class Consulta{

    private final int Id;
    private final String medicoRut;
    private final String pacienteRut;
    private final CentroMedico centroMedico;
    private String fecha,hora,motivo;
    private static final Scanner scanner = new Scanner(System.in);

    public Consulta(int Id, CentroMedico centroMedico) {
        this.Id = Id;
        this.fecha = ingresarDato("Ingrese la fecha de la consulta");
        this.hora = ingresarDato("Ingrese la hora de la consulta");
        this.motivo = ingresarMotivo("Ingrese el motivo de la consulta");
        this.medicoRut = ingresarDato("Ingrese el rut del medico de la consulta");
        this.pacienteRut = ingresarDato("Ingrese el rut del paciente de la consulta");
        this.centroMedico = centroMedico;
    }

    public int getId() {return Id;}
    public String getMedicoRut() {return medicoRut;}
    public String getPacienteRut() {return pacienteRut;}

    public CentroMedico getCentroMedico() {
        return centroMedico;
    }

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}
    public String getHora() {return hora;}
    public void setHora(String hora) {this.hora = hora;}
    public String getMotivo() {return motivo;}
    public void setMotivo(String motivo) {this.motivo = motivo;}

    private String ingresarDato(String texto){
            System.out.println(texto);
            String input = scanner.nextLine();
            return input;
    }
    private String ingresarMotivo(String texto){
        System.out.println(texto);
        String input = scanner.nextLine();
        return input;
    }
}
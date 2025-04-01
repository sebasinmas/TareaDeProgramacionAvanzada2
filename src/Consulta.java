package src;

public class Consulta{

    private final int Id;
    private final int medicoRut;
    private final int pacienteRut;
    private String fecha,hora,motivo;

    public Consulta(int Id, String fecha, String hora, String motivo, int medicoRut, int pacienteRut) {
        this.Id = Id;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.medicoRut = medicoRut;
        this.pacienteRut = pacienteRut;
    }

    public int getId() {return Id;}
    public int getMedicoRut() {return medicoRut;}
    public int getPacienteRut() {return pacienteRut;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}
    public String getHora() {return hora;}
    public void setHora(String hora) {this.hora = hora;}
    public String getMotivo() {return motivo;}
    public void setMotivo(String motivo) {this.motivo = motivo;}
}
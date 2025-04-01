package src;

import java.util.ArrayList;
import java.util.List;

public class ConsultaMang {

    private final List<Consulta> consultas;

    public ConsultaMang() {
        this.consultas = new ArrayList<>();
    }

    public boolean agregarConsulta (int consultaId, String fecha, String hora, String motivo, int medicoRut, int pacienteRut){
        consultaId = consultas.size()+1;
        Consulta nuevaConsulta = new Consulta(consultaId, fecha,hora,motivo,medicoRut,pacienteRut);
        return consultas.add(nuevaConsulta);
    }

    public boolean modificarConsulta(int consultaId, String fecha, String hora, String motivo) {
        for (Consulta consulta : consultas) {
            if (consulta.getId() == consultaId) {
                consulta.setFecha(fecha);
                consulta.setHora(hora);
                consulta.setMotivo(motivo);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarConsulta(int consultaId) {
        return consultas.removeIf(consulta -> consulta.getId() == consultaId);
    }

    public List<Consulta> obtenerConsultas() {
        return new ArrayList<>(consultas);
    }




}

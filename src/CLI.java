import java.util.Scanner;
import java.util.UUID;
public class CLI {
    private Scanner scanner = new Scanner(System.in);
    private CentroMedico cm;
    public CLI(CentroMedico cm){
        this.cm = cm;
    }
    public void Execute(){
        int option = 0;
        do{
            InfoOption();
            option = scanner.nextInt();
            Options(option);
        }while(option != 0);
    }
    private void Options(int option){
        switch(option){
            case 1: CrearMedico();
            break;
            case 2:
                CrearPaciente();
                break;
            case 3:
                CrearCitaMedica();
                break;
            case 4:
                System.out.println(cm);
                break;
        }
    }
    private void CrearMedico(){
        Medico medico = new Medico();
        cm.getMedicos().add(medico);
    }
    private void CrearPaciente(){
        Paciente paciente = new Paciente();
        cm.getPacientes().add(paciente);
    }
    private void InfoOption(){
        System.out.print("Presione 0 para salir\n1 para agregar un Medico\n2 para agregar un paciente\n3 para crear una cita medica\n4 para información del centro médico\n");
    }
    private void CrearCitaMedica(){
        Consulta consulta = new Consulta(UUID.randomUUID().hashCode(), cm);
        cm.getConsultas().add(consulta);

    }

}

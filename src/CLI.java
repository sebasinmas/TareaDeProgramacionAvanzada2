import java.util.Scanner;

public class CLI {
    private Scanner scanner = new Scanner(System.in);
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

        }
    }
    private void CrearMedico(){
        Medico medico = new Medico();
    }
    private void CrearPaciente(){
        Paciente paciente = new Paciente();
    }
    private void InfoOption(){
        System.out.printf("Presione 0 para salir, 1 para agregar un Medico, 2 para agregar un paciente,\n3 para crear una cita medica");
    }
    private void CrearCitaMedica(){

    }
}

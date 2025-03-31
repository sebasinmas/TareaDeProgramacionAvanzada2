import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona{
    private static List<Paciente> pacientes = new ArrayList<>();

    public Paciente() {
        super();
        pacientes.add(this);
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return super.toString()+"R.U.T.: "+getRut()+"\nTeléfono: "+getNumero();
    }
}
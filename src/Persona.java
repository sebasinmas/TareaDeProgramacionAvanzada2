import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Persona {
    List<String> ruts = new ArrayList<String>();
    private String name;
    private String rut;
    private String numero;
    private static Scanner scanner = new Scanner(System.in);

    public Persona() {
        this.name = IngresarDato("Ingrese el nombre del paciente");
        String theRut = IngresarDato("Ingrese el rut del paciente");
        this.rut = ExisteRUT(theRut);
        this.numero = IngresarDato("Ingrese el numero del paciente");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public String getRut() {
        return rut;
    }

    public String getNumero() {
        return numero;
    }
    public String ExisteRUT(String rut){
        for(String therut : ruts){
            if(therut.equals(rut)){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new MatchException("El rut ingresado ya existe",e);
                }
            }
        }
        return rut;
    }
    public static String IngresarDato(String texto){
        System.out.println(texto);
        return scanner.next();
    }
    public static int IngresarNumero(String texto){
        System.out.println(texto);
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Nombre:"+name+"\n";
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Persona {
    static List<String> ruts = new ArrayList<String>();
    private String name;
    private String rut;
    private String numero;
    private static final Scanner scanner = new Scanner(System.in);

    public Persona() {
        this.name = IngresarDato("Ingrese el nombre");
        this.rut = ExisteRUT(IngresarDato("Ingrese el rut"));
        this.numero = IngresarDato("Ingrese el numero");
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
            if(therut.equalsIgnoreCase(rut)){
                System.out.println("El rut ingresado ya existe");
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

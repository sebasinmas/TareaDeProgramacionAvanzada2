public class Persona {
    List<String> ruts = new List<String>();
    private string name;
    private String rut;
    private String numero;

    public Persona(String name, String rut, String numero) {
        this.name = name;
        this.rut = rut;
        this.numero = numero;
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
    public void ExisteRUT(string rut){

    }
}

public class Paciente extends Persona{
    @Override
    public String toString() {
        return super.toString()+"R.U.T.: "+getRut()+"\nTeléfono: "+getNumero();
    }
}
public class Main{
        public static void main(String[] args){
            CentroMedico miraflores = new CentroMedico("Miraflores","Miraflores 9047");
            CLI cli = new CLI(miraflores);
            cli.Execute();
    }
}
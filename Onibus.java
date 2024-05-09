public class Onibus extends Veiculo{

    int CapaPss;
    int Portas;
    int Nparadas;

    public Onibus(int CapaPss, int Portas, int Nparadas){

        this.CapaPss = CapaPss;
        this.Portas = Portas;
        this.Nparadas = Nparadas;

    }

    public int getCapaPss(){

        return CapaPss;
    }

    public int getPortas(){

        return Portas;
    }

    public int getNparadas(){

        return Nparadas;
    }

    public void Entrar(){

        System.out.println("Entrando no onibus!!");
    }

    public void Sair(){

        System.out.println("Saindo do onibus!!");
    }
}

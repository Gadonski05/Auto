public class Onibus extends Veiculo{

    private int CapaPss;
    private int Portas;
    private int Nparadas;

    public Onibus(int CapaPss, int Portas, int Nparadas){
        super(cor, Nparadas, cor, ligar);

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

    public void setCapaPss(int capaPss) {

        CapaPss = capaPss;
    }

    public void setPortas(int portas) {

        Portas = portas;
    }

    public void setNparadas(int nparadas) {

        Nparadas = nparadas;
    }

    public void Entrar(){

        System.out.println("Entrando no onibus!!");
    }

    public void Sair(){

        System.out.println("Saindo do onibus!!");
    }

    public void Freiando() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Freiando'");
    }

    public void Virar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Virar'");
    }

    public void CapaPss() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CapaPss'");
    }

    public void Nparadas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Nparadas'");
    }

    public void Portas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Portas'");
    }
}

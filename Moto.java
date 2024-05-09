public class Moto extends Veiculo{

    public static final String Virar = null;
    private int Cilindradas;
    private String tipoCombustivel;
    private String tipoFreio;

    public Moto(int Cilindradas, String tipoCombustivel, String tipoFreio){

        this.Cilindradas = Cilindradas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoFreio = tipoFreio;
    }
    
    public int getCilindadas(){

        return Cilindradas;
    }

    public String getTipocombustivel(){

        return tipoCombustivel;
    }

    public String getTipofreio(){

        return tipoFreio;
    }

    public void Mot(){

        System.out.println("Subindo na moto!!");
    }

    public void Ligarmoto(){

        System.out.println("Ligando a moto!!");
    }

    public void Desligarmoto(){

        System.out.println("Desligando a moto!!");
    }

    public void Mdesportivo(){

        System.out.println("Ronco mudou!!");
    }
}

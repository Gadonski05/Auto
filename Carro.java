public class Carro extends Veiculo{

    private static boolean ligar;
    private String tipoTransmissao;
    private int numPortas;
    private float portaMalas;

    public Carro(String modelo, int ano, String cor, int numPortas, String tipoTransmissao, float portaMalas){
        super(modelo, ano, cor, ligar);

        this.tipoTransmissao = tipoTransmissao;
        this.numPortas = numPortas;
        this.portaMalas = portaMalas;
    }

    public int getNumportas(){

        return numPortas;
    }

    public void setNumportas(int numPortas){

        this.numPortas = numPortas;
    }

    public String getTipotransmissao(){

        return tipoTransmissao;
    }

    public void setTipotrasmissao(String tipoTransmissao){

        this.tipoTransmissao = tipoTransmissao;
    }

    public float getPoratamalas(){

        return portaMalas;
    }
    public void setPortamalas(float portaMalas){

        this.portaMalas = portaMalas;
    }

    public void Ligarfarol(){

        System.out.println("Ligando farol!!");
    }

    public void Abrirteto(){
        
        System.out.println("Abrindo teto!!");
    }

    public void Fechandoteto(){

        System.out.println("Fechando teto!!");
    }

    public void Freiando() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Freiando'");
    }
}



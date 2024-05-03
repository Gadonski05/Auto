public class Carro extends Veiculo{

    public Carro(String modelo, int ano, String cor, int numPortas, String tipoTransmissao, float portaMalas){
        super(modelo, ano, cor);

        this.tipoTransmissao = tipoTransmissao;
        this.numPortas = numPortas;
        this.portaMalas = portaMalas;
    }
    
    private int numPortas;
    private String tipoTransmissao;
    private float portaMalas;
    
    public Carro(int numPortas, String tipoTransmissao, float portaMalas){
        
        this.numPortas = numPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.portaMalas = portaMalas;
    }

    public int getNumportas(){

        return numPortas;
    }

    public String getTipotransmissao(){

        return tipoTransmissao;
    }

    public float getPoratamalas(){

        return portaMalas;
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
}



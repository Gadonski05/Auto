public class Veiculo {
    
    private String modelo;
    private int ano;
    //Essa classe tem acesso e os filhos dessa classe também podem acessar
    protected static String cor;
    protected static boolean ligar;
 
    public Veiculo(String modelo, int ano, String cor, boolean ligado){
 
     this.modelo = modelo;
     this.ano = ano;
     Veiculo.cor = cor;
     Veiculo.ligar = false;
 
    }
 
    public String getModelo(){
 
     return modelo;
 }
 
 public int getAno(){
 
     return ano;
 }
 
 public String getCor(){
 
     return cor;
 }
 
 public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void setAno(int ano) {
    this.ano = ano;
}

public void setCor(String cor) {

    Veiculo.cor = cor;
}

public void setLigar(boolean ligar) {
    
    Veiculo.ligar = ligar;
}

public void Ligar(){
 
     Veiculo.ligar = true;
 
     System.out.println("Ligando o veiculo!!");
 }
 
 public void Desligar(){
 
     System.out.println("Desligando veiculo!!");
 }
 
 public void Acelerar(){
 
     System.out.println("Acelerando veiculo!!");
 }
 
 public void Frear(){
     
     System.out.println("Freando veiculo!!");
 }
 }
 
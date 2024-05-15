public class Veiculo {
    
    private String modelo;
    private int ano;
    //Essa classe tem acesso e os filhos dessa classe também podem acessar
    protected String cor;
    private boolean ligar;
 
    public Veiculo(String modelo, int ano, String cor, boolean ligado){
 
     this.modelo = modelo;
     this.ano = ano;
     this.cor = cor;
     this.ligar = false;
 
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
 
 public void Ligar(){
 
     this.ligar = true;
 
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
 
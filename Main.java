public class Main {
    
    public static void main(String[] args) {
        
        Veiculo v = new Veiculo();
        Carro c = new Carro(4, null, 40);
        Bicicleta b = new Bicicleta();
        
        v.ligar();
        v.desligar();
        v.acelerar();
        v.frear();
        //V.ligarFarol();
        //V.AbrirTeto();

        c.ligar();
        c.desligar();
        c.acelerar();
        c.frear();
        c.ligarFarol();
        c.AbrirTeto();
        //c.pedalar();
        //c.parar();

        b.ligar();
        b.desligar();
        b.acelerar();
        b.frear();
        //V.ligarFarol();
        //V.AbrirTeto();
    }
}

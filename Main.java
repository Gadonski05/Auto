public class Main {
    
    public static void main(String[] args) {

        //Essa parte é composta por todas as subclasses e a classe base
        //Ela puxa todas as variáveis
        
        Veiculo v = new Veiculo(null, 0, "Azul", false);
        Carro c = new Carro(null, 4, "Forjada", 40, null, 0);
        Moto m = new Moto(150, "Gasolina", "Pastilha");
        Onibus o = new Onibus(100, 5, 30);
        Bicicleta b = new Bicicleta(11, "Hidraulico", "MTB");
        

        // Cada bloco faz parte das subclasses
        // Onde ocorre a separação de cada herança
        v.Ligar();
        v.Desligar();
        v.Acelerar();
        //v.Freiando();
        //v.Virar();
        
        c.Ligar();
        c.Desligar();
        c.Acelerar();
        c.Freiando();
        c.Ligarfarol();
        //c.Desligandofarol();
        c.Fechandoteto();
        c.Abrirteto();

        m.Ligarmoto();
        m.Desligar();
        m.Acelerar();
        //m.Freiando();
        //m.Virar();
        //m.Mdesportivo();

        o.Ligar();
        o.Desligar();
        o.Acelerar();
        //o.Freiando();
        //o.Virar();
        o.Entrar();
        // o.CapaPss();
        //o.Nparadas();
        //o.Portas();

        
        b.Pedalar();
        b.Parar();
        //b.Bike();
       
    }
}

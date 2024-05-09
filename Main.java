public class Main {
    
    public static void main(String[] args) {
        
        Veiculo v = new Veiculo(null, 0, "Azul", false);
        Carro c = new Carro(4, "Forjada", 40);
        Moto m = new Moto(150, "Gasolina", "Pastilha");
        Onibus o = new Onibus(100, 5, 30);
        Bicicleta b = new Bicicleta(11, "Hidraulico", "MTB");
        
        v.Ligar();
        v.Desligar();
        v.Acelerar();
        v.Freiando();
        v.Virar();
        
        c.Ligar();
        c.Desligar();
        c.Acelerar();
        c.Freiando();
        //c.Ligarfarol();
        //c.Desligandofarol;
        //c.Fechandoteto();
        //c.Abrirteto();

        m.Ligarmoto();
        m.Desligar();
        m.Acelerar();
        m.Freiando();
        m.Virar();
        //m.Mdesportivo();

        o.Ligar();
        o.Desligar();
        o.Acelerar();
        o.Freiando();
        o.Virar();
        o.Entrar();
        //o.CapaPss;
        //o.Nparadas;
        //o.Portas;

        
        b.Pedalar();
        b.Parar();
        //b.Bike;
       
    }
}

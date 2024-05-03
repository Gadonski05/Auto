public class Bicicleta extends Veiculo {

    private int numeroMarchas;
    private  String tipoFreio;
    private String estiloQuadro;
    
}

public Bicicleta(int numeroMarchas, String tipoFreio, String estiloQuadro){

    this.numeroMarchas = numeroMarchas;
    this.tipoFreio = tipoFreio;
    this.estiloQuadro = estiloQuadro;
}

public int getNumeromarchas(){

    return numeroMarchas;
}

public String getTipofreio(){

    return tipoFreio;
}

public String getEstiloquadro(){

    return estiloQuadro;
}

public void Bicicleta(){

    System.out.println("Subindo na bike!!");
}

public void Pedalar(){

    System.out.println("Pedalando!!");
}

public void Parar(){

    System.out.println("Parando a bicicleta!!");
}

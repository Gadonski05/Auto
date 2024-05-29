public class Bicicleta extends Veiculo {

    private int numeroMarchas;
    private  String tipoFreio;
    private String estiloQuadro;

public Bicicleta(int numeroMarchas, String tipoFreio, String estiloQuadro){
    super(tipoFreio, numeroMarchas, estiloQuadro, ligar);

    this.numeroMarchas = numeroMarchas;
    this.tipoFreio = tipoFreio;
    this.estiloQuadro = estiloQuadro;
}

public int getNumeromarchas(){

    return numeroMarchas;
}

public void setNumeromarchas(int numeroMarchas){

    this.numeroMarchas = numeroMarchas;
}

public String getTipofreio(){

    return tipoFreio;
}

public void setTipofreio(String tipoFreio){

    this.tipoFreio = tipoFreio;
}

public String getEstiloquadro(){

    return estiloQuadro;
}

public void setEstiloquadro(String estiloQuadro){

    this.estiloQuadro = estiloQuadro;
}

public void bicicleta(){

    System.out.println("Subindo na bike!!");
}

public void Pedalar(){

    System.out.println("Pedalando!!");
}

public void Parar(){

    System.out.println("Parando a bicicleta!!");

}

}
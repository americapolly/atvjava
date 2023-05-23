public class Veiculos {
public String marca;
public String modelo;
public String combustivel;

  
public Veiculos(String marca, String modelo, String combustivel) {
    this.marca = marca;
    this.modelo = modelo;
    this.combustivel = combustivel;
     
}

public void consumoMedio(int kmRodado, int consumoLitros) {
    double consumo = (double) kmRodado / consumoLitros;
    System.out.println("O consumo médio do veículo é: " + consumo + " km/l");
}

public String getMarca() {
    return marca;
}

public String getModelo() {
    return modelo;
}

public String getCombustivel() {
    return combustivel;
}
public void setMarca(String marca) {
    this.marca = marca;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
}
}
public class Carro extends Veiculos {
public int potencia;
public int  capacidade;
public Carro(String marca, String modelo, String combustivel, int potencia, int capacidade) {
    super(marca, modelo, combustivel);
    this.potencia = potencia;
    this.capacidade = capacidade;
}

public void imprimirDados() {
    System.out.println("Marca do carro: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Combustível: " + getCombustivel());
    System.out.println("Potência: " + potencia + " cv");
    System.out.println("Capacidade: " + capacidade + " litros");
    consumoMedio(200, 10);
}
}
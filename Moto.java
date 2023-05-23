public class Moto extends Veiculos {
public int potencia;
public int capacidade;
public Motorista motorista;

public Moto(String marca, String modelo, String combustivel, int potencia, int capacidade) {
    
    super(marca, modelo, combustivel);
    this.potencia = potencia;
    this.capacidade = capacidade;
}
  public void setMotorista(Motorista motorista) {
this.motorista = motorista;
}

public Motorista getMotorista() {
return motorista;
}

public void imprimirDados() {
    System.out.println("Marca da moto: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Combustível: " + getCombustivel());
    System.out.println("Potência: " + potencia + " cc");
    System.out.println("Capacidade: " + capacidade + " litros");
      consumoMedio(100, 5);
   if (motorista != null) {
 System.out.println("Motorista: " +    motorista.getNome());
 System.out.println("Idade: " +        motorista.getIdade());
 System.out.println("Categoria: " +    motorista.getCategoria());
  }
  }
public void alterarDados(String marca, String modelo, String combustivel, int potencia, int capacidade) {
setMarca(marca);
setModelo(modelo);
setCombustivel(combustivel);
this.potencia = potencia;
this.capacidade = capacidade;
}
public void excluirDados() {
setMarca(null);
setModelo(null);
setCombustivel(null);
this.potencia = 0;
this.capacidade = 0;
}
}

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Motorista motorista = new Motorista("Emmanuel", 37, "A");
        motorista.imprimirDados();
        System.out.println();

        Motorista motorista2 = new Motorista("João", 30, "B");
        motorista2.imprimirDados();
        System.out.println();

        Moto moto = new Moto("Honda", "CB 500", "Gasolina", 50, 15);
        System.out.println("Adicionando dados e imprimindo.");
        moto.imprimirDados();
        moto.consumoMedio(100, 5);
        System.out.println();

        System.out.println("Deletando dados e imprimindo...");
        moto.excluirDados();

        if(moto.potencia != 0){
            moto.imprimirDados();
        } else{
            System.out.println("Dados deletados com sucesso");
        }
        System.out.println();

        Moto moto2 = new Moto("Suzuki", "MT-07", "Gasolina", 75, 14);
        moto2.imprimirDados();
        moto2.consumoMedio(100, 8);
        System.out.println();

        Moto moto3 = new Moto("Yamaha", "GSX-R1000", "Gasolina", 185, 15);
        moto3.imprimirDados();
        System.out.println();

        Carro carro = new Carro("Volkswagen", "Gol", "Flex", 80, 40);
        carro.imprimirDados();
        System.out.println();

        Carro carro2 = new Carro("Chevrolet", "Onix", "Flex", 100, 45);
        carro2.imprimirDados();
        System.out.println();

        Carro carro3 = new Carro("Ford", "EcoSport", "Flex", 123, 52);
        carro3.imprimirDados();
        System.out.println();
    }
}
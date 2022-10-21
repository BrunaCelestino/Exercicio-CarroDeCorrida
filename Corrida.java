public class Corrida {
    public static void main(String[] args) {
        Piloto pilotoBruna = new Piloto("Bruna", 27, Sexo.CISFEMININO, "black");
        CarroCorrida carro = new CarroCorrida(9, pilotoBruna, 60);

        System.out.println(carro);
        Piloto pilotoFelipe = new Piloto("Felipe", 26, Sexo.CISMASCULINO, "black");


        carro.ligar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.acelerar();
        carro.acelerar();
        carro.desligar();
        carro.frear();
        carro.frear();
        carro.parar();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.parar();
        carro.desligar();
        carro.desligar();
        carro.acelerar();
        carro.frear();
        carro.parar();
        carro.ligar();
        carro.ligar();
        carro.frear();
        carro.acelerar();
        carro.frear();
        carro.setVelocidadeMaxima(80);
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.pisarFundo(90);
        carro.acelerar();
        carro.frearBruscamente(10);
        carro.setPiloto(pilotoFelipe);
        carro.frearBruscamente(90);
        carro.setPiloto(pilotoFelipe);
        System.out.println(carro);
    }

}

public class CarroCorrida {
    public Integer numeroCarro;
    public Piloto piloto;
    public float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        if(this.velocidadeAtual > 0) {
            System.out.println("Para trocar de piloto, o carro precisa estar parado!");
        } else {
            this.piloto = piloto;
        }

    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {

        return velocidadeAtual;


    }

    private void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual += velocidadeAtual;

        if(this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }

        if(this.velocidadeAtual > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }


    private boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if(isLigado()) {
            System.out.println("O carro já está ligado");
        } else {
            setLigado(true);
            System.out.println("Você ligou o carro!");
        }

    }

    public void desligar() {
        if(!isLigado()) {
            System.out.println("O carro já está desligado!");
        } else {
            if (parar(getVelocidadeAtual())) {
                setLigado(false);
                System.out.println("O carro foi desligado!");
            } else {
                System.out.println("Você não pode desligar um carro em movimento!");
            }
        }
    }


    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar() {
        if(!isLigado()){
            System.out.println("Para acelerar, ligue o carro.");
        } else if(getVelocidadeAtual() < getVelocidadeMaxima()) {
            setVelocidadeAtual(10f);
            System.out.println("Piloto " + piloto.getNome() + " atingiu a velocidade: " + getVelocidadeAtual() +  " KM/H");

        } else {
            System.out.println("Piloto " + piloto.getNome() + " atingiu a velocidade máxima permitida! " + getVelocidadeMaxima() +  " KM/H");

        }
    }

    public void pisarFundo(float aumentarVelocidade) {
        if(!isLigado()){
            System.out.println("Para acelerar, ligue o carro.");
        } else if(getVelocidadeAtual() < getVelocidadeMaxima()) {
            setVelocidadeAtual(10f + aumentarVelocidade);
            System.out.println("Piloto " + piloto.getNome() + " atingiu a velocidade: " + getVelocidadeAtual() +  " KM/H");

        } else {
            System.out.println("Piloto " + piloto.getNome() + " atingiu a velocidade máxima permitida! " + getVelocidadeMaxima() +  " KM/H");

        }
    }

    public void frear() {
        if(!isLigado()) {
            System.out.println("O carro está desligado, não é possível frear.");
        } else if( parar(getVelocidadeAtual())) {
            System.out.println("O carro ainda está parado! Não é possível freiar.");
        } else if(getVelocidadeAtual() > 0) {
            setVelocidadeAtual(-10f);
            System.out.println("Piloto " + piloto.getNome() + " reduziu a velocidade para: " + getVelocidadeAtual() +  " KM/H");

        } else {
            System.out.println("Piloto " + piloto.getNome() + " atingiu a velocidade: " + getVelocidadeAtual() +  " KM/H");
            parar(getVelocidadeAtual());
        }
    }

    public void frearBruscamente(float frearMais) {
        if (!isLigado()) {
                System.out.println("O carro está desligado, não é possível frear.");
            } else if (parar(getVelocidadeAtual())) {
                System.out.println("O carro ainda está parado! Não é possível freiar.");
            } else if (getVelocidadeAtual() > 0) {
                setVelocidadeAtual(-10f - frearMais);
                System.out.println("Piloto " + piloto.getNome() + " reduziu a velocidade bruscamente para: " + getVelocidadeAtual() + " KM/H");

            } else {
                System.out.println("Piloto " + piloto.getNome() + " atingiu a velocidade: " + getVelocidadeAtual() + " KM/H");
                parar(getVelocidadeAtual());
            }

    }


    private boolean parar(float velocidadeAtual) {
        boolean estaParado = false;
        if(velocidadeAtual == 0) {
            estaParado = true;
        }

        return estaParado;
    }

    public boolean parar() {
        boolean estaParado = false;
        if(!isLigado()) {
            System.out.println("O carro já está parado, pois está desligado!");
        } else {

            if(velocidadeAtual == 0) {
                System.out.println("O carro parou!");
                estaParado = true;
            } else {
                System.out.println("Parar parar, reduza a velocidade!");
            }


        }
        return estaParado;
    }
    @Override
    public String toString() {
        return "No carro de corrida: " +
                "número: " + numeroCarro +
                ", temos o piloto: " + piloto +
                ". A Velocidade Máxima é: " + velocidadeMaxima + " KM/H "+
                ", a velocidade atual é: " + velocidadeAtual + " KM/H "+
                ", o carro está ligado? " + ligado;
    }
}

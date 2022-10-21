# <div aligm="center"> Exercício: Sistema de corrida. </div>

## Enunciado

Vamos criar um sistema para uma corrida. Para isso você vai precisar criar as seguintes classes e métodos:

### **Classe CarroCorrida**

*Atributos*:

        numeroCarro : Interger
        piloto : Piloto
        velocidadeMaxima : float
        velocidadeAtual : float
        ligado : boolean

*Métodos*:

        "Construtor"
        set... (alterar atributos da Classe - "Modificadores")
        get... (retorna valores dos atributos da Classe - "Acessores")
        acelerar(float) - aumenta a velocidade em Km/h (Soma em Km/h a velocidade atual)
        frear(float) - reduz a velocidade em Km/h (subtrair em Km/h a velocidade atual)
        parar() - velocidade igual a 0 Km/h
        ligar()
        desligar()
*Observações:* 
- Não ultrapassar a velocidade máxima;
- Frear e Acelerar só funcionam se o carro estiver ligado;
- Desligar só funciona se o carro estiver parado,

### **Classe Piloto**

*Atributos:*

        nome : String
        idade : Interger
        sexo : Enum
        equipe : String


*Métodos:*

        "Construtor"
        set... (alterar atributos da Classe - "Modificadores")
        get... (retorna valores dos atributos da Classe - "Acessores")


<div align="justify">
A entrega deve ser de preferência o link do git hub do projeto, porém caso tenha dificuldade em subir o projeto no git, pode enviar o código das classes criadas, **TODAS** as classes por aqui (isso não irá influenciar na nota).
</div>
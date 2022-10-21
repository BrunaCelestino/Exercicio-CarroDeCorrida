# <div align="center"> Exercício: Sistema de corrida. </div>
[Resolução](#resposta)


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


## Resposta

<div align="justify">
Para a atividade, 4 classes foram criadas:

- Sexo;
- Piloto;
- CarroCorrida;
- Corrida;


A classe Sexo, é uma classe tipo ENUM, onde o piloto pode escolher seu gênero. 

A classe Piloto conta com os seguintes atributos: Nome, Idade, Equipe e Sexo (fazendo referência à classe Enum Sexo), nela, se cria um novo piloto. Além disso, pode-se modificar e obter qualquer dos campos, por meio dos métodos Getters e Setters;

A classe CarroCorrida conta com os seguintes atributos: numeroCarro, velocidadeMaxima, velocidadeAtual, ligado e piloto, fazendo referência à classe Piloto. Ao ser criado um novo carro, é informado o o número do carro, o piloto e a velocidade máxima da pista. A velocidade atual do carro, ao ser criado, é setado como zero e seu estado: ligado, como falso. 
Através dos Getters em Setters, é possível obter e alterar informações sobre: Número do carro, Velocidade Máxima. É possível obter os dados do Piloto e a Velocidade Atual. 
Para alterar o piloto, é preciso que o carro esteja parado. 

Há 4 modos para setar a velocidade atual:
- acelerar: acelera aumentando 10 quilômetros por vez, até atingir a velocidade máxima;
- frear: desacelera reduzindo 10 quilômetros por vez, até atingir a velocidade 0;
- pisarFundo: acelera os 10 KM iniciais e acrescenta o valor que o usuário passar, até atingir a velocidade máxima;
- frearBruscamente. desacelera reduzindo os 10 KM iniciais, e reduzindo o valor passado pelo usuário, até chegar a 0;

Também é possível:
- Ligar o carro, desde que o mesmo já não esteja ligado;
- Desligar o carro, desde que o mesmo esteja ligado, parado ou com velocidade atual equivalente a 0 KM;
- Parar o carro, desde que a velocidade atual seja 0 KM, não esteja desligado e não esteja parado.
</div>

<div align="end"> 

        Bruna Celestino

</div>

public class Piloto {
       public String nome;
      public  Integer idade;
      public  Enum Sexo;
      public  String equipe;

    public Piloto() {
    }

    public Piloto(String nome, Integer idade, Enum sexo, String equipe) {
        this.nome = nome;
        this.idade = idade;
        Sexo = sexo;
        this.equipe = equipe;
    }

    public Enum getSexo() {
        return Sexo;
    }

    public void setSexo(Enum sexo) {
        Sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public String getEquipe() {
        return equipe;
    }


    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Piloto: " +
                "nome: " + nome +
                ", idade: " + idade +
                ", gênero: " + Sexo +
                ", equipe: " + equipe;
    }

}

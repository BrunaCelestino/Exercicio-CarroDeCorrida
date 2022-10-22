public class Piloto {
       private String nome;
      private   Integer idade;
      private    Sexo genero;
      private   String equipe;

    public Piloto() {
    }


    public Piloto(String nome, Integer idade, Sexo genero, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.equipe = equipe;
    }

    public Sexo getGenero() {
        return genero;
    }

    public void setGenero(Sexo genero) {
        this.genero = genero;
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
                ", gênero: " + genero +
                ", equipe: " + equipe;
    }

}

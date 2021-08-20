public class Pessoa {
    public String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.idade=idade;
        this.nome=nome;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome (){
        return nome;
    }
    @Override 
    public String toString (){
        return "["
                + this.nome
                +":"
                +this.idade
                +"]";
    }

    public static boolean isEmpty() {
        return false;
    }
}

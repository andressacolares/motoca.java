public class Motoca {
    private String buniza;
    private Pessoa pessoa = null;
    private int tempo = 0;
    private int potencia;

    public Motoca (int potencia){
        this.potencia=potencia;
    }
    public String getBuniza() {
        return buniza;
    }
    public int getPotencia() {
        return potencia;
    }
    public int getTempo() {
        return tempo;
    } 
    public Pessoa getPessoa() {
        return pessoa;
    }
    public boolean subir (Pessoa pessoa){
        if (getClass()!=null)
            return false;
        this.pessoa=pessoa;
        return true;
    }
    public void contadorTempo (int tempo){
        this.tempo = getTempo() + tempo;
    }
    public boolean dirigir (int tempo){
        if (getPessoa()== null || pessoa.getIdade()>10 || getTempo()<=0)
            return false;
        this.tempo = getTempo() - tempo;
        if (this.tempo<=0)
        this.tempo=0;
        return true;
        }
    public boolean descer (){
        if (getPessoa() ==null)
            return false;
        this.pessoa=null;
        return true;
    }
    public String buzinar (){

        if (getPessoa()==null)
        return buniza = "";
    if((potencia > 0) && (this.pessoa != null)){
        buniza = "P";

        for(int i = 0; i < this.potencia; i++){
            buniza = buniza+ "e";
        }

        buniza = buniza + "m";
    }
    return buniza;
}
}
   

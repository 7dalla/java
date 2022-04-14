

public class Aluno
{
    // variáveis de instância

    private int rgm;
    private String nome;
    private int anoingresso;

     //Construtor para objetos da classe aluno

    public Aluno(int rgm, String nome, int anoingresso)
    {
        this.rgm = rgm;
        this.nome = nome;
        this.anoingresso = anoingresso;
    }

    //getters e setters

    public int getrgm() {
        return this.rgm;
    }
    public String getnome(){
        return this.nome;
    }
    public int getanoingresso(){
        return this.anoingresso;
    }
    public void setrgm(int rgm){
        this.rgm = rgm;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setanoingresso(int anoingresso){
        this.anoingresso = anoingresso;
    }
    @Override
    public String toString(){
        return super.toString() + ":\n"
        + String.format("rgm: %d\nnome: %s\nanoingresso: %d" 
        , this.rgm, this.nome
        , this.anoingresso);
    }
}

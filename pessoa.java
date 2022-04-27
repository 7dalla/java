public class pessoa {

    private String nome;
    private int idade;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;    

    public void Pessoa(String nome, int idade, int gostaViajar, int gostaCozinhar, int gostaCinema, int gostaBalada, int gostaFicarEmCasa)
    {
    this.nome = nome;
    this.idade = idade;
    this.gostaViajar = gostaViajar;
    this.gostaCozinhar = gostaCozinhar;
    this.gostaCinema = gostaCinema;
    this.gostaBalada = gostaBalada;
    this.gostaFicarEmCasa = gostaFicarEmCasa;   
    }
    
    public pessoa (){} 
        //get
        public String nome(){
            return this.nome;
        }
        public int idade(){
            return this.idade;
        }
        public int gostaViajar(){
            return this.gostaViajar;
        }
        public int gostaCozinhar(){
            return this.gostaCozinhar;
        }
        public int gostaCinema(){
            return this.gostaCinema;
        }
        public int gostaBalada(){
            return this.gostaBalada;
        }
        public int gostaFicarEmCasa(){
            return this.gostaFicarEmCasa;
        }


        //set
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public void setIdade(int idade){
            this.idade = idade;
        }
        public void setgostaViajar(int gostaViajar){
            this.gostaViajar = gostaViajar;
        }
        public void setgostaCozinhar(int gostaCozinhar){
            this.gostaCozinhar = gostaCozinhar;
        }
        
        public void setgostaCinema(int gostaCinema){
            this.gostaCinema = gostaCinema;
        }
        public void setgostaBalada(int gostaBalada){
            this.gostaBalada = gostaBalada;
        }
        public void setgostaFicarEmCasa(int gostaFicarEmCasa){
            this.gostaFicarEmCasa = gostaFicarEmCasa;
        }


        //tostring
        @Override
        public String toString(){
            return super.toString()
               + String.format("RGM: %d\nNome: %s\nAnoIngresso: %d",this.nome,this.idade,this.gostaViajar,this.gostaCozinhar,this.gostaCinema,this.gostaBalada,this.gostaFicarEmCasa);
        }

 }
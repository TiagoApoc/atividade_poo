public class Aluno{
    private String nome;
    private String diciplina;
    private int idade;
    private double nota; //criada apenas para criar um metodo private
	
    public Aluno(String nome, String diciplina, int idade){
        this.nome = nome;
        this.diciplina = diciplina;
        this.idade = idade;
        this.nota = 100;
    }
    //metodos exclusivos da classe
    public void aprovado(){
        System.out.println("O aluno foi aprovado");
        notaAprovação ();
    }
    public void prova(){
        System.out.println("O aluno realizou a prova");    
    }
    public void suspenço (){
        System.out.println("Este aluno nunca foi suspenço");
    }
    private void notaAprovação(){
        nota -=40;
        
    }

//geters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getDiciplina(){
        return diciplina;
    } 
   //seters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setDiciplina(String diciplina){
        this.diciplina = diciplina;
    } 



}
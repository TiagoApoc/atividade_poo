public class Escola {
    private int qtdAlunos; //quantidade de alunos.
    private String cursos;
    private int novosAlunos; //quantidade de novos alunos no proxio ano
		
    public Escola(int qtdAlunos, String cursos, int novosAlunos){
        this.cursos = cursos;
        this.qtdAlunos = 300;
        this.novosAlunos = novosAlunos;
    }
//metodos exclusivos da classe
public void qtdAlunos(){
    System.out.println("A escola possui hoje 300 alunos. Ano que vem devemos contar com "+novosAlunos);    
    novosAlunos();
}
public void cursos(){
    System.out.println("A escola oferece diferentes cursos");
    
}
private void novosAlunos(){
    qtdAlunos += 130;
}

 //geters
public String getNome(){
    return this.cursos;
}
public int getqtdAlunos(){
    return qtdAlunos;
}
public int getnovosAlunos(){
    return novosAlunos;
} 

//seters
public void setNome(String cursos){
    this.cursos = cursos;
}
public void setqtdAlunos(int qtdAlunos){
    this.qtdAlunos = qtdAlunos;
}
public void setnovosAlunos(int novosAlunos){
    this.novosAlunos = novosAlunos;
} 

    
}
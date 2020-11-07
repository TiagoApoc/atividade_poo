public class Professor {
    private String nome;
    private double salario;
    private String turno;

public Professor (String nome, double salario, String turno){
    this.nome = nome;
    this.salario = salario;
    this.turno = turno;
}
//metodos exclusivos da classe
public void nome(){
    System.out.println("O professor se chama: " +nome);    
}
public void salario(){
    System.out.println("O salario real do professor é: ");
    desconto ();
}
private void desconto(){
    salario -= 300;

}


//geters
public String getNome(){
    return this.nome;
}
public double getSalario(){
    return salario;
}
public String getTurno(){
    return turno;
} 

//seters
public void setNome(String nome){
    this.nome = nome;
}
public void setIdade(double salario){
    this.salario = salario;
}
public void setTurno(String turno){
    this.turno = turno;
} 

    
}

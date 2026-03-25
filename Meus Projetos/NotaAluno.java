package aula4;

public class NotaAluno {

    public String nome;
    public float nota1;
    public float nota2;
    
    public void mostrarDadosAluno() {
        // Cálculo da média
        float media = (nota1 + nota2) / 2;
        
        // Começamos a montar a String
        String dados = "Nome Aluno: ";
        
        // MUDANÇA AQUI: Use += para acumular o texto
        dados += nome + "\n";
        dados += "Média: " + media + "\n";
        
        if (media >= 6) {
            dados += "Situação: Aprovado";
        } else {
            dados += "Situação: Reprovado";
        }
        
        // Agora a variável 'dados' contém tudo!
        System.out.println(dados);
    }
}
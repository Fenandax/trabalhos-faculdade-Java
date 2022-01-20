/**
 * Fernanda Fiuza
 */

public class farmacia
{
    public static void main(String args[]){
        //Entrada de Dados
        System.out.println("==Seja bem vindo ao sistema de cadastro da farmácia Ideal. Esse cadastro é necessário para a liberação de medicamentos de tarja, após termos todas as informações iremos recolher sua receita, avaliaremos ela e levaremos seu medicamento.==");
        System.out.println("Preencha todos os dados atentamente!");
        String Nome = Teclado.leString("Qual é o seu nome? ");
        int Idade = Teclado.leInt("Quantos anos você tem? ");
        String CPF = Teclado.leString("Qual o seu CPF? ");
        char Sexo = Teclado.leChar("Qual é seu sexo? ");
        String Gestante = Teclado.leString("Você está grávida? ");
        String Telefone = Teclado.leString("Qual é o seu número de telefone? ");
        String Email = Teclado.leString("Qual é o seu e-mail? ");
        String Cidade = Teclado.leString("Em que cidade você mora? ");
        String Endereço = Teclado.leString("Qual é o endereço para entrega? ");
        String CRM = Teclado.leString("Qual é o CRM do médico que te receitou a medicação? ");
        String Data  = Teclado.leString("Qual a data que você recebeu a receita? ");
        
        //Saída de Dados
        System.out.println("==Dados cadastrados==");
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("CPF: " + CPF);
        System.out.println("Sexo: " + Sexo);
        System.out.println("Gestante: " + Gestante);
        System.out.println("Telefone: " + Telefone);
        System.out.println("E-mail: " + Email);
        System.out.println("Cidade: " + Cidade);
        System.out.println("Endereço: " + Endereço);
        System.out.println("CRM do médico: " + CRM);
        System.out.println("Data da receita: " + Data);
    }
}

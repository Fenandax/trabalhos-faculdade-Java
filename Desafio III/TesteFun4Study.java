public class TesteFun4Study{
    public static void main(String[] args) {
    
        String novaSenha;
        String novaSenhaRepete;
        String senhaAnterior;

//Primeira cidade
        Cidade cidade1 = new Cidade(Teclado.leInt("Digite o código: "),
        Teclado.leString("Digite a cidade: " ),
        Teclado.leString("Digite a UF: " ));

//Primeiro estudante
        Estudante estudante1 = new Estudante(Teclado.leInt("Digite o código: "),
        Teclado.leString("Digite seu nome: " ),
        Teclado.leString("Digite sua data de nascimento: " ),
        Teclado.leString("Digite seu e-mail: " ),
        Teclado.leString("Digite sua senha: " ),  
        cidade1);

        senhaAnterior = Teclado.leString("Digite sua senha novamente: ");

//Alteração de senha do primeiro estudante
        if((estudante1.getSenha()).equals(senhaAnterior)){
            System.out.println("Tudo certo! Vamos atualizar sua senha.");
             novaSenha = Teclado.leString("Digite sua nova senha: ");
             novaSenhaRepete = Teclado.leString("Repita sua nova senha: ");
            
                    if(novaSenhaRepete.equals(novaSenha)){
                        estudante1.setSenha(novaSenha);
                        System.out.println("Senha atualizada com sucesso");
            
                    }
                    else{
                        System.out.println("As senhas não conferem, a senha não foi alterada.");
            
                    }       
        }
        else{
            System.out.println("As senhas não conferem, a senha não foi alterada.");
        }     
        
//Segundo estudante
        Estudante estudante2 = new Estudante(Teclado.leInt("Digite o código: "),
        Teclado.leString("Digite seu nome: " ),
        Teclado.leString("Digite sua data de nascimento: " ),
        Teclado.leString("Digite seu e-mail: " ),
        Teclado.leString("Digite sua senha: " ),  
        cidade1);

        senhaAnterior = Teclado.leString("Digite sua senha novamente: ");
   
//Alteração de senha do segundo estudante
        if((estudante2.getSenha()).equals(senhaAnterior)){
            System.out.println("Tudo certo! Vamos atualizar sua senha.");
             novaSenha = Teclado.leString("Digite sua nova senha: ");
             novaSenhaRepete = Teclado.leString("Repita sua nova senha: ");
            
                    if(novaSenhaRepete.equals(novaSenha)){
                        estudante2.setSenha(novaSenha);
                        System.out.println("Senha atualizada com sucesso");
            
                    }
                    else{
                        System.out.println("As senhas não conferem, a senha não foi alterada.");
            
                    }       
        }
        else{
            System.out.println("As senhas não conferem, a senha não foi alterada.");
        }

  //Exibe dados da cidade 1 e dos estudantes 1 e 2      
        System.out.println(cidade1.exibeDadosCidade());
        System.out.println(estudante1.exibeDadosEstudante());
        System.out.println(estudante2.exibeDadosEstudante());
        
//Segunda cidade
        Cidade cidade2 = new Cidade(Teclado.leInt("Digite o código: "),
        Teclado.leString("Digite a cidade: " ),
        Teclado.leString("Digite a UF: " ));

//Terceiro estudante
        Estudante estudante3 = new Estudante(Teclado.leInt("Digite o código: "),
        Teclado.leString("Digite seu nome: " ),
        Teclado.leString("Digite sua data de nascimento: " ),
        Teclado.leString("Digite seu e-mail: " ),
        Teclado.leString("Digite sua senha: " ),  
        cidade1);

        senhaAnterior = Teclado.leString("Digite sua senha novamente: ");

//Alteração de senha do terceiro estudante
        if((estudante3.getSenha()).equals(senhaAnterior)){
            System.out.println("Tudo certo! Vamos atualizar sua senha.");
             novaSenha = Teclado.leString("Digite sua nova senha: ");
             novaSenhaRepete = Teclado.leString("Repita sua nova senha: ");
            
                    if(novaSenhaRepete.equals(novaSenha)){
                        estudante3.setSenha(novaSenha);
                        System.out.println("Senha atualizada com sucesso");
            
                    }
                    else{
                        System.out.println("As senhas não conferem, a senha não foi alterada.");
            
                    }       
        }
        else{
            System.out.println("As senhas nao conferem, a senha nao foi alterada.");
        }

//Quarto estudante
        Estudante estudante4 = new Estudante(Teclado.leInt("Digite o código: "),
        Teclado.leString("Digite seu nome: " ),
        Teclado.leString("Digite sua data de nascimento: " ),
        Teclado.leString("Digite seu e-mail: " ),
        Teclado.leString("Digite sua senha: " ),  
        cidade1);

        senhaAnterior = Teclado.leString("Digite sua senha novamente: ");

//Alteração de senha do quarto estudante
        if((estudante4.getSenha()).equals(senhaAnterior)){
            System.out.println("Tudo certo! Vamos atualizar sua senha.");
             novaSenha = Teclado.leString("Digite sua nova senha: ");
             novaSenhaRepete = Teclado.leString("Repita sua nova senha: ");
            
                    if(novaSenhaRepete.equals(novaSenha)){
                        estudante4.setSenha(novaSenha);
                        System.out.println("Senha atualizada com sucesso");
            
                    }
                    else{
                        System.out.println("As senhas não conferem, a senha não foi alterada.");
            
                    }       
        }
        else{
            System.out.println("As senhas nao conferem, a senha nao foi alterada.");
        }

//Exibe dados da cidade 2 e dos estudantes 3 e 4
        System.out.println(cidade2.exibeDadosCidade());
        System.out.println(estudante3.exibeDadosEstudante());
        System.out.println(estudante4.exibeDadosEstudante());
    

    }
}



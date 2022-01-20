public class TesteFun4Study{
    public static void main(String[] args) {
            
                String novaSenha;
                String novaSenhaRepete;
                String senhaAnterior;
                int contCidade = 0;
                int contEstud = 0;
                char resp;
                int opcao = 0;
                Estudante estudante;
                
                do{
                    contCidade++;
                    System.out.println("\nCadastre a cidade " + contCidade +  ":\n");
                    Cidade cidade1 = new Cidade(Teclado.leInt("Digite o código: "),
                                                Teclado.leString("Digite a cidade: " ),
                                                Teclado.leString("Digite a UF: " ));
                   
            //Exibir os Dados da cidade
                    System.out.println("\n -- Dados da Cidade --\n");
                    System.out.println("Cidade " + contCidade +  ":\n");   
                
                    System.out.println(cidade1.exibeDadosCidade());
        
                                                   
                   do{      
                        contEstud++;
                        System.out.println("\nCadastre o estudante " + contEstud +  ":\n");                      
                        estudante = new Estudante(Teclado.leInt("Digite o código: "),
                        Teclado.leString("Digite seu nome: " ),
                        Teclado.leString("Digite sua data de nascimento: " ),
                        Teclado.leString("Digite seu e-mail: " ),
                        Teclado.leString("Digite sua senha: " ),  
                        cidade1);
                                
                        //Exibir os Dados do Estudante
                        System.out.println("\n -- Dados do estudante --\n");
                        System.out.println("Estudante " + contEstud +  ":\n");
                        System.out.println(estudante.exibeDadosEstudante());
                        resp = Teclado.leChar("Deseja criar mais um estudante(S-sim / N-não) ?");
                        }while(((resp == 'S') || (resp == 's')) && (contEstud>4));
                   contEstud = 0;
                   
                    System.out.println();
                   resp = Teclado.leChar("Deseja alterar os dados do o estudante(S-Sim / N-Não) ?"); 
                   while((resp == 'S') || (resp == 's')){
                       System.out.println("\nAtualize os dados\n");
                       System.out.println("Estudante " + contEstud +  ":\n");
                       System.out.println("1-Email");
                       System.out.println("2-Senha");
                       System.out.println("3-Nome");
                       System.out.println("4-Data de nascimento");
                       opcao = Teclado.leInt("Digite a opção de dado que deseja alterar:"); 
                       switch(opcao){
                            case 1:
                                estudante.setEmail(Teclado.leString("Informe o novo e-mail: "));
                                break;
                            case 2:
                                senhaAnterior = Teclado.leString("Digite sua senha novamente: ");
                                if((estudante.getSenha()).equals(senhaAnterior)){
                                    System.out.println("Tudo certo! Vamos atualizar sua senha.");
                                    novaSenha = Teclado.leString("Digite sua nova senha: ");
                                    novaSenhaRepete = Teclado.leString("Repita sua nova senha: ");
                                
                                        if(novaSenhaRepete.equals(novaSenha)){
                                            estudante.setSenha(novaSenha);
                                            System.out.println("Senha atualizada com sucesso");
                                
                                        }
                                        else{
                                            System.out.println("As senhas não conferem, a senha não foi alterada.");
                                
                                        }       
                            }
                                else{
                                    System.out.println("As senhas não conferem, a senha não foi alterada.");
                            }
                    
                                break;
                            case 3:
                                estudante.setNome(Teclado.leString("Informe o novo nome: "));
                                break;
                            case 4:
                                estudante.setdataNascimento(Teclado.leString("Informe a data de nascimento correta: "));
                                break;
                            default:
                                System.out.println("\nOpção Inválida!\n Digite Novamente!\n");
                       }
                        
                       resp = Teclado.leChar("Deseja continuar alterando os dados do Usuário(S-Sim / N-Não) ?"); 
                       if((resp == 'N') || (resp == 'n')){
                           System.out.println("\n-- Dados do Usuário após Atualização --\n");
                           System.out.println("Usuário " + contEstud +  ":\n");
                       }
                        System.out.println(estudante.exibeDadosEstudante());
                    }
                    
                   resp = Teclado.leChar("Deseja criar mais uma cidade(S-Sim / N-Não)?"); 
                }while(((resp == 'S') || (resp == 's')));                                      
            }
        }
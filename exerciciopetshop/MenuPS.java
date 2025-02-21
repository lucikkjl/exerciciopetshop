import java.util.ArrayList;
import java.util.Scanner;

public class MenuPS {
    
 public static void main(String[] args) {
        int opt = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        ArrayList<Tutor> tutores = new ArrayList<Tutor>();
        ArrayList<Animal> animais = new ArrayList<Animal>();

        try {
        do {
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar Categoria");
            System.out.println("2 - Cadastrar Tutor");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Listar Categoria");
            System.out.println("5 - Listar Tutor");
            System.out.println("6 - Listar Animal");
            System.out.println("7 - Saindo.....");
            try {
                opt = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida");
                scanner.nextLine();
                continue;
            }
            switch (opt) {
                case 1: {
                    System.out.println("Digite o Id da categoria: ");
                    int IdCategoria = scanner.nextInt();
                    System.out.println("Digite a descrição da categoria: ");
                    String descricao = scanner.next();

                    Categoria categoria = new Categoria(IdCategoria, descricao);
                    categorias.add(categoria);

                    break;
                    }

                case 2: {
                    System.out.println("Digite o Id do tutor: ");
                    int IdTutor = scanner.nextInt();
                    System.out.println("Digite o nome do tutor: ");
                    String nomeTutor = scanner.next();
                    System.out.println("Digite o telefone do tutor: ");
                    String telefone = scanner.next();
                    System.out.println("Digite a email da categoria: ");
                    String email = scanner.next();

                    Tutor tutor = new Tutor(IdTutor, nomeTutor, telefone, email);
                    tutores.add(tutor);

                    break;
                    }
                case 3: {
                    System.out.println("Digite o Id do animal: ");
                    int IdAnimal = scanner.nextInt();
                    System.out.println("Digite o nome do animal: ");
                    String nomeAnimal = scanner.next();
                    System.out.println("Digite a raça do animal: ");
                    String raca = scanner.next();
                    System.out.println("Digite o peso do animal: ");
                    int peso = scanner.nextInt();
                    System.out.println("Digite IdCategoria: ");
                    int IdCategoria = scanner.nextInt();
                    System.out.println("Digite IdTutor: ");
                    int IdTutor = scanner.nextInt();
    
                    Animal animal = new Animal(IdAnimal, nomeAnimal, raca, peso, IdCategoria, IdTutor);
                    animais.add(animal);
    
                    break;
                    }
                    case 4: 
                    for (Categoria categoriaPrint : categorias) {
                        int contador = 0;
                        for (Animal animal : animais) {
                            if (animal.IdCategoria == categoriaPrint.IdCategoria) {
                                contador++;
                            }

                    }
                        System.out.println("Id: " + categoriaPrint.IdCategoria);
                        System.out.println("Descrição: " + categoriaPrint.descricao);
                        System.out.println("Quantidade de animais: " + contador); 

                    }
                    break;
                    case 5:
                    for (Tutor tutorPrint : tutores) {
                        int contador = 0;
                         
                        for (Animal animal : animais){
                            if (animal.IdTutor == tutorPrint.IdTutor){
                                contador++;
                            }
                        }
                        System.out.println("Id: " + tutorPrint.IdTutor);
                        System.out.println("Nome: " + tutorPrint.nomeTutor);
                        System.out.println("Telefone: " + tutorPrint.telefone);
                        System.out.println("E-mail: " + tutorPrint.email);

                    }
                    break;
                    case 6:
                    for (Animal animalPrint : animais) {
                        System.out.println("Id: " + animalPrint.IdAnimal);
                        System.out.println("Nome: " + animalPrint.nomeAnimal);
                        System.out.println("Raca: " + animalPrint.raca);
                        System.out.println("Peso: " + animalPrint.peso);
                    }
 
                    case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        } while (opt != 7);
    } catch (Exception e) {
        System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        e.printStackTrace(); 
    } finally {
        scanner.close();  
        }
    }

}


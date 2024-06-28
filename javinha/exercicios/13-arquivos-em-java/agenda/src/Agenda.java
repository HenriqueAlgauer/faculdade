import java.io.*; 
import java.util.ArrayList;
import java.util.Scanner;
 

public class Agenda {
 private static final String ARQUIVO = "contatos.txt";
    private static ArrayList<Contatos> contatos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        
        carregarContatos(); 
 
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        
        while(true){
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Incluir contato");
            System.out.println("2. Alterar telefone");
            System.out.println("3. Excluir contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Sair");
            opcao = scanner.nextInt(); 
            
            scanner.nextLine(); 
 
            switch (opcao) {
                case 1:
                    incluirContato(scanner); 
                    break;
                case 2:
                    alterarTelefone(scanner); 
                    break;
                case 3:
                    excluirContato(scanner); 
                    break;
                case 4:
                    listarContatos(); 
                    break;
                case 5:
                    salvarContatos(); 
                    System.exit(0); 
            }
        }
    }
 
    
    private static void carregarContatos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) { 
                String[] line = linha.split(";"); 
                String nome = line[0];
                String telefone = line[1];
                Contatos contato = new Contatos(nome, telefone); 
                contatos.add(contato); 
            }
        } catch (IOException e) { 
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }
 
    
    private static void salvarContatos(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Contatos contato : contatos) { 
                writer.write(contato.getNome() + ";" + contato.getTelefone()); 
                writer.newLine(); 
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
 
    
    private static void incluirContato(Scanner scanner){
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        Contatos contato = new Contatos(nome, telefone);
        contatos.add(contato);
        
        System.out.println("Contato incluido com sucesso");
    }
 
    
    private static void alterarTelefone(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        for (Contatos contato : contatos) { 
            if (contato.getNome().equalsIgnoreCase(nome)) { 
                System.out.print("Digite o novo telefone: ");
                String novoTelefone = scanner.nextLine();
                contato.setTelefone(novoTelefone);
                System.out.println("Telefone alterado com sucesso!");
                return;
            }
        }
        System.out.println("Contato nao encontrado!");
    }
 
    
    private static void excluirContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        for (Contatos contato : contatos) { 
            if (contato.getNome().equalsIgnoreCase(nome)) { 
                contatos.remove(contato); 
                System.out.println("Contato excluido com sucesso!");
                return;
            }
        }
        System.out.println("Contato nao encontrado!");
    }
 
    
    private static void listarContatos() {
        if (contatos.isEmpty()) { 
            System.out.println("Nenhum contato cadastrado.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contatos contato : contatos) { 
                System.out.println(contato); 
            }
        }
    }
}
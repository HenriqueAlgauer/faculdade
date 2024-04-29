import java.util.*;

class Contato{
    public String nome;
    public String tel;

    public Contato(String nome, String tel){
        setNome(nome);
        setTel(tel);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}

class aula03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Contato[] contato = new Contato[5];

        boolean exit = false;
        int numContato = 0;
        do{
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Buscar Contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Listar contatos");
            System.out.println("[5] sair");

            int opcao = input.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = input.nextLine();

                    input.nextLine();

                    System.out.print("Numero do contato: ");
                    String tel = input.nextLine();

                    contato[numContato] = new Contato(nome, tel);
                    numContato++;
                    System.out.println("Nome CONTATO: " + contato[0].getNome());

                    contato[numContato] = new Contato("Pia", "666-1-tapa-na-oreia");
                    numContato++;

                    contato[numContato] = new Contato("Jalim", "77-666-1-tapa-na-oreia");
                    numContato++;
                break;
                case 2:
                    String name = "pia";
                    boolean encontrado = false;

                    for(int i=0;i < numContato;i++){
                        if(contato[i].getNome().equalsIgnoreCase(name)){
                            System.out.println("Telefone de: " + name + ": " + contato[i].getTel());
                            encontrado = true;
                        }
                    }
                    if(encontrado == false){

                    }
                    break;
                case 3:
                
                break;
                case 4:                    
                    for(int i=0;i<numContato;i++){
                        System.out.println("Nome ctt: " + contato[i].getNome());
                        System.out.println("Num ctt: " + contato[i].getTel());
                    }break;
                case 5:
                    exit = true;break;
            
                default:
                    break;
            }
        }while(exit != true);

        input.close();
    }
}

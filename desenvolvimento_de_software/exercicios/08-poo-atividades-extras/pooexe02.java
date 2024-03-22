//Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada e automatizada. 

// Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome, pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no sistema. 

class Player{
    String name;
    int points;
    int level;

    int changePoints(int points){
        return this.points += points;
    }
    int changeLevel(int level){
        return this.level += level;
    }
    void status(){
        System.out.println("Name: " + this.name);
        System.out.println("Points: " + this.points);
        System.out.println("Level: " + this.level);
    }
}

class pooexe02 {
    public static void main(String[] args){
        Player p1 = new Player();

        p1.name = "John Doe";
        p1.level = 14;
        p1.points = 2000;

        p1.status();

        p1.changeLevel(2);
        p1.changePoints(400);

        p1.status();
    }
}

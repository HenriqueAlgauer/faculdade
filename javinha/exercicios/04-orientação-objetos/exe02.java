// Uma escola remunera seus professores por hora/aula ministrada. Escreva um método que calcule e retorne o salário de um professor, sendo que o valor hora/aula obedece aos seguintes critérios: 20,00 para o nível 1, 25,00 para o nível 2 e 30,00 para o nível 3.

class Professor{
    String nome;
    float totalSalario = 0;
    
    public float calculaSalario(int nivel, float horas){
        switch(nivel){
            case 1: 
                this.totalSalario = horas * 20;break;
            case 2: 
                this.totalSalario = horas * 25;break;
            case 3: 
                this.totalSalario = horas * 30;break;
            default: 
                System.out.print("Insira um nível válido: 1, 2 ou 3 =D");  
        }
        return this.totalSalario;
    }
}

class exe02 {
    public static void main(String[] args){
        Professor marcelo = new Professor();

        marcelo.calculaSalario(3, 40);
        System.out.print(marcelo.totalSalario);
    }
}

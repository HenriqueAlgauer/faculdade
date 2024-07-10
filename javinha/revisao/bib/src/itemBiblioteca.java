abstract class itemBiblioteca {
    private String titulo;
    private String anoPublicado;
    private boolean emprestado;

    public itemBiblioteca(String titulo, String anoPublicado, boolean emprestado){
        setTitulo(titulo);
        setAnoPublicado(anoPublicado);
        setEmprestado(emprestado);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAnoPublicado() {
        return anoPublicado;
    }
    public boolean getEmprestado(){
        return emprestado;
    }

    public void emprestar(){
        if(this.emprestado == false){
            this.emprestado = true;
            System.out.println(titulo + " foi emprestado");
        }else{
            System.out.println(titulo + " já foi emprestado !");
        }
    }
    
    public void devolver(){
        if(this.emprestado == true){
            this.emprestado = false;
            System.out.println(titulo + " foi devolvido");
        }else{
            System.out.println(titulo + " não foi emprestado");
        }
    }

    public abstract double calcularMulta(int diasAtrasados);
}

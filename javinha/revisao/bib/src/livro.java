public class livro extends itemBiblioteca{
    public livro(String titulo, String anoPublicado, boolean emprestado){
        super(titulo, anoPublicado, emprestado);
    }

    @Override
    public double calcularMulta(int diasAtrasados){
        return  diasAtrasados * 2;
    }
}

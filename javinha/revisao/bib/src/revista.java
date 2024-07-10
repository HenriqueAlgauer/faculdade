public class revista extends itemBiblioteca {
    public revista(String titulo, String anoPublicado, boolean emprestado){
        super(titulo, anoPublicado, emprestado);
    }

    @Override
    public double calcularMulta(int diasAtrasados){
        return diasAtrasados * 1;
    }
}

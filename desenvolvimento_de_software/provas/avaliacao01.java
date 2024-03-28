class conta{
    int numConta;
    protected String tipoConta;
    private String titularConta;
    private double saldo;
    private boolean status;

    public void setNumConta(int conta) {
        this.numConta = conta;
    }
    public int getNumConta() {
        return this.numConta;
    }

    public void setTipoConta(String tipo) {
        this.tipoConta = tipo;
    }
    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTitular(String nome) {
        this.titularConta = nome;
    }
    public String getTitular() {
        return this.titularConta;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }
    public double getSaldo() {
        return this.saldo;
    }

    void exibirInfo() {
        System.out.println("N. conta: " + getNumConta());
        System.out.println("Nome titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Operação realizada com sucesso");
    }

    void abrirConta(int conta, String tipo, String nome) {
        setNumConta(conta);
        setTipoConta(tipo);
        setTitular(nome);
        setStatus(true);
        if (tipo == "corrente") {
            setSaldo(50);
        } else if (tipo == "poupança") {
            setSaldo(150);
        }
    }

    public void fecharConta() {
        if (getStatus() == true) {
            if(getSaldo() == 0){
                setStatus(false);
                System.out.println("A conta foi fechada com sucesso!");
            }else if(getSaldo() < 0){
                System.out.println("Você possui débitos para pagar. Não foi possível fechar conta");
            }else if(getSaldo() > 0){
                System.out.println("Você possui um saldo ainda na sua conta. Saque para conseguir fechar a conta");
            }
        } else {
            System.out.println("A conta não existe ou já foi fechada");
        }
    }

    public void depositar(double valor) {
        if (getStatus() == true) {
            double saldoAtual = getSaldo();
            double saldoAtualizado = saldoAtual + valor;
            setSaldo(saldoAtualizado);
            exibirInfo();
        } else {
            System.out.println("A conta não existe. A operação não pode ser concluida");
        }
    }

    public void sacar(double valor) {
        if (getStatus() == true) {
            if (getSaldo() < valor) {
                System.out.print("Saldo insuficiente para saque");
            } else {
                double saldoAtual = getSaldo();
                double saldoAtualizado = saldoAtual - valor;
                setSaldo(saldoAtualizado);
                exibirInfo();
            }
        } else {
            System.out.println("A conta não existe. A operação não pode ser concluida");
        }
    }

    public void pagarMensalidade() {
        if (getStatus() == true) {
            if (getTipoConta() == "corrente") {
                if (getSaldo() < 12) {
                    System.out.println("Saldo insuficiente para pagar mensalidade");
                } else {
                    double saldoAtual = getSaldo();
                    double saldoAtualizado = saldoAtual - 12;
                    setSaldo(saldoAtualizado);
                    exibirInfo();
                }
            } else if (getTipoConta() == "poupança") {
                if (getSaldo() < 20) {
                    System.out.println("Saldo insuficiente");
                } else {
                    double saldoAtual = getSaldo();
                    double saldoAtualizado = saldoAtual - 20;
                    setSaldo(saldoAtualizado);
                    exibirInfo();
                }
            } else {
                System.out.println("Tipo da conta cadastrado errado");
            }
        } else {
            System.out.println("A conta não existe. A operação não pode ser concluida");
        }
    }

}

class avaliacao01 {
    public static void main(String[] args) {
        conta c1 = new conta();
        c1.abrirConta(123, "corrente", "ze");
        c1.sacar(50);
        c1.depositar(12);
        c1.pagarMensalidade();
        c1.fecharConta();
    }
}

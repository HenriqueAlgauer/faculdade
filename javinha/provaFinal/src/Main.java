import java.util.*;
import java.io.*;

public class Main {
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static int codigoProdutoAtual = 1;
    private static int numeroPedidoAtual = 1;

    public static void main(String[] args) {
        carregarProdutos();
        carregarPedidos();
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("# Menu principal #");
            System.out.println("[1] Produtos");
            System.out.println("[2] Pedidos");
            System.out.println("[3] Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuProdutos();
                    break;
                case 2:
                    menuPedidos();
                    break;
                case 3:
                    salvarProdutos();
                    salvarPedidos();
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        
    }

    private static void menuProdutos() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("# Produtos #");
            System.out.println("[1] Incluir produto");
            System.out.println("[2] Editar quantidade estoque produto");
            System.out.println("[3] Editar preço unitário produto");
            System.out.println("[4] Excluir produto");
            System.out.println("[5] Listagem produtos");
            System.out.println("[6] Voltar ao menu principal");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirProduto();
                    break;
                case 2:
                    editarQuantidadeEstoque();
                    break;
                case 3:
                    editarPrecoUnitario();
                    break;
                case 4:
                    excluirProduto();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        
    }

    private static void menuPedidos() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("# Pedidos #");
            System.out.println("[1] Novo pedido");
            System.out.println("[2] Listagem pedidos");
            System.out.println("[3] Voltar ao menu principal");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    novoPedido();
                    break;
                case 2:
                    listarPedidos();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        
    }

    private static void incluirProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Preço unitário: ");
        double precoUnitario = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        Produto produto = new Produto(codigoProdutoAtual++, nomeProduto, precoUnitario, quantidadeEstoque);
        produtos.add(produto);
        System.out.println("Produto incluído com sucesso!");
        
    }

    private static void editarQuantidadeEstoque() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        Produto produto = encontrarProduto(codigo);
        if (produto != null) {
            System.out.print("Nova quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            produto.setQuantidadeEstoque(quantidade);
            System.out.println("Quantidade em estoque atualizada!");
        } else {
            System.out.println("Produto não encontrado.");
        }
        
    }

    private static void editarPrecoUnitario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        Produto produto = encontrarProduto(codigo);
        if (produto != null) {
            System.out.print("Novo preço unitário: ");
            double preco = scanner.nextDouble();
            produto.setPrecoUnitario(preco);
            System.out.println("Preço unitário atualizado!");
        } else {
            System.out.println("Produto não encontrado.");
        }
        
    }

    private static void excluirProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        Produto produto = encontrarProduto(codigo);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído!");
        } else {
            System.out.println("Produto não encontrado.");
        }
        
    }

    private static void listarProdutos() {
        System.out.println("Código  Nome                                         Preço unitário  Quantidade estoque");
        System.out.println("---------------------------------------------------------------------------------------");
        double valorTotalEstoque = 0;
        for (Produto produto : produtos) {
            System.out.printf("%-8d%-45s%-15.2f%-10d\n", produto.getCodigoProduto(), produto.getNomeProduto(), produto.getPrecoUnitario(), produto.getQuantidadeEstoque());
            valorTotalEstoque += produto.getPrecoUnitario() * produto.getQuantidadeEstoque();
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("Valor total estoque: %.2f\n", valorTotalEstoque);
    }

    private static Produto encontrarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto() == codigo) {
                return produto;
            }
        }
        return null;
    }

    private static void novoPedido() {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido(numeroPedidoAtual++);
        boolean adicionarMaisProdutos = true;
    
        while (adicionarMaisProdutos) {
            System.out.print("Código do produto: ");
            int codigoProduto = scanner.nextInt();
            Produto produto = encontrarProduto(codigoProduto);
            if (produto != null) {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                if (produto.getQuantidadeEstoque() >= quantidade) {
                    pedido.adicionarProduto(codigoProduto, produto.getPrecoUnitario(), quantidade);
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
                    System.out.println("Produto adicionado ao pedido.");
                } else {
                    System.out.println("Quantidade em estoque insuficiente.");
                }
            } else {
                System.out.println("Produto não encontrado.");
            }
    
            System.out.print("Deseja adicionar mais um produto a este pedido? (s/n): ");
            adicionarMaisProdutos = scanner.next().equalsIgnoreCase("s");
        }
    
        pedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso!");
    }

    private static void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido número: " + pedido.getNumeroPedido());
            System.out.println("Produto                                 Preço unitário   Quantidade   Subtotal        22");
            System.out.println("--------------------------------------------------------------------------------------");
            double valorTotalPedido = 0;
            List<Integer> codigos = pedido.getCodigosProdutos();
            List<Double> precos = pedido.getPrecosUnitarios();
            List<Integer> quantidades = pedido.getQuantidades();
    
            for (int i = 0; i < codigos.size(); i++) {
                Produto produto = encontrarProduto(codigos.get(i));
                if (produto != null) {
                    double subtotal = precos.get(i) * quantidades.get(i);
                    valorTotalPedido += subtotal;
                    System.out.printf("%-45s%-15.2f%-10d%-10.2f\n", produto.getNomeProduto(), precos.get(i), quantidades.get(i), subtotal);
                }
            }
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.printf("Valor total pedido: %.2f\n", valorTotalPedido);
            System.out.println("\n");
        }
    }

    private static void carregarProdutos() {
        try (BufferedReader br = new BufferedReader(new FileReader("produtos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    try {
                        int codigo = Integer.parseInt(partes[0]);
                        String nome = partes[1];
                        double preco = Double.parseDouble(partes[2]);
                        int quantidade = Integer.parseInt(partes[3]);
                        produtos.add(new Produto(codigo, nome, preco, quantidade));
                        codigoProdutoAtual = Math.max(codigoProdutoAtual, codigo + 1);
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter os dados do produto: " + linha);
                    }
                } else {
                    System.out.println("Formato inválido de linha: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }

    private static void carregarPedidos() {
        try (BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    try {
                        int numero = Integer.parseInt(partes[0]);
                        int codigoProduto = Integer.parseInt(partes[1]);
                        double preco = Double.parseDouble(partes[2]);
                        int quantidade = Integer.parseInt(partes[3]);
    
                        Pedido pedido = encontrarPedido(numero);
                        if (pedido == null) {
                            pedido = new Pedido(numero);
                            pedidos.add(pedido);
                            numeroPedidoAtual = Math.max(numeroPedidoAtual, numero + 1);
                        }
                        pedido.adicionarProduto(codigoProduto, preco, quantidade);
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter os dados do pedido: " + linha);
                    }
                } else {
                    System.out.println("Formato inválido de linha: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar pedidos: " + e.getMessage());
        }
    }
    
    private static Pedido encontrarPedido(int numero) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroPedido() == numero) {
                return pedido;
            }
        }
        return null;
    }
    
    private static void salvarProdutos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("produtos.txt"))) {
            for (Produto produto : produtos) {
                bw.write(produto.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    private static void salvarPedidos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("pedidos.txt"))) {
            for (Pedido pedido : pedidos) {
                bw.write(pedido.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar pedidos: " + e.getMessage());
        }
    }
}

// função antiga
// private static void carregarPedidos() {
//     try (BufferedReader br = new BufferedReader(new FileReader("pedidos.txt"))) {
//         String linha;
//         while ((linha = br.readLine()) != null) {
//             String[] partes = linha.split(";");
//             if (partes.length == 4) {
//                 try {
//                     int numero = Integer.parseInt(partes[0]);
//                     int codigoProduto = Integer.parseInt(partes[1]);
//                     double preco = Double.parseDouble(partes[2]);
//                     int quantidade = Integer.parseInt(partes[3]);

//                     Pedido pedido = encontrarPedido(numero);
//                     if (pedido == null) {
//                         pedido = new Pedido(numero);
//                         pedidos.add(pedido);
//                         numeroPedidoAtual = Math.max(numeroPedidoAtual, numero + 1);
//                     }
//                     pedido.adicionarProduto(codigoProduto, preco, quantidade);
//                 } catch (NumberFormatException e) {
//                     System.out.println("Erro ao converter os dados do pedido: " + linha);
//                 }
//             } else {
//                 System.out.println("Formato inválido de linha: " + linha);
//             }
//         }
//     } catch (IOException e) {
//         System.out.println("Erro ao carregar pedidos: " + e.getMessage());
//     }
// }

// Classe pedido
// private int numeroPedido;
// private List<Integer> codigosProdutos;
// private List<Double> precosUnitarios;
// private List<Integer> quantidades;

// public Pedido(int numeroPedido) {
//     this.numeroPedido = numeroPedido;
//     this.codigosProdutos = new ArrayList<>();
//     this.precosUnitarios = new ArrayList<>();
//     this.quantidades = new ArrayList<>();
// }

// public void adicionarProduto(int codigoProduto, double precoUnitario, int quantidade) {
//     this.codigosProdutos.add(codigoProduto);
//     this.precosUnitarios.add(precoUnitario);
//     this.quantidades.add(quantidade);
// }

// private static Pedido encontrarPedido(int numero) {
//     for (Pedido pedido : pedidos) {
//         if (pedido.getNumeroPedido() == numero) {
//             return pedido;
//         }
//     }
//     return null;
// }

// Classe Produto

// private int codigoProduto;
// private String nomeProduto;
// private double precoUnitario;
// private int quantidadeEstoque;
//@Override
// public String toString() {
//     return codigoProduto + ";" + nomeProduto + ";" + precoUnitario + ";" + quantidadeEstoque;
// }
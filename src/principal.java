import java.util.Scanner;

public class principal {
    static int quantidadeDeClientes = 0;
    static Scanner ler = new Scanner(System.in);
    static String[] telefoneCliente = new String[100];
    static String[] nomeCliente = new String[100];
    static String[] enderecoCliente = new String[100];

    static String[] nomeProduto = new String[100];
    static String[] descricaoProduto = new String[100];
    static double[] valorCompra = new double[100];
    static double[] porcentagemLucro = new double[100];
    static int[] quantidadeEstoque = new int[100];

    private static void LimpaTela() {
        for (int i = 0; i < 30; i++) {
            System.out.println("\r\n");
        }
    }

    private static void CadastroCliente() {
        //declaração 
        int inputClientes = 0;
        System.out.println("                        1 - CADASTRO DE NOVO CLIENTE.     \n");
        System.out.print("Informe quantos clientes deseja cadastrar: ");
        quantidadeDeClientes = ler.nextInt();
//        inputClientes = ler.nextInt(); 
//        quantidadeDeClientes += inputClientes; 
        for (int i = 0; i < quantidadeDeClientes; i++) {
            System.out.println("Digite o nome do cliente " + (i + 1) + ":");
            ler.nextLine();
            nomeCliente[i] = ler.nextLine();
            System.out.println("Digite o endereço do cliente " + (i + 1) + ":");
            enderecoCliente[i] = ler.nextLine();
            System.out.println("Digite o telefone do cliente " + (i + 1) + ":");
            telefoneCliente[i] = ler.nextLine();
        }
    }

    private static void BuscaCliente() {
        String confereCliente;
        char confereEditar;

        int contador = 0;
        System.out.println("                        2 - BUSCA POR CLIENTE.     \n");
        System.out.print("Informe o nome do cliente: \n");
        ler.nextLine();
        confereCliente = ler.nextLine();

        for (int i = 0; i < 20; i++) {
            if (confereCliente.equals(nomeCliente[i])) {
                System.out.println("| " + nomeCliente[i] + "|" + enderecoCliente[i] + "|" + telefoneCliente[i] + "|");
                contador++;

                System.out.println("Deseja editar as informações do cliente? (S/N)");
                confereEditar = ler.next().charAt(0);

                if (confereEditar == 'S') {
                    System.out.println("Digite novamente o nome do cliente: ");
                    ler.nextLine();
                    nomeCliente[i] = ler.nextLine();
                    System.out.println("Digite novamente o endereço do cliente: ");
                    enderecoCliente[i] = ler.nextLine();
                    System.out.println("Digite novamente o telefone do cliente: ");
                    telefoneCliente[i] = ler.nextLine();
                }
            }
        }

        if (contador < 1) {
            System.out.println("Cliente não encontrado");
        }
    }

    private static void CadastroNovoProduto() {
        int quantidadeDeProdutos;

        System.out.println("                        3 - CADASTRO DE NOVO PRODUTO.     \n");
        System.out.println("Informe quantos produtos deseja cadastrar: ");
        quantidadeDeProdutos = ler.nextInt();

        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println("Digite o nome do produto: ");
            ler.nextLine();
            nomeProduto[i] = ler.nextLine();
            System.out.println("Digite a descrição do produto: ");
            descricaoProduto[i] = ler.nextLine();
            System.out.println("Digite o valor do produto: ");
            valorCompra[i] = ler.nextDouble();
            System.out.println("Digite a porcentagem de lucro: ");
            porcentagemLucro[i] = ler.nextDouble();
            System.out.println("Digite a quantidade em estoque: ");
            quantidadeEstoque[i] = ler.nextInt();
        }
    }

    private static void BuscaProduto() {
        String confereProduto;
        char confereEditarProduto;

        int contador = 0;
        System.out.println("                        4 - BUSCA POR PRODUTO.     \n");
        System.out.print("Informe o nome do produto: \n");
        ler.nextLine();
        confereProduto = ler.nextLine();

        for (int i = 0; i < 20; i++) {
            if (confereProduto.equals(nomeProduto[i])) {
                //System.out.println("|NOME DO PRODUTO|DESCRIÇÃO DO PRODUTO|VALOR + "|");
                System.out.println("|" + nomeProduto[i] + "|" + descricaoProduto[i] + "|" + valorCompra[i] + "|" + "|" + porcentagemLucro[i] + "|" + quantidadeEstoque[i] + "|");
                contador++;

                System.out.println("Deseja editar as informações do produto? (S/N)");
                confereEditarProduto = ler.next().charAt(0);

                if (confereEditarProduto == 'S') {
                    System.out.println("Digite o novo nome do produto: ");
                    ler.nextLine();
                    nomeProduto[i] = ler.nextLine();
                    System.out.println("Digite a nova descrição do produto: ");
                    descricaoProduto[i] = ler.nextLine();
                    System.out.println("Digite o novo valor do produto: ");
                    valorCompra[i] = ler.nextDouble();
                    System.out.println("Digite a nova porcentagem de lucro: ");
                    porcentagemLucro[i] = ler.nextDouble();
                    System.out.println("Digite a nova quantidade em estoque: ");
                    quantidadeEstoque[i] = ler.nextInt();
                }
            }
        }

        if (contador < 1) {
            System.out.println("Produto não encontrado");
        }
    }

    private static void CadastroVenda() {
        System.out.println("                        5 - CADASTRO DE VENDA.     \n");
        System.out.println("Funcionalidade não desenvolvida");

        for (int i = 0; i < quantidadeDeClientes; i++) {

            System.out.println((i + 1) + ". " + nomeCliente[i]);

        }
    }


    public static void main(String[] args) {
        int opcao;

        do {
            //System.out.println("\n\n           ### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
            System.out.println("\n                  ========================================");
            System.out.println("                  |     1 - Cadastro de novo cliente.    |");
            System.out.println("                  |     2 - Busca por cliente.           |");
            System.out.println("                  |     3 - Cadastro de novo produto     |");
            System.out.println("                  |     4 - Busca por produto.           |");
            System.out.println("                  |     5 - Cadastro de venda            |");
            System.out.println("                  |     6 - Mostrar produtos em estoque  |");
            System.out.println("                  |     0 - Sair                         |");
            System.out.println("                  ========================================\n");

            System.out.print("Opção -> ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    LimpaTela();
                    CadastroCliente();
                    break;

                case 2:
                    LimpaTela();
                    BuscaCliente();
                    break;

                case 3:
                    LimpaTela();
                    CadastroNovoProduto();
                    break;

                case 4:
                    LimpaTela();
                    BuscaProduto();
                    break;

                case 5:
                    LimpaTela();
                    CadastroVenda();
                    break;

                case 6:
                    LimpaTela();
                    System.out.println("opcao 6");
                    break;

                default:
                    System.out.println("Fechando programa!");
                    break;
            }
        } while (opcao != 0);
    }
}
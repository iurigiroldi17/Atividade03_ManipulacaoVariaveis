import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Declaração das variáveis
        String nomeProduto = "Cadeira de Escritório";
        double precoUnitario = 200.00; // Preço unitário do produto
        int quantidadeComprada = 15; // Quantidade de produtos comprados
        double taxaImposto = 0.12; // Taxa de imposto (12%)
        double margemLucro = 0.25; // Margem de lucro desejada (25%)

        // Operações Simples
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        double precoVendaNecessario = valorTotalComImpostos * (1 + margemLucro);

        // Arredondar e formatar valores
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = df.format(valorTotalComImpostos);
        String precoVendaNecessarioFormatado = df.format(precoVendaNecessario);

        // Mensagem final
        String mensagemFinal = String.format(
                "Produto: %s\nValor Total com Impostos: %s\nPreço de Venda Sugerido: %s",
                nomeProduto, valorTotalComImpostosFormatado, precoVendaNecessarioFormatado
        );

        // Exibição dos Resultados
        System.out.println(mensagemFinal);
    }
}
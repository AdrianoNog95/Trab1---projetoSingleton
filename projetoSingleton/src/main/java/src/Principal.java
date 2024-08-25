package src;

public class Principal {
    public static void main(String[] args) {
        GerenciadorDeImpressao gerenciadorDeImpressao = GerenciadorDeImpressao.getInstance();

        gerenciadorDeImpressao.adicionarAFila("Relatório Anual.pdf");
        gerenciadorDeImpressao.adicionarAFila("Contrato.docx");
        gerenciadorDeImpressao.adicionarAFila("Apresentação.pptx");

        gerenciadorDeImpressao.processarFila();
    }
}

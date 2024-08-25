package src;

import java.util.LinkedList;
import java.util.Queue;

public class GerenciadorDeImpressao {
    private static GerenciadorDeImpressao instance;

    private Queue<String> filaDeImpressao;

    private GerenciadorDeImpressao() {
        filaDeImpressao = new LinkedList<>();
    }

    public static synchronized GerenciadorDeImpressao getInstance() {
        if (instance == null) {
            instance = new GerenciadorDeImpressao();
        }
        return instance;
    }

    public void adicionarAFila(String documento) {
        filaDeImpressao.offer(documento);
        System.out.println("Documento adicionado à fila de impressão: " + documento);
    }

    public void processarFila() {
        while (!filaDeImpressao.isEmpty()) {
            String documento = filaDeImpressao.poll();
            System.out.println("Imprimindo documento: " + documento);
        }
    }

    // Método público para obter a fila de impressão
    public Queue<String> getFilaDeImpressao() {
        return filaDeImpressao;
    }
}
import org.junit.Before;
import org.junit.Test;
import src.GerenciadorDeImpressao;

import static org.junit.Assert.*;

public class GerenciadorDeImpressaoTest {

    private GerenciadorDeImpressao gerenciador;

    @Before
    public void setUp() {
        gerenciador = GerenciadorDeImpressao.getInstance();
    }

    @Test
    public void testAdicionarAFila() {
        gerenciador.adicionarAFila("Documento1.pdf");

        assertNotNull("A fila de impressão não deve estar vazia", gerenciador.getFilaDeImpressao());
        assertTrue("A fila de impressão deve conter um documento", gerenciador.getFilaDeImpressao().contains("Documento1.pdf"));
    }

    @Test
    public void testProcessarFila() {
        gerenciador.adicionarAFila("Documento1.pdf");
        gerenciador.adicionarAFila("Documento2.pdf");
        gerenciador.processarFila();

        assertTrue("A fila de impressão deve estar vazia após o processamento", gerenciador.getFilaDeImpressao().isEmpty());
    }
}

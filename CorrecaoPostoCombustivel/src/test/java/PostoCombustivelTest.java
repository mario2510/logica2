import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class PostoCombustivelTest {

    private PostoCombustivel postoCombustivel = new PostoCombustivel();

    public PostoCombustivelTest() {
        postoCombustivel.setQuantidadeDeLitros(10);
        postoCombustivel.setTipoCombustivel(1);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verificarValorAPagar() {
        assertEquals("Valor a pagar: R$44.900000000000006", postoCombustivel.verificarValorAPagar());
        postoCombustivel.setTipoCombustivel(2);
        assertEquals("Valor a pagar: R$36.800000000000004", postoCombustivel.verificarValorAPagar());
        postoCombustivel.setTipoCombustivel(3);
        assertEquals("Valor a pagar: R$37.1", postoCombustivel.verificarValorAPagar());
        postoCombustivel.setTipoCombustivel(4);
        assertEquals("Valor a pagar gasolina: R$44.900000000000006\nValor a pagar alcool: R$36.800000000000004", postoCombustivel.verificarValorAPagar());
        postoCombustivel.setTipoCombustivel(10);
        assertEquals("Inválido!", postoCombustivel.verificarValorAPagar());
    }

    @org.junit.jupiter.api.Test
    void calcularValor() {
        assertEquals(44.9, postoCombustivel.calcularValor(), 0.2);
    }
}
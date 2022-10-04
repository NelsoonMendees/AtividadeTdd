import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ElevadorTest {

    @Test
    public void testConstrutor() {
        Elevador elevador = new Elevador(10, 0, 15, 0);
        Assert.assertEquals(elevador, elevador);
    }

    @Test
    public void setPessoasAcimaDaCapacidade() {
        Elevador elevador = new Elevador();
        elevador.setnPessoas(8);
        elevador.Iniciar(10, 10);
        elevador.Entra(4);
        Assert.assertEquals(elevador.getnPessoas(), 10);
    }

    @Test
    public void setvalorNegativoEmPessoa() {
        Elevador elevador = new Elevador();
        elevador.setnPessoas(-1);
        Assert.assertEquals(0, elevador.getnPessoas());
    }

    @Test
    public void setCapacidade() {
        Elevador elevador = new Elevador();
        elevador.setCapacidade(10);
        Assert.assertEquals(10, elevador.getCapacidade());
    }

    @Test
    public void setValorNegativoEmCapacidade() {
        Elevador elevador = new Elevador();
        elevador.setCapacidade(-1);
        Assert.assertEquals(0, elevador.getCapacidade());
    }

    @Test
    public void setAndartotal(){
        Elevador elevador = new Elevador();
        elevador.setAndarTotal(15);
        Assert.assertEquals(15, elevador.getAndarTotal());
    }

    @Test
    public void setAndarTotalNegativo(){
        Elevador elevador = new Elevador();
        elevador.setAndarTotal(-1);
        Assert.assertEquals(0, elevador.getAndarTotal());
    }

    @Test
    public void setAndarAtual(){
        Elevador elevador = new Elevador();
        elevador.setAndarAtual(2);
        Assert.assertEquals(2, elevador.getAndarAtual());
    }

    @Test
    public void setAndarAtualNegativo(){
        Elevador elevador = new Elevador();
        elevador.setAndarAtual(-1);
        Assert.assertEquals(0, elevador.getAndarAtual());
    }

    @Test
    public void testEntrada() {
        Elevador elev = new Elevador(10, 0, 0, 0);
        elev.Entra(3);
        Assert.assertEquals(3, elev.getnPessoas());
    }

    @Test
    public void testQtdEntradaNegativo() {
        Elevador elevador = new Elevador();
        elevador.Entra(-1);
        Assert.assertEquals(0, elevador.getnPessoas());
    }

    @Test
    public void testQtdSaida(){
        Elevador elevador = new Elevador(10, 5, 10, 10);
        elevador.Sai(4);
        Assert.assertEquals(1, elevador.getnPessoas());
    }

    @Test
    public void testQtdSaidaMaiorQueNumeroDePessoas(){
        Elevador elevador = new Elevador(10, 5, 10, 10);
        elevador.Sai(6);
        Assert.assertEquals(0, elevador.getnPessoas());
    }

    @Test
    public void testQtdSaidaNegativo(){
        Elevador elevador = new Elevador(10, 5, 10, 10);
        elevador.Sai(-1);
        Assert.assertEquals(5, elevador.getnPessoas());
    }

    @Test
    public void testSobeAndar(){
        Elevador elevador = new Elevador(10, 5, 10, 0);
        elevador.Sobe(2);
        Assert.assertEquals(2, elevador.getAndarAtual());
    }

    @Test
    public void testSubirAcimaDoAndarTotal(){
        Elevador elevador = new Elevador(10, 5, 10, 8);
        elevador.Sobe(4);
        Assert.assertEquals(10, elevador.getAndarAtual());
    }

    @Test
    public void testSetSobeNumeroNegativo(){
        Elevador elevador = new Elevador(10, 5, 10, 10);
        elevador.Sobe(-1);
        Assert.assertEquals(10, elevador.getAndarAtual());
    }

    @Test
    public void tesDescer(){
        Elevador elevador = new Elevador(10, 5, 10, 8);
        elevador.Desce(3);
        Assert.assertEquals(5, elevador.getAndarAtual());
    }

    @Test
    public void testDescerValorMaiorQueAndarAtual(){
        Elevador elevador = new Elevador(10, 5, 10, 8);
        elevador.Desce(9);
        Assert.assertEquals(1, elevador.getAndarAtual());
    }

    @Test
    public void testDescerValorNegativo(){
        Elevador elevador = new Elevador(10, 5, 10, 8);
        elevador.Desce(-1);
        Assert.assertEquals(8, elevador.getAndarAtual() );
    }

    @Test
    public void testIniciarElevador() {
        Elevador elevador = new Elevador();
        elevador.Iniciar(10, 15);
        Assert.assertEquals(elevador.getCapacidade(), 10);
        Assert.assertEquals(elevador.getAndarTotal(), 15);
    }
}

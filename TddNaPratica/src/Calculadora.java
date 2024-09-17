import org.junit.Test;

import static org.junit.Assert.assertEquals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {

    // metodo de soma para ser validado pelo metodo de testeDeveriaSomarDoisNumeros;
    public int Soma(int valorA, int valorB){
        return valorA + valorB;
    }
    

    //Metodo de subtração para ser valdiado pelo metodo de testeDeveriaSubtrairDoisNumeros;
    public int Subtracao(int valorA, int valorB){
        return valorA - valorB;
    }

    //Método de multiplicação para ser validadopelo metodo de testeDeveriaMultiplicarDoisnumeros
    public int Multiplicacao(int valorA, int valorB){
        return valorA * valorB;
    }
    // método de divisão para ser validaddo pelo método de testeDivisãoDoisNumeros
    public int Divisao(int valorA, int valorB){
        return valorA / valorB;
    }

    @Test
    public void deveriaSomarDoisNumeros() throws Exception {
        int valorA = 5;
        int valorB = 4;
        Calculadora calculadora = new Calculadora();
        int Soma = calculadora.Soma(valorA, valorB);
        assertEquals(9, Soma);
    }

    @Test
    public void deveriaSubtrairDoisNumeros() throws Exception{
        int valorA = 6;
        int valorB = 5;
        Calculadora calculadora = new Calculadora();
        int Subtracao = calculadora.Subtracao(valorA, valorB );
        assertEquals( 1, Subtracao);
    }

    @Test
     public void deveriaMultiplicar() throws Exception{
        int valorA = 4;
        int valorB = 5;
        Calculadora  calculadora = new Calculadora();
        int Multiplicacao = calculadora.Multiplicacao(valorA, valorB);
        assertEquals(20, Multiplicacao);
    }

    @Test
    public void deveriaDividir(){
        int valorA = 4;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int Divisao = calculadora.Divisao(valorA, valorB);
        assertEquals(2, Divisao);
    }

    @Test(expected = ArithmeticException.class)
    public void deveriaDividirDoisNumeros() throws Exception{
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        calculadora.Divisao(valorA, valorB);
    }
}

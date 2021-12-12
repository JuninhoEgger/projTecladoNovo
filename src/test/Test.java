package test;

import quadrado.Quadrado;

public class Test {
    private boolean resposta;
    private double resultado;
    private double resultadoEsperado;

    Quadrado quadrado = new Quadrado();

    public String calcularPerimetroTest() {
        quadrado.setLadoA(3);
        quadrado.setLadoB(4);
        resultadoEsperado = 14;
        resultado = quadrado.calcularPerimetro();
        resposta = resultado == resultadoEsperado;
        if (resposta) {
            return "O TESTE DE PERÍMETRO FUNCIONOU";
        }
        return "O TESTE DE PERÍMETRO NÃO FUNCIONOU";
    }

    public String calcularAreaTest() {
        quadrado.setLadoA(7);
        quadrado.setLadoB(4);
        resultadoEsperado = 28;
        resultado = quadrado.calcularArea();
        resposta = resultado == resultadoEsperado;
        if (resposta) {
            return "O TESTE DE ÁREA FUNCIONOU";
        }
        return "O TESTE DE ÁREA NÃO FUNCIONOU";
    }
}

package quadrado;

import formageometrica.FormaGeometrica;

public class Quadrado extends FormaGeometrica {
    private int ladoA;
    private int ladoB;

    public Quadrado() {
        super();
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public double calcularArea() {
        return this.ladoA * this.ladoB;
    }

    public double calcularPerimetro() {
        return (this.ladoA * 2) + (this.ladoB * 2);
    }

    @Override
    public String toString() {
        return "Lado A: " + ladoA +
                "\nLado B: " + ladoB +
                "\nID: " + this.getId();
    }
}

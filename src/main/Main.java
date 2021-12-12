package main;

import test.Test;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        JOptionPane.showMessageDialog(null, test.calcularPerimetroTest());
        JOptionPane.showMessageDialog(null, test.calcularAreaTest());
    }
}

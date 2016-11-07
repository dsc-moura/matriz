
package matriz;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        Matriz vetor = new Matriz(Integer.parseInt(JOptionPane.showInputDialog("Tamanho ? ")));
        vetor.inserir();
        vetor.imprimirDados();
        vetor.x();      
    }
}

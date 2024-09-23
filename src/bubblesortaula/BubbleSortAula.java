package bubblesortaula;

import java.util.Random;

public class BubbleSortAula {

    static void troca(Integer[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    static void bSort(Integer v[], int n) {

        int x = 0;
        int y = 0;
        boolean flag;

        for (int fase = 1; fase < n; fase++) {
            flag = false;
            x++;
            
            for (int j = 0; j < n - fase; j++) {
                
                if (v[j] > v[j + 1]) {
                    troca(v, j, j + 1);
                    flag = true;
                    y++;    
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println("Quantidade de fases: " + x);
        System.out.println("Quantidade de trocas: " + y);
    }

    static Integer[] gerarVetor(int n, int max) {
        Random rand = new Random();
        Integer[] vetor = new Integer[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = rand.nextInt(max) + 1;
        }

        return vetor;
    }

    static void mostrarVetor(Integer[] v) {
        int tamanho = v.length;
        for (int i = 0; i < tamanho; i++) {
            System.out.print(v[i] + "|");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Integer[] meuVetor = gerarVetor(10, 100);
        Integer[] VetorTeste = {2, 1, 5, 9, 10, 11, 12, 15, 14, 13};
        Integer[] VetorOrdenado = {1, 2, 5, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Vetor Gerado");
        mostrarVetor(VetorOrdenado);
        System.out.println("\n");
        bSort(VetorOrdenado, 10);
        System.out.println("\n");
        System.out.println("Vetor Ordenado");
        mostrarVetor(VetorOrdenado);
    }

}

// Este código foi desenvolvido assumindo o grafo sendo um Boolean

package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS2 {
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;

    public int[] cor;
    public int[] distancia;
    public Integer[] ante;
    public Queue<Integer> fila;

    public boolean[][] grafo;

    public BFS2(boolean[][] grafo) {
        this.grafo = grafo;
        int tamanhoGrafo = grafo.length;
        cor = new int[tamanhoGrafo];
        distancia = new int[tamanhoGrafo];
        ante = new Integer[tamanhoGrafo];
        fila = new LinkedList<>();
    }

    public void BFS(int s) {
        for (int i = 0; i < grafo.length; i++) {
            cor[i] = BRANCO;
            distancia[i] = -1;
            ante[i] = null;
        }

        cor[s] = CINZA;
        distancia[s] = 0;
        fila.add(s);

        while (!fila.isEmpty()) {
            int u = fila.poll();
            for (int v = 0; v < grafo.length; v++) {
                if (grafo[u][v] && cor[v] == BRANCO) {
                    cor[v] = CINZA;
                    distancia[v] = distancia[u] + 1;
                    ante[v] = u;
                    fila.add(v);
                }
            }
            cor[u] = PRETO;
        }
    }
}
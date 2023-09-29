# Busca em Largura (Breadth-First Search - BFS)

A Busca em Largura (ou Breadth-First Search - BFS) é um algoritmo **fundamental na teoria dos grafos**. Ela é amplamente utilizada para explorar e buscar informações em estruturas de grafo de maneira sistemática e eficiente. O BFS começa a busca a partir de um nó raiz e se espalha de forma nivelada, explorando todos os vizinhos desse nó antes de prosseguir para os vizinhos dos vizinhos. Isso garante que o algoritmo visite todos os nós em uma camada antes de descer para a próxima camada.

________________________

# Breadth-First Search (BFS)

Breadth-First Search (BFS) is a **fundamental algorithm in graph theory**. It is widely used to systematically and efficiently explore and search for information within graph structures. BFS begins the search from a root node and spreads out level by level, exploring all the neighbors of a node before moving on to the neighbors' neighbors. This ensures that the algorithm visits all nodes in one layer before descending to the next layer.

### Funcionamento do BFS:

1. Comece a busca a partir de um nó raiz.
2. Coloque o nó raiz em uma fila.
3. Enquanto a fila não estiver vazia:
- Remova o nó da frente da fila.
- Explore todos os vizinhos desse nó que ainda não foram visitados.
- Coloque esses vizinhos na fila.
4. Continue até que a fila esteja vazia ou até que todos os nós tenham sido visitados.

________________________

### How BFS Works:

1. Start the search from a root node.
2. Place the root node in a queue.
3. While the queue is not empty:
- Remove the front node from the queue.
- Explore all unvisited neighbors of this node.
- Add these neighbors to the queue.
4. Continue until the queue is empty or until all nodes have been visited.

### Vantagens do BFS:

- Encontra o caminho mais curto em um grafo não ponderado.
- Usado em algoritmos como Dijkstra e Ford-Fulkerson.
- Identifica componentes conectados em um grafo não direcionado.

________________________

### Advantages of BFS:

- Finds the shortest path in an unweighted graph.
- Used in algorithms like Dijkstra's and Ford-Fulkerson.
- Identifies connected components in an undirected graph.
## Busca em Profundidade (Depth-First Search - DFS)

A Busca em Profundidade (ou Depth-First Search - DFS) é um algoritmo fundamental na teoria dos grafos. Ao contrário da Busca em Largura (BFS), que explora todos os vizinhos de um nó antes de avançar, a DFS mergulha o mais profundamente possível em um ramo antes de retroceder. Isso a torna uma técnica adequada para várias aplicações, como busca de caminho, ordenação topológica e muito mais.

________________________

## Depth-First Search (DFS)

Depth-First Search (DFS) is a fundamental algorithm in graph theory. Unlike Breadth-First Search (BFS), which explores all neighbors of a node before moving on, DFS dives as deeply as possible down one branch before backtracking. This makes it suitable for various applications such as pathfinding, topological sorting, and more.

## Funcionamento da DFS:

1. Comece a busca a partir de um nó raiz.
2. Explore um vizinho não visitado desse nó o mais profundamente possível.
3. Quando não houver mais vizinhos não visitados, faça um "backtrack" para o nó anterior.
4. Repita os passos 2 e 3 até que todos os nós tenham sido visitados.

________________________

## How DFS Works:

1. Start the search from a root node.
2. Explore an unvisited neighbor of this node as deeply as possible.
3. When there are no more unvisited neighbors, backtrack to the previous node.
4. Repeat steps 2 and 3 until all nodes have been visited.

## Vantagens da DFS:

- Encontra soluções rapidamente em árvores e estruturas de grafo profundas.
- É usada em algoritmos como busca de caminho em profundidade e ordenação topológica.
- É eficiente em grafos densos.

_______________________

## Advantages of DFS:

- Quickly finds solutions in deep tree and graph structures.
- Used in algorithms like Depth-First Search pathfinding and topological sorting.
- Efficient in dense graphs.
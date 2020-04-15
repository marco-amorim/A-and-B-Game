# A-and-B-Game

Problema:
A e B estão jogando um jogo. Neste jogo, ambos são fornecidos inicialmente com uma lista de números. (Ambos têm a mesma lista, mas sua própria cópia).

Agora, ambos têm uma estratégia diferente para jogar o jogo. A escolhe o elemento do início de sua lista. B escolhe do final de sua lista.

Você precisa gerar o resultado na forma de uma lista de saída.

O método a ser seguido em cada etapa para criar a lista de saída é:

- Se o número escolhido por A for maior que B, a saída desta etapa será 1. B removerá o número escolhido da lista.
- Se o número escolhido por A for menor que B, a saída desta etapa será 2. A removerá o número escolhido da lista.
- Se ambos tiverem o mesmo número, a saída desta etapa será 0. Ambos A e B removerão o número que foi escolhido da lista.

Este jogo termina quando pelo menos um deles não tem mais elementos a serem escolhidos, ou seja, quando a lista ficar vazia.
Retornar a lista criada com os resultados ao final.

Formato de entrada:
A primeira linha consiste em um número N, tamanho da lista fornecida.
A próxima linha consiste em N números separados por espaço.

Formato de saída:
Saída da lista de saída necessária.
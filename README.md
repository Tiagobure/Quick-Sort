# Quick Sort
## Ordenação rapida
***
O Quick Sort (ou "Ordenação Rápida") é um algoritmo de ordenação eficiente e amplamente utilizado. 
Ele segue a abordagem "dividir para conquistar" para ordenar elementos de um array. 
O Quick Sort é conhecido por sua velocidade e eficiência na prática, com uma complexidade de tempo média de O(nlog⁡n)O(nlogn). 
No entanto, no pior caso, sua complexidade pode chegar a O(n2)O(n2), embora isso seja raro se o algoritmo for bem implementado.

Complexidade do Tempo

    Melhor caso e Caso médio: O(nlog⁡n)O(nlogn)

        Ocorre quando o pivô divide o array em duas partes aproximadamente iguais.

    Pior caso: O(n2)O(n2)

        Ocorre quando o pivô é sempre o menor ou o maior elemento (por exemplo, se o array já estiver ordenado e o pivô for sempre o primeiro ou o último elemento).
***
## Escolha do Pivô

### A escolha do pivô é crucial para a eficiência do Quick Sort. Algumas estratégias comuns são:

    Último elemento (como no exemplo acima).

    Primeiro elemento.

    Elemento do meio.

    Elemento aleatório (reduz a chance de cair no pior caso).

#### Vantagens

    Muito rápido na prática, com complexidade média de O(nlog⁡n)O(nlogn).

    Ordenação in-place (não requer muita memória adicional).

    Fácil de implementar.

#### Desvantagens

    Pior caso de O(n2)O(n2) (embora raro com boas escolhas de pivô).

    Não é estável (a ordem relativa de elementos iguais pode não ser preservada).
***
![quick_sort](https://github.com/user-attachments/assets/2714b108-3feb-4ba6-9cf5-59cd095cf47a)


    

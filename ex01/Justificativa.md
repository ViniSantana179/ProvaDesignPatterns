## Padrão Utilizado: Strategy Pattern

## Porque: O padrão Strategy encapsula diferentes comportamentos em classes separadas, permitindo trocar regras ou algoritmos de forma flexível, sem alterar o restante do sistema.

## O que é: 
Diferentes algoritmos para cálculo de tarifa de transporte (terrestre, aéreo, marítimo)

## Por que usar:
Permite trocar facilmente entre diferentes tipos de cálculo sem alterar o código principal. Cada tipo de transporte tem sua própria regra de cálculo encapsulada.

## Benefício:
- Flexibilidade para adicionar novos tipos de transporte
- Cada algoritmo fica isolado em sua própria classe
- Fácil manutenção e extensão do código
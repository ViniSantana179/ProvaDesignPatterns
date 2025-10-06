## Padrão Utilizado: Decorator Pattern

## Porque: O padrão Decorator foi escolhido para essa problemática, pois permite adicionar comportamentos a objetos sem precisar alterar a estrutura do objeto, ou seja, estamos garantindo que nossa classe respeite o O do SOLID, sendo fechado para mudança e aberto para extensão.

## O que é:
Adiciona funcionalidades extras a relatórios (formato PDF, gráficos, etc.)

## Por que usar:
Permite combinar diferentes formatos e características em relatórios sem alterar a classe base, respeitando o princípio Aberto/Fechado.

## Benefício:
- Flexibilidade para criar relatórios com diferentes combinações
- Não modifica classes existentes
- Permite composição dinâmica de funcionalidades
- Extensibilidade sem quebrar código existente
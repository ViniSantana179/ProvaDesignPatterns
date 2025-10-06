## Padrão Utilizado: Observer Pattern

## Porque: O padrão Observer é indicado para este problema, pois permite que uma classe concreta receba atualizações de outra classe. Para isso, criamos uma estrutura capaz de armazenar os objetos interessados em observar a classe observada, garantindo que, sempre que ocorrer uma atualização, todos os observadores sejam notificados e atualizados automaticamente.

## O que é:
Sistema de notificação de leitores de um site de notícias

## Por que usar:
Permite que múltiplos objetos (leitores) sejam notificados automaticamente quando algo acontece (nova notícia) sem o site precisar conhecer cada leitor individualmente.

## Benefício:
- Baixo acoplamento entre observador e observado
- Facilita adição/remoção dinâmica de observadores
- Notificação automática e simultânea
- Flexibilidade na comunicação entre objetos
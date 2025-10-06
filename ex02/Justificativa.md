## Padrão Utilizado: Factory Pattern

## Porque: O padrão Factory foi escolhido porque o enunciado indica a necessidade de criar diferentes métodos de pagamento sem expor os detalhes de sua implementação. Dessa forma, a lógica de criação dos objetos fica centralizada na fábrica, mantendo o código principal simples, desacoplado e fácil de estender.

## O que é:
Criação de diferentes métodos de pagamento (Boleto, PIX, Cartão de Crédito)

## Por que usar:
Centraliza a criação de objetos em um só lugar, permitindo fácil adição de novos métodos de pagamento sem quebrar código existente.

## Benefício:
- Desacoplamento entre cliente e classes concretas
- Facilita extensibilidade para novos tipos de pagamento
- Centraliza lógica de criação em local específico
- Manutenção simplificada
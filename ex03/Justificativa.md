## Padrao Utilizado: Observer

## Porque: O padrão Observer é indicado para este problema, pois permite que uma classe concreta receba atualizações de outra classe. Para isso, criamos uma estrutura capaz de armazenar os objetos interessados em observar a classe observada, garantindo que, sempre que ocorrer uma atualização, todos os observadores sejam notificados e atualizados automaticamente.
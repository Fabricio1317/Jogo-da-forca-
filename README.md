Jogo da Forca em Java (POO)
Este projeto é uma implementação completa do clássico Jogo da Forca, desenvolvida em Java utilizando os princípios da Programação Orientada a Objetos (POO).

Objetivo do projeto
O propósito deste projeto é reforçar conceitos essenciais de POO, como encapsulamento, herança, polimorfismo e abstração, além de trabalhar com estruturas de dados, manipulação de strings e interação via console.

Como o jogo funciona

O programa escolhe automaticamente uma palavra secreta aleatória de uma lista predefinida.
O jogador deve tentar adivinhar a palavra, digitando letras uma de cada vez.
A cada erro, uma parte do boneco da forca é desenhada.
O jogo termina quando:
O jogador adivinha todas as letras corretamente (vitória);
O número máximo de tentativas é atingido (derrota).

Principais características técnicas
Geração aleatória de palavras: a palavra secreta é escolhida de forma automática a cada partida.
Validação de entrada: impede que o jogador insira números, espaços ou caracteres repetidos.
Feedback instantâneo: mostra o progresso da palavra e quantas tentativas restam.

Organização em classes:
Uma classe principal para controlar o jogo;
Uma classe para representar a lógica do jogo (palavra, tentativas, verificação);
Estrutura limpa e fácil de manter.

Conceitos de POO aplicados
Encapsulamento: variáveis internas protegidas, acessadas por métodos específicos.
Abstração: o funcionamento interno do jogo é ocultado do usuário, que interage apenas com métodos de alto nível.
Polimorfismo e Herança: caso seja necessário criar versões alternativas do jogo, a estrutura permite expansão sem reescrever tudo.

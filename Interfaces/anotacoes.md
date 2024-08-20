# Anotações do Curso de Java: Capítulo de Interfaces

## Descrição
Este repositório contém anotações resumidas sobre o capítulo de **Interfaces** do meu curso de Java. Aqui, abordo o conceito de interfaces, suas diferenças em relação ao polimorfismo e classes abstratas, além de incluir um exercício de fixação com código de exemplo.

## Interfaces em Java
Uma **interface** em Java é um contrato que define métodos que uma classe deve implementar. Diferente de uma classe abstrata, uma interface não pode conter implementações de métodos (até Java 8, que introduziu métodos default). As interfaces são usadas para definir capacidades ou comportamentos comuns que podem ser aplicados a classes diferentes, independentemente de suas hierarquias.

### Diferenças entre Interfaces, Polimorfismo e Classes Abstratas:
- **Interfaces**:
  - Definem um contrato que as classes devem cumprir.
  - Não podem ter estado (variáveis de instância) e, antes do Java 8, não podiam ter implementações de métodos.
  - Uma classe pode implementar várias interfaces.

- **Polimorfismo**:
  - Refere-se à capacidade de uma variável de referenciar objetos de diferentes classes ao mesmo tempo, dependendo do contexto.
  - É alcançado através de herança (classe abstrata) e implementação de interfaces.

- **Classes Abstratas**:
  - Podem ter métodos abstratos (sem corpo) e métodos concretos (com corpo).
  - Podem ter estado (variáveis de instância).
  - Uma classe só pode herdar de uma classe abstrata.

## Exemplo de Código
O repositório inclui um exercício de fixação para reforçar o entendimento sobre interfaces. O exercício pode ser encontrado no arquivo `Program.java`. 

### Como Executar
1. Clone o repositório para sua máquina local:
   ```bash
   git clone git@github.com:reimbazz/CursoJava.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd Interfaces
   ```
3. Compile o código:
   ```bash
   javac -d bin src/Program.java
   ```
4. Execute o exercício:
   ```bash
   java -cp bin Program
   ```

## Considerações Finais
Essas anotações são uma síntese dos principais conceitos abordados no capítulo de interfaces. A prática e revisão contínua são essenciais para dominar esses conceitos.
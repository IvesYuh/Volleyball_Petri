

-   "Model" em um projeto Spring Boot CRUD é fornecer uma estrutura para manipular os dados da aplicação.
  Ela encapsula as informações que estão sendo gerenciadas e fornece métodos para interagir com esses dados, como criar, ler, atualizar e excluir registros do banco de dados.
  Na Model podemos encontrar a herança  na classe Jogadores EXTENDS Pessoa também, tal componente permite que uma classe herde características de outra classe(pai).
Por fim verificamos que exitem 2 tipos de classe, a concreta: classe que pode ser instanciada diretamente para criar objetos e fornece implementações concretas para todos os seus métodos.
Ja a classe abstrata: classe que não pode ser instanciada diretamente, ou seja, você não pode criar objetos a partir dela. Em vez disso, ela serve como um modelo para outras classes que estenderão dela.

-A "repository" é responsável por fornecer uma interface para acessar e manipular os dados armazenados em um banco de dados.
Ela encapsula a lógica de acesso aos dados e fornece métodos para executar operações CRUD (Create, Read, Update, Delete) no banco de dados.
Alem disso, podemos verificar metodos abstratos dentro dela, ou seja,  método que é declarado em uma classe, mas não contém implementação.
Em vez disso, ele serve como um contrato que as subclasses devem seguir, ou seja, as subclasses devem fornecer uma implementação concreta para esse método.
Podemos verificar o polimorfismo também nesse metodo abstrado que é utulizado em ambas classes Jogadores e Treinadores para listar por time.

-A camada de serviço é responsável por implementar a lógica de negócios da aplicação, coordenando a interação entre os diferentes componentes do sistema,
como manipulação de dados, validação, processamento e execução de operações complexas.
Onde podemos verificar a lógica de listar, criar, atualizar e deletar.

# Sobre Stream API
- Manipulação de coleções com paradigma funcional de forma paralela.
- Imutável - Não altera a coleção origem, sempre cria uma nova coleção.

### Principais funcionalidades
> - **Mapping** - Retorna ua coleção com mesmo tamanho da origem com os elementos alterados
> - **Filtering** - Retorna uma coleação igual ou menor que a coleção origem, com os elementos intactos.
> - **ForEach** - Executa uma determinada lógica para cada elemento, retornando nada.
> - **Peek** - Executa uma determinada lógica para cada elemento, retornando a própria coleção.
> - **Couting** - Retorna um inteiro que representa a contagem de elementos.
> - **Grouping** - Retorna uma coleção agrupada de acordo com a regra definida.

### Observações importantes:

- O método map (que se encontra dentro de stream) _**sempre**_ retornará um objeto com o _**mesmo**_ tamanho, sendo ele do mesmo tipo do objeto ou não
- O método stream não possui essa obrigação de retornar o objeto do mesmo tamanho. Vide que ele possui métodos de filtro, contains, min e assim por diante.
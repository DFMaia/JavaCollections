# Sobre o Comparators

### Ordem de estudo:
>ExampleList
>StudentReverseComparator
>ComparatorExampleList

### Implementação:
> java.util.Comparator -> Interface para definir classe com regra de ordenação
> java.util.Comparable -> Interface para definir regra de ordenação em uma classe de domínio

### Características:
> O **Comparator** será sempre implementado na classe de não domínio.
> > Recebe dois objeto de comparação

> O **Comparable** será sempre implementado na classe domínio.
> >Recebe um objeto de comparação

> Utilizado **primariamente** (mas não obrigatóriamente) em List
> Permite a oerdenação de objetos complexos.
> > Usei isso em uma exemplo de código aqui no git hub: https://github.com/DFMaia/CadastroAlunoEmLista do qual queria uma ordenação de um atributo int dentro de uma lista com vários objetos. 
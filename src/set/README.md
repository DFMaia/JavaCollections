# Sobre o Set

### Implementações:
> - **HashSet**
> - **TreeSet**
> - **LinkedHashSet**

### Obervações:
> Por **padrão** não garantem ordem
> Não permitem **itens repetidos**
> Permitem:
> > - **Adição**
> > - **Remoção normalmente**
> > - **Leitura, apenas navegação**

> Não permitem:
> > - **Buscar por item**
> > - **Atualização**

#### Algumas observações sobre HashSet, LinkedHashSet eTreeSet 👇

**HashSet**

> Quando usar: Ordenação não é necessária.

> > Ordenação: Não é ordenada. Valores duplicados não são permitidos.

> > > Performance: Alta.

**LinkedHashSet**

> Quando usar: Quando a ordem de inserção deve ser mantida.

> > Ordenação: Na ordem em que os elementos foram inseridos.

> > > Performance: Lenta em decorrência da ordem de inserção.

**TreeSet**

> Quando usar: Quando é necessário mudar a ordem dos elementos.

> > Ordenação: Mantém a ordem de ordenação estabelecida.

> > Performance: Performance de leitura é grande. para modificar cada elemento a lista deve ser reordenada. Mais lento que o LinkedHashSet
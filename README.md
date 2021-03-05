# Repository of Lists, Queues, HashSet, and so on.

#### Some observations about HashSet, LinkedHashSet and TreeSet :point_down:

**HashSet**

> When to use: When sorting is no necessary.

> > Sort: It is not sorted. No duplicated values are allowed.

> > > Performance: High performance.

**LinkedHashSet**

> When to use: When is important to keep the adding order.

> > Sort: Keep the adding order.

> > > Performance: Slow due to the adding order.

**TreeSet**

> When to use: When is necessary to change the order of elements.

> > Sort: Keeps the order and can be resorted.

> > Performance: The read performance is great. To modify any element it has to be resorted. Slower than LinkedHashSet
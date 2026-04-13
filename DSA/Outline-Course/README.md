# Outline Course

## Topics

1. String
2. Array
3. Recursion
4. Sorting
5. Binary Search
6. HashMap
7. Heap
8. Greedy
9. Divide and Conquer
10. Prefix Sum
11. Prime Number
12. LinkedList1
13. LinkedList2
14. Graph1
15. Graph1-p2
16. Graph2
17. BFS
18. DFS
19. Flooding
20. TopoSort
21. Interval

## String

- Python has `str`, which is very similar to Java `String`.
- Most string operations are `O(n)`, and a new copy is often created.
- Topics to review:
  - String to integer (`atoi`)
  - Longest common prefix

## Array

### Static vs Dynamic Arrays

- Static: fixed size
- Examples:
  - C++, Java: `int[]`, `double[]`
- Dynamic: resizable, can add or remove elements
- Examples:
  - C++: `vector`
  - Java: `ArrayList`
  - Python: `list`

### Key Notes

- Data is stored contiguously in memory.
- Random access: `O(1)`
- Adding or removing elements at the end for dynamic arrays: `O(1)` amortized
- Declared inside a function: stack memory
- Declared in global state: heap memory

## Sample Exercise Folders

- `01-string`
- `02-array`
- `03-recursion`
- `04-sorting`
- `05-binary-search`
- `06-hashmap`

Each folder contains a `tasks.md` file with sample exercises and hints.

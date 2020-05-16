# Data Structures & Algorithms

This is a repository including concepts, source codes and exercises related to Data Structures & Algorithms

## Concepts
* Arrays

### Arrays
Arrays represent collection of homogeneous data type. Below are the three main features:
- Arrays can contain any data type e.g. Objects, int, Strings, etc.
- Arrays have fixed data size.
- Arrays have random access i.e. using the index we can access any array item in constant time O(1) 

The main killer feature of Arrays is that we can get or set any item in array in constant time.

##### Insert into an Array

If we want to insert an item at an index then this is done in below steps
- copy the existing items and shift forward
- insert the item to index
- increment the size counter

Insert is a linear operation O(n)

##### Delete an Array Element
- copy the existing items and shift backward
- decrement the size counter

In deletion, we simply overwrite so we have one less step. Deletions is a linear operation O(n)
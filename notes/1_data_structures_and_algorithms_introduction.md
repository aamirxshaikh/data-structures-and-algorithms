# What are Data Structures?
- Data structures are different ways of storing data on a computer.

## Example: Google Maps for a Neighborhood
### Data
- Home, stores, and other locations with coordinates (latitude, longitude)
- Streets (one-way and two-way)

### Options to Store Data
1. **List of Paths**
  - Each path is stored as a sequence of locations (e.g., "home -> store A", "store A -> store B", etc.)
  - Pros: Can determine if a path exists between two locations
  - Cons: Cannot determine if a path is one-way or two-way

2. **Table of Connections**
  - For each location, store a list of locations that can be reached directly
  - Pros: Can determine if a path is one-way or two-way
  - Cons: More space required than list of paths

### Relation to Data Structures
- The list of paths corresponds to an array or list data structure
- The table of connections corresponds to a hash table or hash map data structure

## What are Algorithms?
- Algorithms are operations performed on data structures, and the sets of instructions for executing them.
- Example: Finding the shortest path from home to school
 1. Find all places that can be reached from home
 2. From each of those places, find all paths and keep track of distance traveled
 3. Repeat until reaching the destination
 4. Compare distances and find the shortest path

- The algorithm may differ based on the data structure used to store the data.

## Importance of Data Structures and Algorithms
- Help write efficient software
 - Example: Rewriting code reduced data retrieval time from 7-10 hours to 5-10 minutes

## Party Example
- Attendees bring a ball with their name, representing them
- Two data structure options for storing attendees:
 1. **Array**
    - Long box with partitions, each ball placed in order of arrival
    - Easy to update a specific position, but harder to resize
 2. **Linked List**
    - Boxes connected by strings, each ball placed in order of arrival
    - Harder to update a specific position, but easier to resize

- Choice depends on the situation and requirements (e.g., expected number of attendees, frequent updates, etc.)

## Conclusion
- Data structures and algorithms will be explained more technically using concepts like classes, objects, memory, and code snippets.
- Applying concepts through solving problems is important for learning.
- Recommended resource: brilliant.org's "Computer Science Fundamentals" course, which teaches through problem-solving.

# Intro
- Video split into 3 parts:
 1. Basics of arrays
 2. Memory vs. storage
 3. How integers and integer arrays are stored in memory

## Arrays
- Array is a collection of items of a single type
 - Example: array of integers, array of strings
 - Usually not multiple types in one array

### Arrays
- `int sample_array[5] = {2, 4, 6, 8, 100};`
 - Creates an array of 5 integers with values 2, 4, 6, 8, 100
 - Visualized as a box with 5 partitions
- Changing elements
 - `sample_array[0] = 20;` - Changes first element to 20
 - `sample_array[1] = -5;` - Changes second element to -5
- Cannot add more partitions to an existing array

## Memory
- Two mechanisms for storing data:
 1. **Memory (RAM)**: Data is temporary, disappears when computer is turned off
 2. **Storage (HDD, SSD, etc.)**: Data is permanent
- Memory is faster than storage for reading/writing data
- Memory is like a temporary desk, storage is like a file cabinet

### Applications
- Applications are loaded from storage into memory when launched
- Running too many applications can consume all available memory, slowing down the computer

### Checking Memory on Windows
- `Task Manager` shows 8GB of memory
- `Performance` shows memory usage by applications

## Integers
- Integers are stored in memory, not storage
- Each integer is expressed as 32 bits (32 ones and zeros)
 - Example: 1 = 00000000000000000000000000000001
 - Example: 2 = 00000000000000000000000000000010

### Model of Memory
- Memory modeled as a long tape of bytes (8 bits each)
- Each byte has an address (integer) for easy access
- To store an integer, use 4 consecutive bytes (4 x 8 bits = 32 bits)
 - Example: `int a = 1;` stored in 4 consecutive bytes

## Array of Integers
- Arrays use consecutive bytes to store each element
 - Example: `int sample_array[3] = {5, 3, 20};`
   - 5 stored in first 4 bytes, 3 in next 4 bytes, 20 in last 4 bytes
- Cannot add more elements to an existing array
 - Need to create a new, larger array and copy elements
- Resizable arrays (e.g., Python lists, Java ArrayList)
 - Initially allocate small array
 - When adding more elements, create new larger array and copy elements

## Conclusion
- Simplified explanation of arrays and memory
- Recommended resource: brilliant.org's "Computer Memory" course
 - "Linear Memory Model" section for detailed memory explanation
 - "Binary, Octal, and Hexadecimal" section for refresher on number systems

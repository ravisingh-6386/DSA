# 📚 Data Structures and Algorithms (DSA) - Java

A comprehensive collection of **Data Structures** and **Algorithms** implementations in **Java**. This repository contains practice code, solutions, and examples for learning and mastering DSA concepts from basics to advanced topics.

## 🎯 Purpose

This repository is designed for:
- **Learning DSA fundamentals** from scratch
- **Practice and skill building** in problem-solving
- **Interview preparation** for technical interviews
- **Understanding core concepts** of computer science
- **Building strong foundations** for advanced programming

## 🛠️ Technology Stack

- **Language**: Java
- **JDK Version**: Java 8 or higher
- **IDE**: Eclipse, IntelliJ IDEA, or VS Code
- **Build Tool**: Maven/Gradle (optional)

## 📁 Project Structure

```
DSA/
├── input.java              # Basic input handling
├── Loop.java               # Loop constructs and iterations
├── if-else.java            # Conditional statements
├── pattern.java            # Pattern printing problems
├── array.java              # Array operations and problems
├── arraylist.java          # ArrayList and dynamic arrays
├── strings.java            # String manipulation and algorithms
├── recursion.java          # Recursive problem solving
├── sorting.java            # Sorting algorithms
├── stack.java              # Stack data structure
├── queue4.java             # Queue data structure
├── linkedlist.java         # Linked list implementations
├── trees.java              # Tree data structures
├── trie.java               # Trie data structure
└── README.md               # This file
```

## 📋 Topics Covered

### 1. **Fundamentals**
| File | Topics |
|------|--------|
| **input.java** | User input, Scanner class, input parsing |
| **Loop.java** | For, While, Do-while loops, nested loops |
| **if-else.java** | Conditional logic, switch statements, ternary operators |

### 2. **Problem-Solving Basics**
| File | Topics |
|------|--------|
| **pattern.java** | Number patterns, star patterns, pyramid patterns |
| **array.java** | Array initialization, 1D/2D arrays, array operations, searching, rotation |
| **arraylist.java** | ArrayList, dynamic arrays, list operations |

### 3. **String Algorithms**
| File | Topics |
|------|--------|
| **strings.java** | String manipulation, palindromes, anagrams, case conversion |

### 4. **Advanced Problem-Solving**
| File | Topics |
|------|--------|
| **recursion.java** | Recursion concepts, backtracking, recursive patterns, factorial, fibonacci |
| **sorting.java** | Bubble sort, selection sort, insertion sort, merge sort, quick sort |

### 5. **Data Structures**
| File | Topics |
|------|--------|
| **stack.java** | Stack operations, LIFO, push, pop, peek, balanced parentheses |
| **queue4.java** | Queue operations, FIFO, enqueue, dequeue, circular queue |
| **linkedlist.java** | Single linked list, node operations, insertion, deletion, traversal |
| **trees.java** | Binary trees, BST, tree traversal (Inorder, Preorder, Postorder) |
| **trie.java** | Trie data structure, prefix matching, autocomplete |

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE or Text Editor
- Command line/Terminal access

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ravisingh-6386/DSA.git
   cd DSA
   ```

2. **Verify Java installation:**
   ```bash
   java -version
   javac -version
   ```

### Running Individual Programs

#### Using Command Line:

1. **Compile:**
   ```bash
   javac array.java
   ```

2. **Run:**
   ```bash
   java array
   ```

#### Using IDE:

1. Open the file in your IDE
2. Click "Run" or press `Ctrl+Shift+F10` (IntelliJ) / `Ctrl+Alt+Shift+X, J` (Eclipse)

## 📖 Learning Roadmap

### Level 1: Basics (Start Here)
```
1. input.java        - Learn input handling
2. Loop.java         - Master loops
3. if-else.java      - Understand conditionals
4. pattern.java      - Practice logic with patterns
```

### Level 2: Core Data Structures
```
5. array.java        - Work with arrays
6. strings.java      - String operations
7. arraylist.java    - Dynamic arrays
8. sorting.java      - Sorting algorithms
```

### Level 3: Advanced Concepts
```
9. stack.java        - Stack data structure
10. queue4.java       - Queue data structure
11. linkedlist.java   - Linked lists
12. recursion.java    - Recursive thinking
```

### Level 4: Complex Structures
```
13. trees.java        - Tree structures
14. trie.java         - Advanced strings with Trie
```

## 💡 Key Concepts by File

### array.java
- Static vs dynamic arrays
- Array traversal and manipulation
- Linear search, binary search
- Array rotation, reverse operations
- Multidimensional arrays

### recursion.java
- Base case and recursive case
- Call stack understanding
- Factorial, Fibonacci, power
- String reversal
- Array operations recursively

### sorting.java
- Time complexity comparison
- Space complexity analysis
- In-place vs out-of-place sorting
- Stable vs unstable sorting
- Practical use cases

### linkedlist.java
- Node creation and linking
- Insertion and deletion operations
- Traversal techniques
- Reverse linked list
- Cycle detection

### trees.java
- Tree terminology
- Binary trees and BST
- Traversal methods:
  - Inorder
  - Preorder
  - Postorder
  - Level order
- Tree operations

### stack.java
- LIFO principle
- Applications (balanced parentheses, expression evaluation)
- Stack implementation
- Common stack problems

### queue4.java
- FIFO principle
- Simple and circular queues
- Queue operations
- Real-world applications

### trie.java
- Trie data structure
- Prefix-based searching
- Autocomplete implementation
- Efficient string matching

## 🔧 Code Examples

### Compile and Run Example:

```bash
# Compile a single file
javac array.java

# Run the program
java array

# Compile all files
javac *.java

# Run a specific class
java recursion
```

### Import and Use in Another File:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        // Your code here
    }
}
```

## 📚 Time & Space Complexity Reference

| Algorithm | Time (Avg) | Time (Worst) | Space |
|-----------|-----------|-------------|-------|
| Linear Search | O(n) | O(n) | O(1) |
| Binary Search | O(log n) | O(log n) | O(1) |
| Bubble Sort | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n²) | O(log n) |
| Stack Push/Pop | O(1) | O(1) | O(n) |
| Queue Enqueue/Dequeue | O(1) | O(1) | O(n) |
| Tree Search | O(log n) | O(n) | O(h) |
| Trie Search | O(m) | O(m) | O(ALPHABET_SIZE) |

## 🎓 Topics to Master

### Essential Concepts
- [ ] Arrays and Lists
- [ ] Strings and Patterns
- [ ] Sorting and Searching
- [ ] Recursion and Backtracking
- [ ] Stacks and Queues
- [ ] Linked Lists
- [ ] Trees and BST
- [ ] Graphs (Coming soon)
- [ ] Hashing (Coming soon)
- [ ] Dynamic Programming (Coming soon)

## 🤝 How to Use This Repository

1. **Study**: Read through each file and understand the logic
2. **Practice**: Modify the code and try different inputs
3. **Test**: Run the programs with various test cases
4. **Debug**: Use IDE debugger to trace execution
5. **Learn**: Understand time/space complexity
6. **Implement**: Write your own versions

## 🐛 Troubleshooting

### Common Issues

**Issue**: "class not found" error
```bash
# Solution: Make sure you're in the correct directory
cd DSA
java array
```

**Issue**: Scanner not working
```java
// Make sure to import
import java.util.Scanner;

// And create Scanner object
Scanner sc = new Scanner(System.in);
```

**Issue**: "symbol not found" error
```bash
# Solution: Compile first before running
javac array.java
java array
```

## 📝 Best Practices

1. **Understand before coding** - Read and understand the algorithm first
2. **Comment your code** - Explain complex logic
3. **Test edge cases** - Empty arrays, single elements, large datasets
4. **Analyze complexity** - Know time and space complexity
5. **Practice regularly** - Consistency is key
6. **Solve variations** - Try modified versions of problems

## 🚀 Future Enhancements

- [ ] Graphs and graph algorithms
- [ ] Hashing and hash maps
- [ ] Dynamic programming solutions
- [ ] Greedy algorithms
- [ ] Backtracking problems
- [ ] Advanced tree structures (AVL, Red-Black Trees)
- [ ] Practice problems and solutions
- [ ] Complexity analysis for each algorithm
- [ ] Interview questions and answers
- [ ] Unit tests and test cases

## 📖 Recommended Learning Resources

### Books
- "Introduction to Algorithms" by Cormen, Leiserson, Rivest, Stein
- "Data Structures and Algorithms in Java" by Robert Lafore
- "Cracking the Coding Interview" by Gayle Laakmann McDowell

### Online Platforms
- [LeetCode](https://leetcode.com)
- [HackerRank](https://www.hackerrank.com)
- [GeeksforGeeks](https://www.geeksforgeeks.org)
- [CodeSignal](https://codesignal.com)
- [Codeforces](https://codeforces.com)

### Video Tutorials
- Abdul Bari DSA Course
- Kunal Kushwaha Java + DSA
- Love Babbar DSA Course

## 🎯 Interview Preparation Tips

1. **Understand the problem** - Clarify requirements
2. **Discuss approach** - Explain your solution strategy
3. **Code optimally** - Write clean, efficient code
4. **Test thoroughly** - Check edge cases
5. **Discuss complexity** - Explain time and space
6. **Optimize further** - Look for improvements

## 👥 Contributing

Contributions are welcome! Please:

1. Fork the repository
2. Create a feature branch
3. Add your DSA implementations
4. Write clear comments and documentation
5. Test your code thoroughly
6. Submit a pull request

### Guidelines
- Follow Java naming conventions
- Add comments for complex logic
- Include time/space complexity analysis
- Test with multiple inputs
- Update this README if adding new topics

## 📄 License

This project is open source and available to the public.

## 👤 Author

**Ravi Singh** (@ravisingh-6386)

## 📞 Support & Contact

For questions or suggestions:
- Open an issue on GitHub
- Check existing issues for answers
- Review code comments and documentation
- Contact the maintainer

## 📊 Project Statistics

- **Created**: December 10, 2025 (53 days ago)
- **Last Updated**: March 2, 2026
- **Language**: Java
- **Total Files**: 14+ implementations
- **Status**: Active Development

## 🏆 Achievement Milestones

- [ ] Complete all fundamental topics
- [ ] Add 50+ practice problems
- [ ] Create solution tutorials
- [ ] Achieve 100+ GitHub stars
- [ ] Build comprehensive documentation

---

## ⭐ Star this Repository!

If you find this helpful, please give it a star ⭐ to show your support!

**Happy Learning! 🚀**

---

**Made with ❤️ by Ravi Singh**

[GitHub Repository](https://github.com/ravisingh-6386/DSA)

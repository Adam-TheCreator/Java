// Written by Claude
// Lesson 8: The for loop, a shortcut for counting.

void main() {
    // The while way (from Lesson 7)
    int count = 1;
    while (count <= 3) {
        IO.println("while says: " + count);
        count = count + 1;
    }

    // The for way: same thing, one line
    for (int i = 1; i <= 3; i++) {
        IO.println("for says: " + i);
    }
}

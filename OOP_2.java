class Computer {
    public void playMusic(){   //void meaning returns nothing
        System.out.println("Music");
    }
    public String getMePen( int cost){
        return "Pen";
    }
    public String getMePen(){    //method overloading
        return "Pen";
    }
}

public class OOP_2  {

    public static void main(String args[]){
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }
}

//Stack and heap

"Each method as a stack":

// Correct with clarification: When a method is called, it creates a stack frame (also known as an activation record) that gets pushed onto the call stack. This stack frame contains information such as method parameters, local variables, and return addresses. Each method call does not create a separate "stack" but contributes to the call stack, which is a LIFO (Last In, First Out) data structure.
// "Each object as a heap":

// Incorrect wording but a correct concept: Objects are not "heaps" themselves, but they are typically allocated on the heap memory. When an object is created (e.g., using new in Java or C++), the memory for that object is allocated on the heap, and the reference to that memory is stored in the stack if the object is a local variable.
// "The object when initialized in a method appears in a stack but it uses addresses to access the values of the properties from the heap":

// Correct with clarification: When an object is initialized inside a method, a reference to the object (not the object itself) is stored in the stack. The actual object resides in the heap, and the stack contains the memory address (reference) that points to the object in the heap. The object’s fields or properties are accessed via this reference.
// "A stack composes of key and value":

// Incorrect: A stack does not inherently consist of key-value pairs. A stack is a data structure that operates on a LIFO principle, meaning the last element pushed onto the stack is the first one to be popped off. Stack frames might hold variable names and their corresponding values (which could be seen as key-value pairs), but the stack itself is not defined by key-value pairs.
// "A heap is a collection of objects":

// Correct with clarification: The heap is a region of memory used for dynamic memory allocation, where objects (and other dynamically allocated memory) are stored. It is managed by the memory allocator (part of the runtime or operating system). The heap can be thought of as a collection of objects, but it’s more accurate to describe it as a memory space where objects live.

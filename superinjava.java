//NEW FEATURES ABOUT CONSTRUCTORS -> for constructor Flexibility
// before Java 24, super() had to be the first statement in a constructor
// ensuring that the superclass is fully initialized before any subclass logic
// runs.

// Java 24 introduces Flexible Constructor Bodies (JEP 492 - Third Preview),
// allowing code execution before super() in the prologue.

class College {
    College(String name) {
        System.out.println("Name of Student is : " + name);
    }
}

class Student extends College {
    Student() {
        String myname = "Ankit";
        super(myname); // super() can be used now anywhere not restrcited as earlier to use as first
                       // statement (same for this() keyword)

    }
}

// NOTE : RED warning showing this feature is not before java 24.
void main() {
    Student st = new Student();
}
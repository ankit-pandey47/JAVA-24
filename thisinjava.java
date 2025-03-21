// ABOUT CONSTRUCTORS -> for constructor Flexibility
//Before Java 24:  return inside constructors was not allowed
// Now:  You can exit early using return

//Before Java 24:  this() had to be the first statement
// Now:  You can call another constructor anywhere in the body means u can use this() anywhere

class user {

    user() {
        System.out.println("You can use this() anywhere in the constructor");
        this(1, 2);// call const. of two int argument

    }

    user(int a, int b) {
        System.out.println("sum of a and b is : " + a + b);
        int c = 2;
        this(c);
        System.out.println("Done");
    }

    user(int c) {
        System.out.println("value of c is : " + c);
    }
}

void main() {
    user u = new user();
}

class B {
    s : Int <- 10;
    g (y:String) : Int {
        y.concat(s)
    };
    f (x:Int) : Int {
        x+1
    };
};
class A inherits B {
    a : Int;
    b : B <- new B;
    f(x:Int) : Int {
        x+a
    };
};
class Main {
    x : Int <- 3;
    y : Int;
    z : Int;
     main() : Object {
           x+z
     };

};

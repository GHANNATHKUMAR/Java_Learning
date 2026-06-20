// we have seen inheritance
// parent don't use child
// but child use parent
// polymorphism -> compile time polymprphism and run time polymorphism
// compile time polymporphism is acheived by constructors overloading and method overloading
// runtime polymorphism is achieved by method overriding ,
// runtime polymorphism use two types -> early binding(compile time binding , like method overloading and multiple constructors)
// and late binding(run time binding , like method overriding )
// early binding is also called compile time binding  using final keyword methods , and late binding is also called run time binding (override the methods , no eroor if override will happen)
// final key word is used in class then class cannot be subclassed -> inheritance is not allowed
// we cannot defines two methods with same signature , even if one is final . THat would cause a compilation error
// in final , we can overload methods with the same name but different parameters , one can be final while others are not
// static does not depend on object
//No, ❌ you cannot override a final method in Java.
// overloading and overriding does not apply to instance variables
// overriding depends on object , static does not depends on object , hence static methods cannot be overriden .. we cannot override static methods
// innerclass can be static but not outerclass can be nonstatic
// casting -> upcasting (automatic) and downcasting(it is done)
// abstraction basically hiding unncessary details and on;ly showing necessary details / information
// // public , private , protected are access modifiers
// public -> goe in every clss , subclss ,package , world diff package
// protected -> in all except world different package
// no modifier only goes upto subclass of same package
// private only in class
// only class for protected
// note: for protected modifier -> only the subclass can access the protected member in the base class when it is in different package , not even in the class itself
// // java does not support multiple inheritance
//
public class Endsem4 {

}

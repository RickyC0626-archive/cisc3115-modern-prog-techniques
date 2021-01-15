# Abstract vs Concrete Objects

+ In both shape clients of abstract and concrete shape, there are no compilation nor runtime errors
+ In ShapeClientWontCompile of AbstractShape, there are compilation errors
+ In ShapeClientError of ConcreteShape, there are no compilation errors, but there are runtime errors

Abstract classes and methods allow the developer to recognize errors during compilation
instead of runtime, which can be tragic if it is software that you're planning to sell.

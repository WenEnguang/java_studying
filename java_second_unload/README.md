1、定义一个圆类Circle，成员变量：半径 radius；成员方法：构造方法、get和set半径的方法、计算面积和周长的方法。
定义圆柱和圆锥类，定义相应的变量成员和成员方法。
使用以上类编程，输出圆柱和圆锥面积和体积。

2、声明一个类MyClass，包含一个整型变量data和封装这个变量的两个方法getData()和setData()。声明一个该类的子类SubClass，包含一个整型变量Mydata和封装这个变量的两个方法getMydata()和setMydata()，编写主程序检查SubClass类中的所有变量与方法（包括继承自父类的变量和方法）。

3、下面给出一个根据雇员类型利用多态性完成工资单计算的程序。定义一个类Employee作为超类，Employee的子类有Boss（每星期发给他固定工资，而不计工作时间）、PieceWorker（按其生产的产品数发放工资）、HourlyWorker（根据工作时间长短发放工资）。对所有雇员类型都使用earnings()方法完成其工资单的计算，但每个人挣的工资按他所属的雇员类计算，所有雇员类都是从超类Employee派出生的。所以在超类中声明earnings()方法，该方法没有实质性工作，而是在每个子类都提供恰当的earnings()方法的重写。为了计算雇员的工资，程序仅使用雇员对象的一个超类引导并调用earnings()方法。
4、编写一个应用程序，实现以下功能：
①声明一个接口(Calculability)，接口中包含一个方法area()。
②声明一个三角形类实现该接口，类名为Triangle，类中包含两个变量、一个带参数的构造方法和一个计算三角形面积的方法：
三角形的底边长w
三角形的高h
构造方法Triangle(double width,double height)。
计算三角形面积的方法area()，该方法覆盖接口(Calculability)的同名方法，计算三角形的面积（w*h/2）。
③声明一个锥体类（Taper），包含一个接口对象bottom(锥体的底)和一个变量（锥体的高）height，一个带参数的构造方法，一个换底方法setBottom()，一个锥体体积的计算方法volume()。
④声明一个主类Exp6_1，在主方法中声明接口和锥体类的对象，输出锥体的底面积和锥体的体积（bottom的面积*height/3）。
println 'Hello'

// 重要资料：
// https://www.cnblogs.com/wxdlut/p/15589685.html#top  Groovy入门
// https://juejin.cn/post/6954350461818421278#heading-1 5 分钟的 Java 转 Groovy 教程
// https://juejin.cn/post/7092367604211253256#heading-8 gradle 进阶

// There is a synthetic class 'TestGroovy' generated for script code
//class TestGroovy {
//
//}
// 根据out生成的目录得知， TestGroovy.groovy 编译器会生成一个同名的类：  public class TestGroovy extends Script {}
// 如果这个时候再 定义一个同名的 class TestGroovy 就会抛出上面的编译异常导致无法编译。

// 这样就可以： Test 类跟文件名不同 这个是 Closure类中的sample
class Test {
    def x = 30
    def y = 40

    def run() {
        def data = [ x: 10, y: 20 ]
        def cl = { y = x + y }
        cl.delegate = data
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl()
        assert x == 30
        assert y == 40
        assert data == [x:10, y:30]
    }
}
// 做个测试调一下看看
new Test().run()
// Closure.OWNER_FIRST（默认）： 优先在 owner 对象中寻找，再去 delegate 对象中寻找；
//Closure.DELEGATE_FIRST： 优先在 delegate 对象中寻找，再去 owner 对象中寻找；
//Closure.OWNER_ONLY： 只在 owner 对象中寻找；
//Closure.DELEGATE_ONLY： 只在 delegate 对象中寻找；
//Closure.TO_SELF： 只在闭包本身寻找；

name = 'Wangfang'
age = '18'

// 占位符拼接的用法
println("my name is ${name},my age is ${age}.")


def x = 10
def y = 25

println 'Sum of x + y = ' + (x + y)

println 'methodName return value = ' +methodName()
println 'methodName2 return value = ' +methodName2()


// todo 搞一个 入门的 groovy 工程来完成1.0版本的 groovy 语言学习。

// Gradle 系列（1）为什么说 Gradle 是 Android 进阶绕不去的坎
// https://juejin.cn/post/7092367604211253256#heading-8

// 函数定义 默认最后一行语句为返回值，不一定要 return keyword.
def methodName() {
    "In methodName def lastCode no return keyword"
}

String methodName2() {
    "In methodName2:String lastCode no return keyword"
}

// 省略参数类型
def methodName(param1, param2) {
    // Method Code
}

def methodName(String param1, String param2) {
    // Method Code
}

// 默认参数： Groovy 支持指定函数参数默认值，默认参数必须放在参数列表末尾。例如：
def methodName3(param1, param2 = 1) {
    // Method Code
}

// 返回值： 可以省略 return，默认返回最后一行语句的值。例如：
def methodName4() {
    return "返回值"
}
//  等价于
def methodName5() {
    "返回值"
}


// kt 定义函数：
//fun maxOf(a:Int,b:Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}


// 带隐式参数 it
def greeting = { "Hello, $it!" }
assert greeting('Patrick') == 'Hello, Patrick!'

// 不带隐式参数 it
//def magicNumber = { -> 42 }
// error 不允许传递参数： No signature of method: TestGroovy$_run_closure2.call() is applicable for argument types: (Integer) values: [11]
def magicNumber = { it -> it+42 }
var magicNumberResult = magicNumber(11)
printf("magicNumberResult: $magicNumberResult") // 53

// 闭包参数简化： 函数的最后一个参数是闭包类型的化，在调用时可以简化，省略圆括号：
def methodName(String param1, Closure closure) {
    // Method Code
}

// 调用：
methodName("Hello") {
    // Closure Code
}
//----evan: 这个跟 kotlin 他妈的一样的套路。
// ------

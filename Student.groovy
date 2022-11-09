//实现 GroovyInterceptable 接口，才会把方法调用分派到 invokeMethod。

class Student implements GroovyInterceptable {
    def name

    def hello() {
        println('Hello ${name}') // ${name} 这种用法和 python 一样
    }

    @Override
    Object invokeMethod(String name, Object args) {
        System.out.println "invokeMethod : $name"

//        return super.invokeMethod(name, args)
    }
}

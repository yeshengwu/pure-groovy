//实现 GroovyInterceptable 接口，才会把方法调用分派到 invokeMethod。

class Student implements GroovyInterceptable {
    def name
    // todo 加了 invokeMethod 这个方法不执行了，为什么？
    def hello() {
        println('Hello ${name}') // ${name} 这种用法和 python 一样
    }

    @Override
    Object invokeMethod(String name, Object args) {
        System.out.println "invokeMethod : $name"
    }

    Object methodMissing(String name, Object args) {
        System.out.println "methodMissing : $name"
    }
}

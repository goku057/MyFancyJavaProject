
package myfancyjavaproject;

class MyClass{
    private String name;
    private static MyClass instance = new MyClass(name);
    private MyClass(){
        this.name = "Default name";
    }
    public MyClass(String name){
        this.name = name;
    }
    public static MyClass getInstance(String name){
        return instance;
    }
    public void printName(){
        System.out.println("The name is " + this.name);
    }
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
}
public class MyFancyJavaProject {

    
    public static void main(String[] args) {

        MyClass mc =MyClass.getInstance("Random");
        mc.printName();
        mc.sayHello();
    }
    
}

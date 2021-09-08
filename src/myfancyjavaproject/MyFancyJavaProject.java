
package myfancyjavaproject;

class MyClass{
    private String name;
    
    public MyClass(){
        this.name = "Default name";
    }
    public MyClass(String name){
        this.name = name;
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
        
        MyClass mc = new MyClass("Random");
        mc.printName();
        mc.sayHello();
    }
    
}

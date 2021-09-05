/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
public class MyFancyJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass mc = new MyClass("Random");
        mc.printName();
    }
    
}

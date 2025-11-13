package com.aaa;

public class akash {

    private Computer com;

//    public laptop llaapp;  // this one is the laptop class in right side we doing in this class with the private and how we acces this
                           //   in setter and constructor injection we do in the below

    private int age;      // this one wecrearte the instance variable

    public akash(){

        System.out.println("akash has construted");
    }

    public akash(int age) {
        this.age = age;
        System.out.println("akash1 has construted");  // this one is contructor injection for int age
    }

    public int getAge() {
        return age;                       // this one is setter injection for the int age we can add values without touching code we add in xml.
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public laptop getLlaapp() {
//        return llaapp;                    // this one is setter injection for the laptop
//    }
//
//    public void setLlaapp(laptop llaapp) {
//        this.llaapp = llaapp;
//    }
//
//    public akash(laptop llaapp) {
//        this.llaapp = llaapp;         // this one is contructor injection for laptop we run the laptop class in xml using constructor arg with ref
//        System.out.println("laptop1 has construted");
//    }


    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void run(){
        System.out.println("they runs so fast");

//        llaapp.compile();      // we calling the llaapp in the laptop in the upper

        com.compile();
    }
}
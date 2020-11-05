package com.company;

public class Stari{
    public synchronized  void StareA() throws InterruptedException {
        while (Constants.isA){
            wait();
        }
        Constants.isA=true;
        System.out.println("Documentul A nu poate fi obtinut fara documentele B si C: va redirectionam la ghiseele respective");
        //doSomething()
        StareB();
        StareC();
        System.out.println("Am obtinut documentul A");
        Constants.isA=false;
        notifyAll();
    }

    public void StareC() throws InterruptedException {
       if(Constants.isC ){
           wait();
       }
        Constants.isC = true;
        System.out.println("Documentul C nu poate fi obtinut fara documentul D: va redirectionam la ghiseul respectiv");
        StareD();
        System.out.println("Ati obtinut documentul C");
        Constants.isC = false;
        notify();

    }

    public void StareD() throws InterruptedException {

        if(Constants.isD){
            wait();
        }
        Constants.isD = true;
        System.out.println("Ati obtinut documentul D");
        Constants.isD = false;
        notify();
    }

    public  void StareB() throws InterruptedException {

        if(Constants.isB){
            wait();
        }
        Constants.isB=true;
        System.out.println("Ati obtinut documentul B");
        Constants.isB=false;
        notify();
    }
}

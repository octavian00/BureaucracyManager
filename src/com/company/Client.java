package com.company;

public class Client extends Thread{
    private String stare;
    Stari st;
    public Client(String stare,Stari st){
        this.stare = stare;
        this.st= st;
    }

    @Override
    public void run() {
        super.run();

        switch (stare){
            case "A":
                try {
                    st.StareA();
                } catch (InterruptedException e) {
                    System.out.println("ZUZUU");
                    e.printStackTrace();

                }
                break;
            case "B":
                try {
                    st.StareB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "C":
                try {
                    st.StareC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "D":
                try {
                    st.StareD();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:break;
        }
    }
}

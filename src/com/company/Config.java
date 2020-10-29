package com.company;

public class Config {

    public static String DOCUMENT_INITIAL="A";
    SCENARIO scenario=SCENARIO.INITIAL_STATE;
    public void  stari(){
        switch (scenario){
            case INITIAL_STATE:// A
                scenario=SCENARIO.SECOND_STATE;
                //ne trebuie documentul A , de la ce birou il obtinem
            case SECOND_STATE:// B si C
                scenario=SCENARIO.FINAL_STATE;
            case FINAL_STATE:break;
            default:
                throw new IllegalStateException("Unexpected value: " + scenario);
        }
    }
    enum SCENARIO{
        INITIAL_STATE,
        SECOND_STATE,
        FINAL_STATE
    }
}

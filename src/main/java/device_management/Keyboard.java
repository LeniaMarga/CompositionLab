package device_management;

import Behaviours.IInput;

public class Keyboard implements IInput{

    String language;

    public Keyboard(String language){
        this.language = language;
    }

    public String inputData(String data){
        return data;
    }



}

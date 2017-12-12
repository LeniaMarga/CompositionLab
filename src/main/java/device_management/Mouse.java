package device_management;

import Behaviours.IInput;

public class Mouse implements IInput{

    String type;
    int noButtons;

    public Mouse(String type, int noButtons){
        this.type = type;
        this.noButtons = noButtons;
    }

    public String click(){
        return "I clicked!";
    }

    public String inputData(String data){
        return data;
    }


}

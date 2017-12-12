package device_management;

import Behaviours.IInput;
import Behaviours.IOutput;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;
    private ArrayList<IOutput> outputDevices;
    private ArrayList<IInput> inputDevices;


    public Computer(int ram, int hddSize) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevices = new ArrayList<>();
        this.inputDevices = new ArrayList<>();
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice(IOutput output) {
        IOutput finaloutput = null;
        for (IOutput outputvar : outputDevices){
            if (outputvar == output) {
                finaloutput = outputvar;
            }
        }
        return finaloutput;
    }

    public IOutput outputData(IOutput output) {
        return getOutputDevice(output);
    }


    public IInput getInputDevice(IInput input) {
        for(IInput inputvar : inputDevices){
            if (inputvar == input){
                return inputvar;
            }
        }
        return null;
    }

    public IInput inputData(IInput input){
        return getInputDevice(input);
    }



    public void addToInputDevices(IInput input){
        inputDevices.add(input);
    }

    public void addToOutputDevices(IOutput output){
        outputDevices.add(output);
    }




//    public void setOutputDevice(IOutput outputDevice) {
//        this.getOutputDevice() = outputDevices;
//    }



//    public void setInputDevice(IInput inputDevice) {
//        this.inputDevice = inputDevice;
//    }
}

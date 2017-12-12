import Behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;
    Printer printer;
    Speaker speaker;

    @Before
    public void before() {
        mouse = new Mouse("Cool Mouse", 4);
        keyboard = new Keyboard("English");
        speaker = new Speaker(4);
        printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512);
        computer.addToInputDevices(mouse);
        computer.addToInputDevices(keyboard);
        computer.addToOutputDevices(speaker);
        computer.addToOutputDevices(printer);
    }


    @Test
    public void checkOutputDevice(){
        assertEquals(speaker, computer.getOutputDevice(speaker));
    }

    @Test
    public void checkInputDevice(){
        assertEquals(mouse, computer.getInputDevice(mouse));
    }


//    @Test
//    public void hasRam() {
//        assertEquals(8, computer.getRam());
//    }
//
//    @Test
//    public void hasHddSize() {
//        assertEquals(512, computer.getHddSize());
//    }
//
//    @Test
//    public void hasOutputDevice(){
//        IOutput outputDevice = computer.getOutputDevice();
//        assertNotNull(outputDevice);
//    }
//
//    @Test
//    public void canOutputDataViaSpeaker(){
//        Speaker speaker = new Speaker(4);
//        Mouse mouse = new Mouse("Cool Mouse", 4);
//        computer = new Computer(8, 512);
//        assertEquals("playing: Foo Fighters", computer.outputData("Foo Fighters"));
//    }
//
//    @Test
//    public void canOutputData() {
//        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
//    }

//    @Test
//    public void canOutputDataViaPrinter(){
//        Printer printer = new Printer("Epson", "Stylus", 120, 4);
//        Mouse mouse = new Mouse("Cool Mouse", 4);
//        computer = new Computer(8, 512);
//        assertEquals("printing: space invaders", computer.outputData("space invaders"));
//    }

//    @Test
//    public void canSetOutputDevice(){
//        Printer printer = new Printer("Epson", "Stylus", 120, 4);
//        computer.setOutputDevice(printer);
//        assertEquals("printing: space invaders", computer.outputData("space invaders"));
//    }

//    @Test
//    public void canInputData(){
//        Mouse mouse = new Mouse("Cool Mouse", 4);
//        Printer printer = new Printer("Epson", "Stylus", 120, 4);
//        computer = new Computer(8, 512);
//    }

//    @Test
//    public void canSetInputData(){
//        Keyboard keyboard = new Keyboard("English");
//        computer.setInputDevice(keyboard);
//        assertEquals("bananas", computer.inputData("bananas"));
//
//    }
}

package net.jonathan;

public class Car {

    private  String color;
    int num_tires = 4;
    private boolean engine_started;

    public Car (String color_paint){
        color = color_paint;
        engine_started = false;
    }

    public boolean startEngine(){
        engine_started = true;
        return true;
    }

    public String pressGasPedal(){
        if (engine_started){
            return "vroom";

        }else{
            return "click";

        }



    }


}


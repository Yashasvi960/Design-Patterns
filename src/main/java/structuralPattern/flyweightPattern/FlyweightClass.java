package structuralPattern.flyweightPattern;

import java.util.*;

public class FlyweightClass {

    static Map<String, IRobot> map = new HashMap<>();
    public static IRobot createRobot(String robotType) {
        if(map.containsKey(robotType)) {
            return map.get(robotType);
        }
        if(robotType.equals("Humanoid")) {
            HumanoidRobot humanoidRobot = new HumanoidRobot("Human", "HumanRobot");
            map.put("HumanoidRobot", humanoidRobot);
            return humanoidRobot;
        } else {
            AIRobot aiRobot = new AIRobot("AI", "AIRobot");
            map.put("AIRobot", aiRobot);
            return aiRobot;
        }


    }
}

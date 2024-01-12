package Enum;

class Main {
    public static void main(String[] args)
    {
        // EnumBehavior filEnumBehavior =  EnumBehavior.READ;
        // System.out.println(filEnumBehavior.canWrite());

        // FileMode fileMode = FileMode.READ;
        
        // if (fileMode.equals(fileMode.READ)) {
        //     System.out.println("Lendoo");
        // }


        FastRobot robot = new FastRobot();
        robot.setState(State.ON);
        robot.rotate(State.ESQUERDA, State.TRINTA);
        robot.move(State.CIMA, State.UM);

        System.out.println(robot);

    }
}
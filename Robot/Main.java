package Robot;

class Main{
    public static void main(String[] args)
    {
        FastRobot robot = new FastRobot();
        FastRobot robot2 = new FastRobot();

        robot.setState(State.ON);
        robot.rotate(Direction.RIGHT_30);
        robot.move(Way.AHEAD_FAST);

        robot2.setState(State.ON);
        robot2.rotate(Direction.RIGHT_30);
        robot2.move(Way.BEHIND_FAST);

        FastRobot.moveAll(Way.AHEAD_FAST);
        FastRobot.moveAll(Way.AHEAD_FAST);

        System.out.println(robot);
        System.out.println(robot2);
    }
}

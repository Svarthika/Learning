package practice.TaskJul7th;

interface SpeedLimit {
    //public static final
    int MAX_SPEED = 120;
}

class car implements SpeedLimit

{
    public static void main(String[] args) {
        System.out.println(SpeedLimit.MAX_SPEED);
    }
}

public class Test {
    public static void main(String[] args){
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        HD hd = new HD();
        hd.setAmount(200);
        PC pc = new PC(cpu,hd);
        pc.show();
    }

}

public class PC {
    CPU cpu;
    HD hd;

    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    public void setHd(HD hd){
        this.hd = hd;
    }
    public PC(CPU cpu,HD hd){
        setCPU(cpu);
        setHd(hd);
    }
    public void show(){
        System.out.print("CPU速度：");
        System.out.print(cpu.getSpeed());
        System.out.println();
        System.out.print("硬盘容量：");
        System.out.print(hd.getAmount());
        System.out.println();
    }

}

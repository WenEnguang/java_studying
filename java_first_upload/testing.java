interface PCI{
    void start();
    void stop();
}
class soundCard implements PCI{
    @Override
    public void start() {
        System.out.println("du,du,du...");
    }

    @Override
    public void stop() {
        System.out.println("stop...");
    }
}
class netCard implements PCI{
    @Override
    public void start() {
        System.out.println("du,du,du....");
    }

    @Override
    public void stop() {
        System.out.println("stop.....");
    }
}
class useCard{
    public void usePCI(PCI p){
        p.start();
        p.stop();
    }
}
public class testing {
    public static void main(String[] args){
        PCI nc = new netCard();
        PCI sc = new soundCard();
        useCard mb = new useCard();
        mb.usePCI(sc);
        mb.usePCI(nc);
    }
}

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println("=== STATUS AWAL ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("--------------------------");
        for(int i = 0; i < 10; i++) {
            System.out.println("Serangan ke-" + (i + 1));
            
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());
            if (wz.isDead()) {
                System.out.println("Walking Zombie KALAH / MATI!");
                break;
            }
            if (jz.isDead()) {
                System.out.println("Jumping Zombie KALAH / MATI!");
                break;
            }
            if (b.isDestroyed()) {
                System.out.println("Barrier HANCUR!");
                break;
            }

            System.out.println("--------------------------");
        }

        System.out.println("=== PERTARUNGAN SELESAI ===");
    }
}

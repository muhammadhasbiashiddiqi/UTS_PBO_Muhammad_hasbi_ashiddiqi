public class MainZombieGame {
    public static void main(String[] args) {

        Plant plant = new Plant();

        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(120, 3);
        Barrier barrier = new Barrier(80);

        System.out.println("=== SEBELUM SERANGAN ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(barrier.getBarrierInfo());
        System.out.println();

        // Plant menyerang zombie dan barrier
        plant.doDestroy(wz);
        plant.doDestroy(jz);
        plant.doDestroy(barrier);

        System.out.println("=== SETELAH SERANGAN ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(barrier.getBarrierInfo());
        System.out.println();

        // Zombie menyembuhkan diri
        wz.heal();
        jz.heal();

        System.out.println("=== SETELAH PENYEMBUHAN ===");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println();

        // Cek status barrier
        if (barrier.isDestroyed()) {
            System.out.println("Barrier telah hancur!");
        } else {
            System.out.println("Barrier masih berdiri.");
        }
    }
}

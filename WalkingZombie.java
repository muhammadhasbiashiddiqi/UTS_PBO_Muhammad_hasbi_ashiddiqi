public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        // Penyembuhan berdasarkan level
        if (level == 1) {
            health += health * 20 / 100;
        } else if (level == 2) {
            health += health * 30 / 100;
        } else if (level == 3) {
            health += health * 40 / 100;
        }
    }

    @Override
    public void destroyed() {
        // Health berkurang 20%
        health -= health * 20 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie -> " + super.getZombieInfo();
    }
}

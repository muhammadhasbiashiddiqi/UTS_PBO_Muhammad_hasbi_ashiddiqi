public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        // Penyembuhan berdasarkan level
        if (level == 1) {
            health += health * 10 / 100;
        } else if (level == 2) {
            health += health * 30 / 100;
        } else if (level == 3) {
            health += health * 40 / 100;
        }
    }

    @Override
    public void destroyed() {
        // Health berkurang 10%
        health -= health * 10 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie -> " + super.getZombieInfo();
    }
}

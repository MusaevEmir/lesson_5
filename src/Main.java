public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(150);
        boss.setDefence("Magic");
        System.out.println("здоровье: " + boss.getHealth() + "Урон: "
                + boss.getDamage() + "Тип защиты : " + boss.getDefence());
    }
}
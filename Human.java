public class Human extends Animal {

    public void number() {
        System.out.println(this.name + "06 ");
    }
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("김세민");

        System.out.println(human.name);
        human.number();
    }
}
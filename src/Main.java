public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bird bird1 = new Bird("Radu",7,"Colibri",200,true,true,"Green");
        if(bird1.canFly())
            System.out.println(bird1.getMaxAltitude());
        Fish fish1 = new Fish("Nemo",2,"Clown",false,20,"sweet",800);
        if(fish1.getName().equals("Nemo"))
            System.out.println("We are looking for Nemo!");
    }
}
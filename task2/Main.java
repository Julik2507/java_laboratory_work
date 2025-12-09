public class Main {
    public static void main(String[] args) {

        Storage<User> userStorage = new Storage<>();

        userStorage.add(new User("Alice", 20));
        userStorage.add(new User("Bob", 15));
        userStorage.add(new User("Charlie", 30));

        System.out.println(userStorage.getAll());
        System.out.println(userStorage.filter(u -> u.getAge() > 18));
        System.out.println(userStorage.find(u -> u.getName().equals("Charlie")));
        System.out.println(userStorage.sort(Comparator.comparingInt(u -> u.getAge())));


        Storage<Product> productStorage = new Storage<>();

        productStorage.add(new Product("Bread", 15));
        productStorage.add(new Product("Phone", 500));
        productStorage.add(new Product("Milk", 12));
        productStorage.add(new Product("Book", 25));

        System.out.println(productStorage.getAll());
        System.out.println(productStorage.filter(p -> p.price < 20));
        System.out.println(productStorage.sort(Comparator.comparingDouble(p -> p.price)));

        boolean removed = productStorage.remove(p -> p.price > 100);
        System.out.println("Удалено: " + removed);
        System.out.println(productStorage.getAll());
    }
}

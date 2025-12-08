public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Alice", 25, "Berlin", List.of("music", "travel")),
                new User("Bob", 17, "Paris", List.of("gaming")),
                new User("Charlie", 30, "Berlin", List.of("sport", "music")),
                new User("Diana", 14, "London", List.of("travel", "art")),
                new User("Ethan", 20, "Madrid", List.of("sport")),
                new User("Fiona", 10, "London", List.of("music")),
                new User("George", 40, "Berlin", List.of("travel", "sport")),
                new User("Hannah", 19, "Rome", List.of("cooking")),
                new User("Ivan", 22, "Paris", List.of("gaming", "sport")),
                new User("Julia", 16, "Rome", List.of("music", "dance")),
                new User("Kevin", 28, "Madrid", List.of("travel")),
                new User("Laura", 35, "London", List.of("sport", "fitness"))
        );

        users.stream().filter(u -> u.getAge() >= 18).forEach(u -> {System.out.println(u)});

        users.stream().filter(u -> u.getCity().equals("Berlin")).forEach(u -> {System.out.println(u)});

        users.stream().filter(u -> u.getTags().contains("sport")).forEach(u -> {System.out.println(u)});



        users.stream().sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);

        users.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);

        users.stream().sorted(Comparator.comparing(User::getCity).thenComparing(User::getName)).forEach(System.out::println);



        List<String> names = users.stream().map(User::getName).toList();

        List<Integer> nameLengths = users.stream().map(u -> u.getName().length()).toList();

        Set<String> uniqueTags = users.stream().flatMap(u -> u.getTags().stream()).collect(Collectors.toSet());

        //

        Map<String, List<User>> byCity = users.stream().collect(Collectors.groupingBy(User::getCity));

        Map<String, List<User>> byAgeCategory = users.stream()
                .collect(Collectors.groupingBy(u -> {
                    if (u.getAge() <= 12) return "child";
                    if (u.getAge() <= 17) return "teen";
                    return "adult";
                }));
        
        //

        int totalAge = users.stream().map(User::getAge).reduce(0, Integer::sum);

        double avgAge = users.stream().mapToInt(User::getAge).average();

        users.stream().max(Comparator.comparingInt(User::getAge));

        users.stream().min(Comparator.comparingInt(User::getAge));
    }
}   
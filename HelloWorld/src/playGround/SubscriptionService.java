package playGround;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubscriptionService {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, List.of(1, 3)),
                new User(2, List.of(1, 3, 4, 5, 6)),
                new User(3, List.of(5, 3)),
                new User(4, List.of(1, 2, 3, 5)),
                new User(5, List.of(3, 5, 6)),
                new User(6, List.of(1, 3))
        );

        System.out.println("Users: " + users);

        SubscriptionService service = new SubscriptionService();

        Integer mostPopular = service.getMostPopularSubscriptionId(users);
        System.out.println("Most popular subscription ID: " + mostPopular);
        // Expected result: Most popular subscription ID: 3

        List<Integer> top3 = service.getTop3PopularSubscriptionIds(users);
        System.out.println("Top 3 popular subscription IDs: " + top3);
        // Expected result: Top 3 popular subscription IDs: [3, 1, 5]
    }

    public Integer getMostPopularSubscriptionId(List<User> users) {
        // TODO - implement it
        //users.stream().flatMap(user -> user.getSubscriptions().stream()).collect(Collectors.groupingBy(sub -> sub, Collectors.counting())).entrySet().stream();
       return users.stream()
                .flatMap(user -> user.getSubscriptions().stream())
                .collect(Collectors.groupingBy(sub -> sub, Collectors.counting())).entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey) // Extract the subscription ID
                .orElse(null);
    }

    public List<Integer> getTop3PopularSubscriptionIds(List<User> users) {
        // TODO - implement it
        return users.stream()
                .flatMap(user -> user.getSubscriptions().stream())
                .collect(Collectors.groupingBy(sub -> sub, Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()) // Sort descending by count
                .limit(3) // Get top 3 most popular subscriptions
                .map(Map.Entry::getKey) // Extract subscription IDs
                .collect(Collectors.toList()); // Convert to List<Integer>
    }
}

class User {
    private int id;
    private List<Integer> subscriptions;

    public User(int id, List<Integer> subscriptions) {
        this.id = id;
        this.subscriptions = subscriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Integer> subscriptions) {
        this.subscriptions = subscriptions;
    }
    // getters, setters, equals, hashCode
}
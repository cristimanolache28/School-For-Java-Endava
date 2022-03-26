package com.endava.part2.datasource;

import com.endava.part2.exception.UserNotFoundException;
import com.endava.part2.model.User;

import javax.swing.text.html.Option;
import java.security.InvalidParameterException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class UserDataSource {

    private List<User> users = new ArrayList<>();

    public UserDataSource(){
        users.add(new User(1, "John", "Wick", 35, "actor"));
        users.add(new User(2, "Jayce", "Lucas", 35, "driver"));
        users.add(new User(3, "Jack", "Spades", 18, "gamer"));
        users.add(new User(4, "Doug", "Rain", 55, "chef"));
        users.add(new User(5, "Lena", "Sunday", 12, "student"));
        users.add(new User(6, "Missy", "Cooper", 23, "actor"));
        users.add(new User(7, "Mark", "John", 17, "student"));
    }

    public UserDataSource(List<User> users){
        this.users = users;
    }

    public List<User> getAll(){
        return users;
    }

    public Optional<User> findById(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
    }

    public String getUsersNamesWithAgeGreaterThanThirty(){
        String text = users.stream()
                .filter(u -> u.getAge() > 30)
                .map(User::getFirstName)
                .collect(Collectors.joining(" - "));
        return text;
    }

    public int sumUpUserAgesWhereFirstNameStartsWithJ(){
        return users.stream()
                .filter(u -> u.getFirstName().startsWith("J"))
                .mapToInt(User::getAge)
                .reduce(0, Integer::sum);
    }

    public User getUserWithHighestAge(){
        return users.stream()
                .sorted((u1, u2) -> Integer.compare(u2.getAge(), u1.getAge()))
                .findFirst()
                .orElse(new User());
    }

    public User getUserWithHighestAge_V2(){
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .orElse(new User());
    }

    public List<User> mergeUserLists(List<User> l1, List<User> l2){
        return Stream.of(l1, l2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    // <---------- TO DO ---------->

    // Get the full names for all users
//    public List<User> getFullNames(){
    public void getFullNames(){
         users.stream()
                .filter(user -> user.getFirstName() != null)
                .filter(user -> user.getLastName() != null)
                .forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
    }

    public List<String> getFullNames2(){
        return users.stream()
                 .map(user -> user.getFirstName() + " " + user.getLastName())
                 .collect(toList());
    }


    // Get the job of the oldest user
    public String getJobOfTheOldestUser(){
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .map(User::getJob)
                .orElseThrow();
    }

    // Get user (distinct) jobs sorted alphabetically
    public Set<String> getAllUserJobsSorted(){
        Set<String> list = users.stream()
                .map(User::getJob)
                .collect(Collectors.toSet());
        return list;
    }

    // Get all users and change their job to 'unemployed' if their age is <= 18
    public List<User> getAllUsersAndChangeTheJobForYoungerOnes(){
        List<User> list = users.stream()
                .filter(u -> u.getAge() <= 18)
                .peek(u -> u.setJob("unemployed"))
                .collect(Collectors.toList( ));
        return list;
    }

    // Find user by first name - throw RuntimeException if not found
    public User findByFirstName(String firstName){
        return users.stream()
                .filter(u -> u.getFirstName().equals(firstName))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    // Check if all users are older than the specified age
    public boolean areAllUsersOlderThan(int age){
        // your code here - please try with allMatch/noneMatch
        return users.stream()
                .allMatch(u -> u.getAge() > age);
    }

    // Add a new user - if there is a user with the same id, don't add and throw a RuntimeException
    public void addUser(User newUser){
        // your code here - HINT: use ifPresent() method from Optional
        for (int i = 0; i < users.size(); i++) {
            if (newUser.getId() != users.get(i).getId()) {
                users.add(newUser);
                System.out.println("User was add in list");
                break;
            }
            else {
                throw new InvalidParameterException("Error");
            }
        }
    }

    public void addUser2(User newUser){
        // your code here - HINT: use ifPresent() method from Optional
            users.stream()
                    .filter(u -> u.getId() == newUser.getId())
                    .findAny()
                    .ifPresent(u -> {
                        throw new RuntimeException("User with id " + newUser.getId() + " already existats");
                    });
            users.add(newUser);
    }

    public void addUser3(User newUser) {
        if(users.stream().anyMatch(u -> u.getId() == newUser.getId())) {
            throw new RuntimeException("User with id " + newUser.getId() + "already exists");
        }
        users.add(newUser);
    }


    // For all students (user.job = "student"), change the job to "graduate" and add 5 years to their age
    public void changeAllStudentsJobsAndAges(){
        users.stream()
                .filter(user -> user.getJob().equals("student"))
                .peek(user -> user.setJob("graduate"))
                .peek(user -> user.setAge(user.getAge() + 5))
                .forEach(System.out::println);
    }

    // Count users that have the given Job
    public int countUsersHavingTheSpecifiedJob(String job){
        return (int) users.stream()
                .filter(user -> user.getJob() == job)
                .count();
    }

    // Get a map where the key is the user id and the value is the User object itself
    public Map<Integer, User> getMapOfUsers(){
        Map<Integer, User> list = new HashMap<>();
        users.stream()
                .filter(user -> list.size() < users.size() )
                .peek(user -> list.put(user.getId(), user))
                .collect(Collectors.toList());
        return list;
    }

    // Get a predicate for filtering by the given name - applies to both firstName and lastName
    public Predicate<User> getPredicateForFilteringByName(String name){
        return null;
    }

    // Get a comparator for User type - compare by age ascending, then by job alphabetically
    public Comparator<User> getUserComparator(){
        // your code here
        return null;
    }

    // Filter users using the given Predicate
    public List<User> filterUsers(Predicate<? super User> predicate){
        return users.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    // Sort users using the given Comparator
    public List<User> sortUsers(Comparator<? super User> comparator){
        return users.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}

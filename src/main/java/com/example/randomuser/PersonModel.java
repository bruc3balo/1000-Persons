package com.example.randomuser;

import java.util.List;

public class PersonModel {

    private List<Results> results;

    private static class Results {
        private Name name;
        private Location location;
        private String email;
        private DOB dob;

        public Results(Name name, Location location, String email, DOB dob) {
            this.name = name;
            this.location = location;
            this.email = email;
            this.dob = dob;
        }

        public Results() {
        }

        public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public DOB getDob() {
            return dob;
        }

        public void setDob(DOB dob) {
            this.dob = dob;
        }
    }
    private static class Name {

        private String title;
        private String first;
        private String last;

        public Name() {

        }

        public Name(String title,String first, String last) {
            this.title = title;
            this.first = first;
            this.last = last;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }
    private static class DOB {
        private String age;

        public DOB() {
        }

        public DOB(String age) {
            this.age = age;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
    private static class Location {
        private Street street;
        private String postcode;
        private String state;

        public Location(Street street, String postcode, String state) {
            this.street = street;
            this.postcode = postcode;
            this.state = state;
        }

        public Location() {
        }

        public Street getStreet() {
            return street;
        }

        public void setStreet(Street street) {
            this.street = street;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
    private static class Street {
        private String name;


        public Street() {
        }

        public Street(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public PersonModel() {

    }

    public PersonModel(List<Results> results) {
        this.results = results;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public Person getPerson() {
        Results res = results.get(0);
        String name = res.getName().getFirst() + " " + res.getName().getFirst() + " " + res.getName().getLast();
        String age = res.getDob().getAge();
        String address = res.getLocation().getStreet().getName() + " " + res.getLocation().getPostcode() + " " +res.getLocation().getState();
        return new Person(name, age, address, res.getEmail());
    }
}

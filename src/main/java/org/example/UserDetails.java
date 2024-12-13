package org.example;

public class UserDetails implements Comparable<UserDetails> {

    private String name;
    private Integer id;
    private Long age;

    public UserDetails(String name, Integer id, Long age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public int compareTo(UserDetails o) {
        return (this.id.intValue()<o.id.intValue()) ?-1:(this.id.intValue()==o.id.intValue() )? 0:1;
    }
}

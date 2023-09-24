public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        if (age < 0) {
            throw new InvalidAgeException("Wiek nie może być mniejszy niż 0");
        }
        if (age > 100){
            throw new InvalidAgeException("Wiek nie może być mniejszy niż 0");
        }
        this.age = age;
        this.name = name;
    }
    public Person(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0) {
            throw new InvalidAgeException("Wiek nie może być mniejszy niż 0");
        }
        if (age > 100){
            throw new InvalidAgeException("Wiek nie może być mniejszy niż 0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

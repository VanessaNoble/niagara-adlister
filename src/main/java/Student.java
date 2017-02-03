/**
 * Created by vanessamnoble on 2/1/17.
 */

import java.util.List;

public class Student {
    private String name;
    private int age;
    private float weight;
    private List languages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List getLanguages() {
        return languages;
    }

    public void setLanguages(List languages) {
        this.languages = languages;
    }

    public boolean knowsLanguages() {
        return !languages.isEmpty();
    }
}


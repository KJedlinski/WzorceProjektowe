package FluentBuilder;

/**
 * Created by krystian on 20.03.17.
 */
public class NewCat {
    private String name;
    private String owner;
    private int age;
    private String color;

    private NewCat(Builder builder){
        name = builder.name;
        owner = builder.owner;
        age = builder.age;
        color = builder.color;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public static class Builder{
        private String name;
        private String owner;
        private int age;
        private String color;

        public Builder(String name){
            this.name = name;
        }

        public Builder setOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public NewCat build() {
            return new NewCat(this);
        }
    }

}

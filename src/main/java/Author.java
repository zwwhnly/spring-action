public class Author {
    private String name;

    private int age;

    public Author() {
        System.out.println("This is Author constructor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("This is Author setName().");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("This is Author setAge().");
        this.age = age;
    }

    public void printAuthorInfo() {
        System.out.println("Name：" + this.name + ",Age：" + this.age);
    }
}

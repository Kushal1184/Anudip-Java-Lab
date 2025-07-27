class Lab6_2_Student {
    String name;
    int age;
    String department;


    Lab6_2_Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }


    Lab6_2_Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }


    Lab6_2_Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

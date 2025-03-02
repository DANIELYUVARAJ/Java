import java.util.Scanner;
class Biodata {
    String name;
    int age;
    String gender;
    String email;
    String phone;
    
    public Biodata(String name, int age, String gender, String email, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public void displayBiodata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args)
    {
        Scanner biod = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = biod.nextLine();
        System.out.println("Enter your Age: ");
        int age = biod.nextInt();
        System.out.println("Enter your Gender: ");
        String gender = biod.nextLine();
        System.out.println("Enter your Email: " );
        String email = biod.nextLine();
        System.out.println("Enter your Phone: " );
        String phone = biod.nextLine();
    }

    Biodata biod = new Biodata(name,age,gender,email,phone);
    biod.displayBiodata();

}


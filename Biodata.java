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
        Scanner biod = new biod(System.in);
        System.out.println("Enter your Name: ");
        String name = biod.nextline();
        System.out.println("Enter your Age: ");
        int age = biod.nextInt();
        System.out.println("Enter your Gender: ");
        String gender = biod.nextline();
        System.out.println("Enter your Email: " );
        String email = biod.nextline();
        System.out.println("Enter your Phone: " );
        String phone = biod.nextline();
    }

    Biodata biod = new Biodata(name,age,gende,email,phone);
    biod.displayBiodata();

}


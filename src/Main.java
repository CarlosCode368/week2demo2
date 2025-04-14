//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //What we have
        String fullName = "Carlos Sarabia Riestra";
        //how? Split!
        String[] nameList = fullName.split(" ");// " " space is the delimiter

        for (String n : nameList) {
            System.out.println(n);
        }
        String[] fruit = {"Apple", "Banana", "Cherry"};
        String text = String.join(" ", fruit);
        System.out.println(text);
    }
}



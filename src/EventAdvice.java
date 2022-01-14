import java.util.Scanner;

public class EventAdvice {
    public static void main(String[] args) {
         /*
        Kullanıcıdan havanın kaç derece olduğu bilgisini al.

        Sıcaklık 5 den küçükse "kayak" yapmayı öner.
        Sıcaklık 5 ile 15 derece arasında ise "Sinema"ya gitmeyi öner.
        Sıcaklık 10 ile 25 derece arasında ise "Piknik" yapmayı öner.
        Sıcaklık 25 den büyük ise "Yüzme" etkinliği öner.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bugün hava kaç derece?");
        int degree = input.nextInt();

        if (degree < 5) {
            System.out.print("Kayak yapmaya gidebilirsin.");
        } else if (degree < 15) {
            if (degree >= 10) {
                System.out.print("Sinemaya veya Pikniğe gidebilirsin.");
            } else {
                System.out.print("Sinemaya gidebilirsin.");
            }
        } else if (degree < 25) {
            System.out.print("Piknik yapabilirsin.");
        } else {
            System.out.print("Yüzmeye gidebilirsin.");
        }
    }
}

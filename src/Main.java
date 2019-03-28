public class Main {
    public static void main(String[] args) {
        Rocket rocket1;//створення об'єкта

        Research rocket2 = new Research("V3PO", 9.1, 3000,3,
                32,1, 13);//визначення об'єкта

        Satellite rocket3 = new Satellite("Explorer 1", 5.2, 5000,0,
                16,"21.01.19");//визначення об'єкта

        Research rocket4 = new Research("V3PO", 9.1, 3000,3,
                32,1, 13);//визначення об'єкта

        Satellite rocket5 = new Satellite("Explorer 1", 5.2, 5000,0,
                16,"21.01.19");//визначення об'єкта

        System.out.print("Перевірка роботи перевизначеного метода toString():"+"\n");
        System.out.println(rocket2);
        System.out.println(rocket3);
        System.out.println();
        System.out.print("Перевірка роботи перевизначеного метода equals() та hashCode():"+"\n");
        System.out.println(rocket2.equals(rocket2) +"\trocket2 = " + rocket2.hashCode() + "\trocket2 = " +rocket2.hashCode());
        System.out.println(rocket2.equals(rocket4) +"\trocket2 = " + rocket2.hashCode() + "\trocket4 = " +rocket4.hashCode());
        System.out.println(rocket3.equals(rocket4) +"\trocket3 = " + rocket3.hashCode() + "\trocket4 = " +rocket4.hashCode());
        System.out.println(rocket3.equals(rocket5) +"\trocket4 = " + rocket3.hashCode() + "\trocket5 = " +rocket5.hashCode());

        /*rocket1=rocket2;; //встановлення посилання на об'єкт rocket2
        rocket1.printInfo();//виклик методу printInfo() із класу Research

        System.out.println("------------------------------------------------------------");

        rocket1=rocket3;//встановлення посилання на об'єкт rocket2
        rocket1.printInfo();//виклик методу printInfo() із класу Satellite*/
    }
}

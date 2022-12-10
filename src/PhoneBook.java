package Dz.PhoneBook;
import java.util.Scanner;
public class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    private  Contacts [] contactsmas = new Contacts[10];

    public void  menu() {
        System.out.println(" 1 Добавить контакт");
        System.out.println(" 2 Показать список контактов");
        System.out.println(" 3 Удалить контакт");
        System.out.println(" 4 Поиск контакта по имени");
        System.out.println(" 5 Поиск контакта по номеру телефона");
        System.out.println(" 6 Очистить весь список контактов");
        String answ = scanner.nextLine();

        switch (answ){
            case "1"-> {
                addContacts();
            }
            case "2"->{
                printCont();
            }
            case "3"->{}
            case "4"->{}
            case "5"->{}
            case "6"->{}
        }
    }
    public void addContacts(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Введите имя");
        String contName = scanner.nextLine();
        System.out.println("Введите номер телефона");
        int contPhoneNum = scanner.nextInt();

        Contacts contacts = new Contacts(contName,contPhoneNum );
        for (int i = 0; i < contactsmas.length; i++) {
            if (contactsmas[i] == null){
                contactsmas[i]=contacts;
            }
        }menu();
    }
    public void printCont(){
        for (int i = 0; i < contactsmas.length; i++) {
            if(contactsmas[i]!=null);
            System.out.println(contactsmas[i].getName() + " " + contactsmas[i].getNumber());

        }
    }
}

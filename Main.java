import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        ArrayList <ArrayList<String>> pr = new ArrayList<>();

        ArrayList <ArrayList<String>> ch = new ArrayList<>();
        

        public ArrayList<String> FatherAndMother(ArrayList<String> pr, ArrayList <String> parents) {
            pr.add(parents);
            return pr;  
        }

        public ArrayList<String> SisterAndBrother(ArrayList<String> ch, ArrayList <String> childrens) {
            pr.add(childrens);
            return childrens;  
        }
        
        Human human_1 = new Human("Петров Василий Иванович 14.10.1957", false);
        human_1.setFather("Петров Иван Васильевич 16.02.1943");
        human_1.setMother("Петрова Лидия Ивановна 22.11.1944");
        ArrayList <String> parents_1 = new ArrayList<>(); 
        parents_1.add (human_1.getFather());
        parents_1.add (human_1.getMother());
        ArrayList <String> childrens_1 = new ArrayList<>(); 
        human_1.setChildren("Петрова Любовь Ивановна 16.03.1973", true);
        childrens_1.add (human_1.getChildren());
        human_1.setChildren("Петров Алексей Иванович 18.04.1977", false);
        childrens_1.add (human_1.getChildren());
        FatherAndMother(pr, parents_1);
        SisterAndBrother (ch, childrens_1);


        Human human_2 = new Human("Петров Иван Васильевич 16.02.1943", false);
        human_2.setFather("Петров Николай Савельевич 24.08.1920");
        human_2.setMother("Петрова Мария Степановна 19.07.1918");
        ArrayList <String> parents_2 = new ArrayList<>(); 
        parents_2.add (human_2.getFather());
        parents_2.add (human_2.getMother());
        ArrayList <String> childrens_2 = new ArrayList<>(); 
        human_2.setChildren("Петров Василий Иванович 14.10.1957", false);
        childrens_2.add (human_2.getChildren());
        FatherAndMother(pr, parents_2);
        SisterAndBrother (ch, childrens_2);


        Human human_3 = new Human("Петрова Лидия Ивановна 22.11.1944", true);
        human_3.setFather("Кузнецов Савелий Ильич 04.01.1923");
        human_3.setMother("Кузнецова Галина Михайловна 12.08.1923");
        ArrayList <String> parents_3 = new ArrayList<>(); 
        parents_3.add (human_3.getFather());
        parents_3.add (human_3.getMother());
        ArrayList <String> childrens_3 = new ArrayList<>(); 
        human_3.setChildren("Петров Василий Иванович 14.10.1957", false);
        childrens_3.add (human_3.getChildren());
        FatherAndMother(pr, parents_3);
        SisterAndBrother (ch, childrens_3);


        Human human_4 = new Human("Петрова Любовь Ивановна 16.03.1973", true);
        human_4.setFather("Петров Василий Иванович 14.10.1957");
        human_4.setMother("Петрова Марина Сергеевна 04.12.1959");
        ArrayList <String> parents_4 = new ArrayList<>(); 
        parents_4.add (human_4.getFather());
        parents_4.add (human_4.getMother());
        ArrayList <String> childrens_4 = new ArrayList<>(); 
        human_4.setChildren("Петров Максим Сергеевич 27.05.1998", false);
        childrens_4.add (human_4.getChildren());
        human_4.setChildren("Петров Руслан Сергеевич 08.04.2003", false);
        childrens_4.add (human_4.getChildren());
        FatherAndMother(pr, parents_4);
        SisterAndBrother (ch, childrens_4);


        Human human_5 = new Human("Петров Алексей Иванович 18.04.1977", false);
        human_5.setFather("Петров Василий Иванович 14.10.1957");
        human_5.setMother("Петрова Марина Сергеевна 04.12.1959");
        ArrayList <String> parents_5 = new ArrayList<>(); 
        parents_5.add (human_5.getFather());
        parents_5.add (human_5.getMother());
        ArrayList <String> childrens_5 = new ArrayList<>(); 
        human_5.setChildren("Петрова Виктория Алексеевна 29.01.2004", true);
        childrens_5.add (human_5.getChildren());
        human_5.setChildren("Петрова София Алексеевна 02.09.2007", true);
        childrens_5.add (human_5.getChildren());
        FatherAndMother(pr, parents_5);
        SisterAndBrother (ch, childrens_5);

        System.out.printf("Введите человека из древа: ");
        Scanner iScanner = new Scanner(System.in);
        String man = iScanner.nextLine();
        if (man == name){
            System.out.println(MethodtoString(name));
        } else{
            System.out.println("Такого человека в древе нет");
        }
        
        System.out.println("Если хотите узнать братьев и сестер человека, нажмите: 1\nМужа или жену человека: 2\nВыйти из древа: 3");
        Character number = scn.next().charAt(0);
        switch (number){
            case '1':
                for (var element: pr){
                    for (var elem: element){
                        if (man.getMother() == elem  || man.getFather() == elem){
                            System.out.println(elem.getName());
                        } else {
                            System.out.println("Братья и сестры не найдены");}
                    }                
                }
                break;
            case '2':
                for (var element: ch){
                    for (var elem: element){
                        if (man.getChildren() == elem){
                            System.out.println(human(elem.getChildren()));
                        } else {
                            System.out.println("нет");}
                    }                
                }
                break;
            case '3':
                break;
            default:
                System.out.print("Ввод некорректный");
                break;
        }
        iScanner.close(); 
    }
}



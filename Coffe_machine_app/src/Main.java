import java.util.Scanner;

public class Main {
    public String make_decision(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want?");
        System.out.println("1 - add cash \n2 - add ingredients \n3 - do coffe");
        String choice = scanner.nextLine();
        return choice;
    }

    public void add_client_cash(Client client){
        System.out.println("Give payment: ");
        Scanner scanner = new Scanner(System.in);
        Double payment = Double.valueOf(scanner.nextLine());
        client.add_cash(payment);
        client.show_cash();

    }

    public void add_ingredients(Ingredients ingredients){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to add?");
        String ingr = scanner.nextLine();
        if(ingr.equals("milk")){
            System.out.println("Milk balance: " + ingredients.add_milk());
        }
        else if(ingr.equals("essence")){
            System.out.println("Essence balance: " + ingredients.add_essence());
        }
        else if(ingr.equals("sugar")){
            System.out.println("Sugar balance: " + ingredients.add_sugar());
        }
        else if(ingr.equals("cookie")){
            System.out.println("Cookie balance: " + ingredients.add_cookie());
        }
        else if(ingr.equals("water")){
            System.out.println("Water balance: " + ingredients.add_water());
        }
    }

    public void make_coffe(Ingredients ingredients, Client client){
        System.out.println("What kind of coffee do you want?");
        System.out.println("1 - espresso \n2 - late \n3 - cappuccino \n");
        Scanner scanner = new Scanner(System.in);
        String kind_of_coffe = scanner.nextLine();

        Coffe coffe;
        if(kind_of_coffe.equals("1")){
            coffe = new Espresso(ingredients);
        }else if(kind_of_coffe.equals("2")){
            coffe = new Late(ingredients);
        }else{
            coffe = new Cappuccino(ingredients);
        }

        coffe.prepare();
        client.decrease_cash(coffe.getBill());
        System.out.println(coffe.info());
        client.show_cash();
        ingredients.show();
    }
    public static void main(String[] args) {

        Ingredients ingredients = new Ingredients();
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want?");
        System.out.println("1 - turn on the machine");
        System.out.println("2 - turn off the machine");
        String decision = scanner.nextLine();


        while (decision.equals("1")) {
            Main coffeMachine = new Main();
            String choice = coffeMachine.make_decision();
            if (choice.equals("1")) {
                coffeMachine.add_client_cash(client);
            } else if (choice.equals("2")) {
                coffeMachine.add_ingredients(ingredients);

            } else {
                coffeMachine.make_coffe(ingredients, client);
            }

            System.out.println("What do you want?");
            System.out.println("1 - turn on the machine");
            System.out.println("2 - turn off the machine");
            decision = scanner.nextLine();

        }

    }

}








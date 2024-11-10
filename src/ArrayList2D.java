
import java.util.ArrayList;

class ArrayList2D {
  public static void main(String[] args) {

    ArrayList<ArrayList<String>> groceryList = new ArrayList();

    ArrayList<String> bakeryList = new ArrayList();

    bakeryList.add("cake");
    bakeryList.add("donuts");
    bakeryList.add("breads");

    ArrayList<String> produceList = new ArrayList();

    produceList.add("apples");
    produceList.add("bananas");
    produceList.add("tomatoes");

    ArrayList<String> drinksList = new ArrayList();

    drinksList.add("soda");
    drinksList.add("coffee");
    drinksList.add("tea");

    groceryList.add(bakeryList); // bL=bakeryList;
    groceryList.add(produceList); // pL=produceList;
    groceryList.add(drinksList); // dL=drinksList;

    System.out.println(groceryList); // display all members inside groceryList i.e( bL,pL &dL );
    System.out.println(groceryList.get(0)); // display members of bL as it is the 1st member of groceryList;
    System.out.println(groceryList.get(0).get(0)); // display the 1st member of bL under groceryList;
  }

}
public class Main {
    public static void main(String[] args) {
        // Pizzas pizza=new PizzaBuilder(); // ERROR
        PizzaBuilder pizzaBuilder=new PizzaBuilder();

        Pizzas pizzaAcebollada=pizzaBuilder.setCebolla(true).build();
        System.out.println(pizzaAcebollada);

        Pizzas pizza4Quesos=pizzaBuilder
                .setExtraqueso(true)
                .setRelleno(true)
                .setSalsa(true)
                .build();
        System.out.println(pizza4Quesos);

        // rama colab
        PizzaBuilderColab pizzaBuilderColab=new PizzaBuilderColab();
        Pizzas pizzaRara=pizzaBuilderColab
                .setPinha(true)
                .setChampinhones(true)
                .build();
        System.out.println("pizzaRara = " + pizzaRara);

    }
}
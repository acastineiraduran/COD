/**
 * Nuevas opciones de la pizza
 *
 * @author acastineiraduran colab
 * @version 17/03/23
 */
public class PizzaBuilderColab {
    Pizzas _pizza;

    public PizzaBuilderColab(){
        _pizza=new Pizzas();
    }

    public Pizzas build(){
        return this._pizza;
    }

    public PizzaBuilderColab setChampinhones(boolean champinhones) {
        _pizza.setChampinhiones(champinhones);
        return this;
    }
    public PizzaBuilderColab setPinha(boolean pinha) {
        _pizza.setPinha(pinha);
        return this;
    }
}

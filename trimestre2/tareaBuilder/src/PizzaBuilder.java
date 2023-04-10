/**
 * Clase clave para implementacion en la app del diseño Builder
 *
 * @author acastineiraduran
 * @version 16/03/23
 */
public class PizzaBuilder {
    /**
     * variable para contener el valor de un objeto de tipo Pizzas
     */
    Pizzas _pizza;

    /**
     * constructor de la clase asgina a _pizza un objeto de la clase Pizzas
     */
    public PizzaBuilder(){
        _pizza=new Pizzas();
    }

    /**
     * Devuelve el objeto de la clase Pizzas que hemos creado en constructor de
     * esta clase (PizzaBuilder)
     *
     * @return un objeto de la clase Pizzas
     */
    public Pizzas build(){
        return this._pizza;
    }

    /**
     * Indica si el objeto _pizza llevará cebolla o no dependiende del parámetro
     * que introduzca el ususario
     *
     * @param cebolla booleano que indicará si la pizza llevará este ingrediente
     * @return el objeto de tipo Pizzas
     */
    public PizzaBuilder setCebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }

    public PizzaBuilder setExtraqueso(boolean extraqueso){
        _pizza.setExtraQueso(extraqueso);
        return this;
    }

    public PizzaBuilder setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }

    public PizzaBuilder setSalsa(boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }


}

public class Product {
private String name;
private int price;
private int stock;

public Product(String name, int price, int stock){
    if(!isValidName(name)){
        throw new IllegalArgumentException("el nombre no puede estar vacio");
    }
    if(!isValidPrice(price)){
        throw new IllegalArgumentException("el precio debe ser mayor que 0");
    }
    if(!isValidStock(stock)){
        throw new IllegalArgumentException("la cantidad no puede ser negativa");
    }
    this.name = name;
    this.price = price;
    this.stock = stock;
}

public String getname(){
    return name;
}
public int getprice(){
    return price;
}
public int stocl(){
    return stock;
}

public boolean setname(String name){
    if(isValidName(name)){
        this.name = name;
        return true;
    }
    return false;
}
public boolean setprice(int price){
    if(isValidPrice(price)){
        this.price = price;
        return true;
    }
    return false;
}
public boolean setstock(int stock){
    if(isValidStock(stock)){
        this.stock = stock;
        return true;
    }
    return false;
}

public boolean isValidName(String name){
    return name != null && !name.trim().isEmpty();
} 
public boolean isValidPrice(int price){
    return price>0;
}   
public boolean isValidStock(int stock){
    return stock>=0;
} 
}




//Una tienda necesita representar los productos disponibles para la venta. De cada producto interesa conocer su nombre 
//(name), precio (price) y cantidad disponible (stock).
//El nombre de un producto no puede estar vacío. Su precio debe ser mayor que cero y la cantidad disponible no puede ser negativa.
//La información del producto podrá modificarse cuando los nuevos valores cumplan las restricciones establecidas. Cuando una 
//modificación no pueda realizarse, el estado anterior del objeto deberá conservarse.
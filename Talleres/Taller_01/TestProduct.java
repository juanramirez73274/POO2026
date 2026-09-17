public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product("Teclado", 50, 10);
        System.out.println("Producto: " + product.getname() + " | Precio: $" + product.getprice() + " | Stock: " + product.stocl());

        System.out.println("\n--- Modificaciones Válidas ---");
        System.out.println("¿Nombre cambiado?: " + product.setname("Teclado Mecánico")); 
        System.out.println("¿Precio cambiado a $80?: " + product.setprice(80));           
        System.out.println("¿Stock cambiado a 25?: " + product.setstock(25));            
        
        System.out.println("\n--- Modificaciones Inválidas ---");
        System.out.println("¿Nombre vacío aceptado?: " + product.setname("   "));   
        System.out.println("¿Precio cero aceptado?: " + product.setprice(0));     
        System.out.println("¿Precio negativo aceptado?: " + product.setprice(-10));
        System.out.println("¿Stock negativo aceptado?: " + product.setstock(-5));

        System.out.println("\n--- Estado Final (Los cambios inválidos fueron ignorados) ---");
        System.out.println("Nombre: " + product.getname());
        System.out.println("Precio: $" + product.getprice());
        System.out.println("Stock: " + product.stocl());
    }
}
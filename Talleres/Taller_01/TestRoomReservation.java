public class TestRoomReservation {
    public static void main(String[] args) {
        
        RoomReservation reservation = new RoomReservation("Laura Restrepo", 204, 3, 100);
        System.out.println("Huésped: " + reservation.getguest() + " | Habitación: " + reservation.getroomNumber());
        System.out.println("Noches: " + reservation.getnumberOfNights() + " | Precio/Noche: $" + reservation.getpricePerNights());
        System.out.println("Costo Total Inicial: $" + reservation.getTotalCost()); 

        System.out.println("\n--- Modificaciones Válidas ---");
        System.out.println("¿Noches cambiadas a 5?: " + reservation.setNumberOfNights(5));
        System.out.println("Nuevo Costo Total: $" + reservation.getTotalCost());   

        System.out.println("¿Precio cambiado a $120?: " + reservation.setpricePerNights(120)); 
        System.out.println("Nuevo Costo Total: $" + reservation.getTotalCost());      

        System.out.println("¿Huésped cambiado?: " + reservation.setguest("Laura V. Restrepo")); 

        System.out.println("\n--- Modificaciones Inválidas ---");
        System.out.println("¿Noches en 0 aceptadas?: " + reservation.setNumberOfNights(0)); 
        System.out.println("¿Noches negativas aceptadas?: " + reservation.setNumberOfNights(-2));
        System.out.println("¿Precio en 0 aceptado?: " + reservation.setpricePerNights(0)); 
        System.out.println("¿Precio negativo aceptado?: " + reservation.setpricePerNights(-50)); 
        System.out.println("¿Huésped vacío aceptado?: " + reservation.setguest("   "));    

        System.out.println("\n--- Estado Final ---");
        System.out.println("Huésped: " + reservation.getguest());
        System.out.println("Noches conservadas: " + reservation.getnumberOfNights());
        System.out.println("Precio/Noche conservado: $" + reservation.getpricePerNights());
        System.out.println("Costo Total Final (Consistente): $" + reservation.getTotalCost());
    }
}
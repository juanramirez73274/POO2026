public class RoomReservation {
    private String guest;
    private int roomNumber;
    private int numberOfNights;
    private int pricePerNight;

    public RoomReservation(String guest, int roomNumber, int numberOfNights, int pricePerNight){
        if(!isValidGuest(guest)){
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        if(!isValidNights(numberOfNights)){
            throw new IllegalArgumentException("la cantidad de noches debe ser mayor a 0");
        }
        if(!isValidPrice(pricePerNight)){
            throw new IllegalArgumentException("el valor por noche deber ser positivo");
        }

        this.guest = guest;
        this.roomNumber = roomNumber;
        this.numberOfNights = numberOfNights;
        this.pricePerNight = pricePerNight;
    }
    public int getTotalCost(){
        return numberOfNights*pricePerNight;
    }

    public String getguest(){
        return guest;
    }
    public int getroomNumber(){
        return roomNumber;
    }
    public int getnumberOfNights(){
        return numberOfNights;
    }
    public int getpricePerNights(){
        return pricePerNight;
    }

    public boolean setguest(String guest){
        if(isValidGuest(guest)){
            this.guest = guest;
            return true;
        } 
        return false;
    }
    public void setroomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    public boolean setNumberOfNights(int numberOfNights){
        if(isValidNights(numberOfNights)){
            this.numberOfNights=numberOfNights;
            return true;
        }
        return false;
    }
    public boolean setpricePerNights(int pricePerNights){
        if(isValidPrice(pricePerNights)){
            this.pricePerNight = pricePerNights;
            return true;
        }
        return false;
    }

    public boolean isValidGuest(String guest){
        return guest != null && !guest.trim().isEmpty();
    }
    public boolean isValidNights(int numberOfNights){
        return numberOfNights > 0;
    }
    public boolean isValidPrice(int pricePerNight){
        return pricePerNight>0;
    }
}





//Un hotel necesita representar la reserva de una habitación. De cada reserva interesa conocer el nombre del huésped (guest),
// el número de habitación (room number), la cantidad de noches (number of nights) y el valor por noche (price per night).
//El nombre del huésped no puede estar vacío, la cantidad de noches debe ser mayor que cero y el valor por noche debe ser positivo.
//El costo total (total cost) de la reserva depende de la cantidad de noches y del valor establecido para cada noche.
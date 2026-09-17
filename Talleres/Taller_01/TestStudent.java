public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(101, "Carlos Pérez", 4.0, 3.0, 5.0);
        System.out.println("Estudiante: " + student.getName() + " | Promedio Inicial: " + student.getAverage());

        System.out.println("\n--- Cambios Válidos ---");
        System.out.println("¿Nombre cambiado?: " + student.setName("Carlos A. Pérez"));
        System.out.println("¿Nota 1 cambiada a 5.0?: " + student.setGrade1(5.0));
        System.out.println("Nuevo Promedio: " + student.getAverage()); 

        System.out.println("\n--- Cambios Inválidos ---");
        System.out.println("¿Nombre vacío aceptado?: " + student.setName("   "));  
        System.out.println("¿Nota 2 (6.0) aceptada?: " + student.setGrade2(6.0));  
        System.out.println("¿Nota 3 (-1.0) aceptada?: " + student.setGrade3(-1.0));

        System.out.println("\n--- Estado Final ---");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Promedio intacto: " + student.getAverage()); 
    }
}
public class Student {
    public static final double minGrade = 0.0;
    public static final double maxGrade = 5.0;
    private final int id;
    private String name;
    private double grade1; 
    private double grade2;
    private double grade3;

    public Student(int id, String name, double grade1, double grade2, double grade3){
        if(!isValidName(name)){
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        if(!isValidGrade(grade1)){
            throw new IllegalArgumentException("las notas deben estar entre 0.0 y 5.0");
        }
        if(!isValidGrade(grade2)){
            throw new IllegalArgumentException("las notas deben estar entre 0.0 y 5.0");
        }
        if(!isValidGrade(grade3)){
            throw new IllegalArgumentException("las notas deben estar entre 0.0 y 5.0");
        }
        this.id=id;
        this.name = name;
        this.grade1 = grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public double getGrade1() {
        return grade1;
    }
    public double getGrade2() {
        return grade2;
    }
    public double getGrade3() {
        return grade3;
    }
    public double getAverage(){
        return (grade1+grade2+grade3)/3;
    }

    public boolean setName(String name){
        if(isValidName(name)){
            this.name = name;
            return true;
        }
        return false;
    }
    public boolean setGrade1(double grade1){
        if(isValidGrade(grade1)){
            this.grade1=grade1;
            return true;
        }
        return false;
    }
    public boolean setGrade2(double grade2){
        if(isValidGrade(grade2)){
            this.grade2=grade2;
            return true;
        }
        return false;
    }
    public boolean setGrade3(double grade3){
        if(isValidGrade(grade3)){
            this.grade3=grade3;
            return true;
        }
        return false;
    }

    public boolean isValidGrade(double grade){
        return grade>= minGrade && grade<=maxGrade;
    }
    
    public boolean isValidName(String name){
        return name != null && !name.trim().isEmpty();
    }
}
//Una institución necesita representar un estudiante mediante su código (student ID), nombre (name) y las calificaciones (grades)
//obtenidas en tres evaluaciones.
//Cada calificación debe encontrarse entre 0.0 y 5.0.
//El código identifica al estudiante y no debe modificarse posteriormente. El nombre puede actualizarse siempre que el nuevo 
// nombre no esté vacío.
//Las calificaciones pueden modificarse individualmente, pero solamente deben aceptarse valores dentro del rango establecido.
//El sistema necesita conocer en cualquier momento el promedio académico (average) del estudiante a partir de sus calificaciones
//  actuales.
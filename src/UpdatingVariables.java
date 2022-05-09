public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //recibe bono por 200
        salary = salary + 200;
        System.out.println(salary);

        //descuento 50
        salary = salary - 50;
        System.out.println(salary);

        //dos horas extra 30 cada una y se gasta 40 en comida
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String nombre = "Alex";
        System.out.println(nombre);

        nombre = nombre + " Acevedo";
        System.out.println(nombre);

        nombre =  "Señor " + nombre;
        System.out.println(nombre);


    }
}

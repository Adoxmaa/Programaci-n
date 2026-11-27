import java.util.Scanner;

public class Tienda {
    /*
     * 23. Que gestione los datos de stock de una
     * tienda de comestibles, la información a
     * recoger será: nombre del producto, precio,
     * cantidad en stock. La tienda dispone de
     * 10 productos distintos. El programa debe
     * ser capaz de: (Puedes utilizar 3 arrays,
     * para nombre, stock y precio).
     * a. Dar de alta un producto nuevo.
     * b. Buscar un producto por su nombre.
     * c. Modificar el stock y precio de un producto dado.
     */
    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner(System.in);
        String[] nombre = new String[10];
        double[] precio = new double[10];
        int[] stock = new int[10];
        int posicion = 0;
        int i = 0;
        String search = "";
        int j = -1;
        do {
            System.out.println(
                    "Bienvenido al gestor de la tienda\n==================================\nEscoja una de las siguientes opciones indicando su número \n1) Dar de alta un producto nuevo.\n2) Buscar un producto por su nombre.\n3) Modificar el stock y precio de un producto dado\n0) Abandonar el programa");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al gestor de altas de productos nuevos");
                    System.out.println("Introduzca el nombre del nuevo producto deseado a registrar");
                    nombre[posicion] = input.nextLine();
                    input.nextLine();
                    System.out.println("Introduzca el precio de dicho producto");
                    precio[posicion] = input.nextDouble();
                    System.out.println("Introduzca el número de stock de dicho producto");
                    stock[posicion] = input.nextInt();
                    posicion++;
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del producto deseado a buscar");
                    search = input.nextLine();
                    input.nextLine();
                    for (i = 0; i < nombre.length; i++) {
                        if (search.equalsIgnoreCase(nombre[i])) {
                            j = i;
                        }
                    }
                    if(j==-1){
                        System.out.println("Producto no encontrado");
                    }
                    else{
                    System.out.println("Se ha encontraodo el producto " + nombre[j]);
                    System.out.println("El precio es: " + precio[j]);
                    System.out.println("El stock restante es de: " + stock[j]);}
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del producto deseado a buscar");
                    search = input.nextLine();
                    input.nextLine();
                    for (i = 0; i < nombre.length; i++) {
                        if (search.equalsIgnoreCase(nombre[i])) {
                            j = i;
                        }
                    }
                    System.out.println("Introduzca el nuevo precio del producto " + nombre[j]);
                    precio[j] = input.nextDouble();
                    System.out.println("Introduzca el nuevo stock del producto " + nombre[j]);
                    stock[j] = input.nextInt();
                    break;
                default:
                    System.out.println("Ha salido del programa");

            }
        } while (opcion != 0);
        input.close();
    }
}

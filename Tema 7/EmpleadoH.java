public class EmpleadoH {
    /*
     * 21. Un vector de 30 elementos contiene
     * los nombres de 30 empleados y otro de
     * similares características las horas
     * trabajadas por cada uno de ellos. Si la hora se
     * paga a 20 €., calcular e imprimir
     * lo que cobrará cada uno de ellos.
     */
    public static int i = 0;
    public static void Empleados() {
        String[] nom = { "Alejandro", "María", "Daniel", "Laura", "Pablo", "Carmen", "Javier", "Lucía", "Antonio",
                "Elena", "David", "Sara", "Miguel", "Paula", "Carlos", "Andrea", "Francisco", "Marta", "Sergio",
                "Natalia", "Álvaro", "Isabel", "Raúl", "Cristina", "Manuel", "Claudia", "Roberto", "Beatriz",
                "Fernando", "Patricia" };
        int[] horas = { 168, 140, 192, 120, 220, 152, 100, 160, 240, 128, 180, 80, 208, 144, 260, 112, 200, 160, 60,
                172, 232, 136, 188, 88, 248, 148, 40, 180, 216, 72 };
        
        for (i = 0; i < nom.length; i++) {
            System.out.println(nom[i] + " ha trabajado " + horas[i] + " h");
            System.out.println("Segun sus horas trabajas cobrara: " + horas[i] * 20);
            System.out.println("====================================================");
        }
    }


    public static void main(String[] args) {
        Empleados();
    }
}

package repasomodulos;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		mostrarInicio();
		menuPartes();
	}

		// =================
		// MENSAJE INICIAL
		// =================	
	public static void mostrarInicio() {
		System.out.println("Iniciando programa con ejercicios de repaso - Parcial 1.");
		System.out.println("Al seleccionar una parte del programa se ejecutarán los ejercicios correspondientes");
	}	
		// =================
		// MENÚ DE PARTES
		// =================
	public static void menuPartes() {
        while (true) {
        	System.out.println();
            System.out.println("===== MENÚ DE PARTES =====");
            System.out.println("1) Parte 1 - Ciclos y Operaciones Numéricas");
            System.out.println("2) Parte 2 - Condiciones y Divisibilidad");
            System.out.println("3) Parte 3 - Uso de switch");
            System.out.println("4) Parte 4 - Análisis Numérico");
            System.out.println("5) Parte 5 - Patrones y Transformaciones");
            System.out.println("0) Salir");

            int op = leerEntero("Seleccione una parte: ");

            switch (op) {
                case 1 -> ejecutarParte1();
                case 2 -> ejecutarParte2();
                case 3 -> ejecutarParte3();
                case 4 -> ejecutarParte4();
                case 5 -> ejecutarParte5();
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
	
		// ==================
		// MÉTODO UTILITARIO
		// ==================
	public static int leerEntero(String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				int num = Integer.parseInt(sc.nextLine());
				return num;
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Debe ingresar un número entero.");
        	}
		}
	}
	
		// ==========
		// PARTE 1
		// ==========
	public static void ejecutarParte1() {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		System.out.println("PARTE 1 FINALIZADA");
	}
	
		// EJERCICIO 1
    public static void ejercicio1() {
        System.out.println("\n--- Ejercicio 1: programa que lea un número n y muestre la suma de todos los números divisibles entre 4 desde 1 hasta n. ---");
        int n;
        do {
            n = leerEntero("Ingrese un número positivo: ");
            if (n < 1) System.out.println("Debe ser mayor que 0.");
        } while (n < 1);

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) suma += i;
        }
        System.out.println("Suma: " + suma);
    }
	
    	// EJERCICIO 2
    public static void ejercicio2() {
        System.out.println("\n--- Ejercicio 2: programa que muestre el factorial de un número. ---");
        int n;
        do {
            n = leerEntero("Ingrese un número >= 0 para factorial: ");
            if (n < 0) System.out.println("No se permiten negativos.");
        } while (n < 0);

        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }
    
		// EJERCICIO 3
    public static void ejercicio3() {
    	System.out.println("\n--- Ejercicio 3: programa que muestre cuantos son negativos, positivos y ceros de una cantidad de números ingresados. ---");
    	int n;
    	do {
    		n = leerEntero("¿Cuántos números ingresará?: ");
    		if (n <= 0) System.out.println("Debe ser mayor que 0.");
    	} while (n <= 0);

    	int pos = 0, neg = 0, ceros = 0;

    	for (int i = 0; i < n; i++) {
    		int num = leerEntero("Número " + (i + 1) + ": ");
    		if (num > 0) pos++;
    		else if (num < 0) neg++;
    		else ceros++;
    	}    
    
    	 System.out.println("Positivos: " + pos);
         System.out.println("Negativos: " + neg);
         System.out.println("Ceros: " + ceros);
     }
    
    	// EJERCICIO 4
    public static void ejercicio4() {
        System.out.println("\n--- Ejercicio 4: programa que lea un número n y muestre el promedio de los números pares entre 1 y n. ---");
        int n;
        do {
            n = leerEntero("Ingrese un número >= 2: ");
            if (n < 2) System.out.println("Debe ser al menos 2.");
        } while (n < 2);

        int suma = 0, cont = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
                cont++;
            }
        }

        if (cont == 0) System.out.println("No hay pares.");
        else System.out.println("Promedio pares: " + (suma / (double) cont));
    }
    
		// EJERCICIO 5
    public static void ejercicio5() {
    	System.out.println("\n--- Ejercicio 5: programa que muestre la suma de los dígitos de un número. ---");
    	int n = Math.abs(leerEntero("Ingrese un número: "));

    	int suma = 0;
    	while (n > 0) {
    		suma += n % 10;
    		n /= 10;
    	}
    	System.out.println("Suma de dígitos: " + suma);
    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

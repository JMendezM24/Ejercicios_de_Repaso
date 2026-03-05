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
    
    	// ==========
		// PARTE 2
		// ==========
    public static void ejecutarParte2() {
    	ejercicio6();
    	ejercicio7();
    	ejercicio8();
    	System.out.println("PARTE 2 FINALIZADA");
    }
    
    	// EJERCICIO 6
    public static void ejercicio6() {
        System.out.println("\n--- Ejercicio 6: programa que detrmine si un número es múltiplo de 7 o de 11. ---");
        int n = leerEntero("Ingrese un número: ");

        if (n % 7 == 0 || n % 11 == 0)
            System.out.println("Es múltiplo de 7 o de 11");
        else
            System.out.println("No es múltiplo de 7 ni de 11");
    }
    
    	// EJERCICIO 7
    public static void ejercicio7() {
        System.out.println("\n--- Ejercicio 7: un programa que lea un número n y muestre los números entre 1 y n que sean: divisibles entre 3 pero no entre 2. ---");
        int n;
        do {
            n = leerEntero("Ingrese un número >= 1: ");
            if (n < 1) System.out.println("Debe ser >= 1.");
        } while (n < 1);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();
    }
    
    	// EJERCICIO 8
    public static void ejercicio8() {
        System.out.println("\n--- Ejercicio 8: programa que le una hora en formato de 24h y muestre si es: mañana, tarde o noche. ---");
        int hora;

        	// Validación de rango 0-23
        do {
            hora = leerEntero("Ingrese la hora (0-23): ");
            if (hora < 0 || hora > 23)
                System.out.println("Hora inválida. Debe estar entre 0 y 23.");
        } while (hora < 0 || hora > 23);

        if (hora < 12) System.out.println("Mañana");
        else if (hora < 18) System.out.println("Tarde");
        else System.out.println("Noche");
    }
    
    	// =========
		// PARTE 3
		// =========
    public static void ejecutarParte3() {
    	ejercicio9();
    	ejercicio10();
    	System.out.println("PARTE 3 FINALIZADA");
    }
    
    	// EJERCICIO 9
    public static void ejercicio9() {
        System.out.println("\n--- Ejercicio 9: programa para convertir un número del 1 al 5 a número romano. ---");
        int n;
        do {
            n = leerEntero("Ingrese un número del 1 al 5: ");
            if (n < 1 || n > 5) System.out.println("Fuera de rango.");
        } while (n < 1 || n > 5);

        switch (n) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
        }
    }
    
    	// EJERCICIO 10
    public static void ejercicio10() {
        System.out.println("\n--- Ejercicio 10: programa que lea una opción(1-3) y dos números. ---");
        int op;
        do {
            op = leerEntero("Opción (1 sumar, 2 restar, 3 multiplicar): ");
            if (op < 1 || op > 3) System.out.println("Opción inválida.");
        } while (op < 1 || op > 3);

        int a = leerEntero("Número 1: ");
        int b = leerEntero("Número 2: ");

        switch (op) {
            case 1 -> System.out.println("Resultado: " + (a + b));
            case 2 -> System.out.println("Resultado: " + (a - b));
            case 3 -> System.out.println("Resultado: " + (a * b));
        }
    }
    
    // ==========
    // PARTE 4
    // ==========
    public static void ejecutarParte4() {
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14();
        ejercicio15();
        System.out.println("PARTE 4 FINALIZADA");
    }
    
    	// EJERCICIO 11
    public static void ejercicio11() {
        System.out.println("\n--- Ejercicio 11: programa que lea dos números y muestre: el mayor, el menor y la diferencia absoluta. ---");
        int a = leerEntero("Ingrese a: ");
        int b = leerEntero("Ingrese b: ");

        System.out.println("Mayor: " + Math.max(a, b));
        System.out.println("Menor: " + Math.min(a, b));
        System.out.println("Diferencia: " + Math.abs(a - b));
    }
    
    	// EJERCICIO 12
    public static void ejercicio12() {
        System.out.println("\n--- Ejercicio 12: programa que lea un número y muestre su tabla de división(1-10). ---");
        int n = leerEntero("Ingrese un número para tabla de división: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " / " + i + " = " + (n / (double) i));
        }
    }
    
    	// EJERCICIO 13
    public static void ejercicio13() {
        System.out.println("\n--- Ejercicio 13: programa que lea un número y muestre la cantidad de dígitos pares que contiene. ---");
        int n = Math.abs(leerEntero("Ingrese un número: "));

        int cont = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) cont++;
            n /= 10;
        }
        System.out.println("Dígitos pares: " + cont);
    }
    
    	// EJERCICIO 14
    public static void ejercicio14() {
        System.out.println("\n--- Ejercicio 14: programa que lea un número y determine si es triangular. ---");
        int n;
        do {
            n = leerEntero("Ingrese un número positivo: ");
            if (n <= 0) System.out.println("Debe ser positivo.");
        } while (n <= 0);

        int suma = 0;
        int k = 1;
        while (suma < n) {
            suma += k;
            k++;
        }

        if (suma == n) System.out.println("Es triangular");
        else System.out.println("No es triangular");
    }
    
    	// EJERCICIO 15
    public static void ejercicio15() {
        System.out.println("\n--- Ejercicio 15: programa que lea un número y luego n números, mostrar promedio de negativos si los hay y si no indicarlo. ---");
        int n;
        do {
            n = leerEntero("¿Cuántos números desea ingresar(se permiten negativos)?: ");
            if (n <= 0) System.out.println("Debe ser > 0.");
        } while (n <= 0);

        int suma = 0, cont = 0;
        for (int i = 0; i < n; i++) {
            int num = leerEntero("Número " + (i + 1) + ": ");
            if (num < 0) {
                suma += num;
                cont++;
            }
        }

        if (cont == 0) System.out.println("No hay negativos");
        else System.out.println("Promedio negativos: " + (suma / (double) cont));
    }
    
    
    
    
    
    
    
    
    
    
    
}
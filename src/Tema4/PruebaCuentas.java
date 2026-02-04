package Tema4;

import java.util.Scanner;

public class PruebaCuentas {

    static Scanner sc = new Scanner(System.in);
    static PersonaCuenta[] listadoPersonas = new PersonaCuenta[10];
    static int totalPersonas = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Crear nueva Persona");
            System.out.println("2. Crear nueva Cuenta y asignarla a una Persona");
            System.out.println("3. Mostrar datos de una persona");
            System.out.println("4. Recibir Abono (Nómina/Ingreso)");
            System.out.println("5. Pagar Recibo");
            System.out.println("6. Realizar Transferencia");
            System.out.println("7. Mostrar personas morosas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    mostrarDatosPersona();
                    break;
                case 4:
                    realizarAbono();
                    break;
                case 5:
                    realizarPago();
                    break;
                case 6:
                    realizarTransferencia();
                    break;
                case 7:
                    imprimirMorosos();
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa!");
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
    // Metodos extras

    // Crear Persona
    public static void crearPersona() {
        System.out.print("Introduce el DNI del titular: ");
        String dni = sc.nextLine();

        listadoPersonas[totalPersonas] = new PersonaCuenta(dni);
        totalPersonas++;
        System.out.println("Persona registrada con éxito.");
    }

    // Crear Cuenta
    public static void crearCuenta() {
        System.out.print("DNI del titular al que asignar la cuenta: ");
        String dni = sc.nextLine();
        PersonaCuenta p = buscarPersonaPorDni(dni);

        if (p != null) {
            System.out.print("Introduce el Número de Cuenta: ");
            String num = sc.nextLine();
            System.out.print("Introduce el Saldo Inicial: ");
            double saldo = sc.nextDouble();

            Cuenta nuevaCuenta = new Cuenta(num, saldo);

            p.anadirCuenta(nuevaCuenta);
        } else {
            System.out.println("No existe ninguna persona con ese DNI.");
        }
    }

    // Mostrar Datos
    public static void mostrarDatosPersona() {
        System.out.print("Introduce el DNI a consultar: ");
        String dni = sc.nextLine();
        PersonaCuenta p = buscarPersonaPorDni(dni);

        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    // Recibir Abono
    public static void realizarAbono() {
        System.out.print("DNI del titular: ");
        String dni = sc.nextLine();
        PersonaCuenta p = buscarPersonaPorDni(dni);

        if (p != null) {
            System.out.print("Número de cuenta para el abono: ");
            String numCuenta = sc.nextLine();

            Cuenta c = buscarCuentaDePersona(p, numCuenta);

            if (c != null) {
                System.out.print("Cantidad a abonar: ");
                double cantidad = sc.nextDouble();
                c.recibirAbono(cantidad);
                System.out.println("Operación finalizada. Saldo actual: " + c.getSaldo());
            } else {
                System.out.println("Esa persona no tiene esa cuenta.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    // Pagar Recibo
    public static void realizarPago() {
        System.out.print("DNI del titular: ");
        String dni = sc.nextLine();
        PersonaCuenta p = buscarPersonaPorDni(dni);

        if (p != null) {
            System.out.print("Número de cuenta para el cargo: ");
            String numCuenta = sc.nextLine();
            Cuenta c = buscarCuentaDePersona(p, numCuenta);

            if (c != null) {
                System.out.print("Importe del recibo: ");
                double cantidad = sc.nextDouble();
                c.pagarRecibo(cantidad);
                System.out.println("Saldo actual tras operación: " + c.getSaldo());
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    // Transferencia
    // Este método lo ha hecho chaty porque no me salía a mi
    public static void realizarTransferencia() {
        System.out.println("--- ORIGEN ---");
        System.out.print("DNI Emisor: ");
        PersonaCuenta pOrigen = buscarPersonaPorDni(sc.nextLine());
        if (pOrigen == null) { System.out.println("Emisor no encontrado."); return; }

        System.out.print("Cuenta Origen: ");
        Cuenta cOrigen = buscarCuentaDePersona(pOrigen, sc.nextLine());
        if (cOrigen == null) { System.out.println("Cuenta de origen no encontrada."); return; }

        System.out.println("--- DESTINO ---");
        System.out.print("DNI Receptor: ");
        PersonaCuenta pDestino = buscarPersonaPorDni(sc.nextLine());
        if (pDestino == null) { System.out.println("Receptor no encontrado."); return; }

        System.out.print("Cuenta Destino: ");
        Cuenta cDestino = buscarCuentaDePersona(pDestino, sc.nextLine());
        if (cDestino == null) { System.out.println("Cuenta de destino no encontrada."); return; }

        System.out.print("Cantidad a transferir: ");
        double cantidad = sc.nextDouble();

        if (cOrigen.getSaldo() >= cantidad) {
            cOrigen.pagarRecibo(cantidad);
            cDestino.recibirAbono(cantidad);
            System.out.println("Transferencia realizada con éxito.");
        } else {
            System.out.println("ERROR: Saldo insuficiente en la cuenta origen.");
        }
    }

    // Imprimir Morosos
    public static void imprimirMorosos() {
        System.out.println("Listado de personas con alguna cuenta en negativo:");
        boolean hayMorosos = false;

        for (int i = 0; i < totalPersonas; i++) {
            if (listadoPersonas[i].esMorosa()) {
                System.out.println("- " + listadoPersonas[i].toString());
                hayMorosos = true;
            }
        }

        if (!hayMorosos) {
            System.out.println("No hay morosos en el sistema (O el sistema no permite saldos negativos).");
        }
    }

    public static PersonaCuenta buscarPersonaPorDni(String dni) {
        for (int i = 0; i < totalPersonas; i++) {
            if (listadoPersonas[i].getDni().equalsIgnoreCase(dni)) {
                return listadoPersonas[i];
            }
        }
        return null;
    }

    public static Cuenta buscarCuentaDePersona(PersonaCuenta p, String numCuenta) {
        Cuenta[] susCuentas = p.getCuentas();
        for (int i = 0; i < p.getContadorCuentas(); i++) {
            if (susCuentas[i].getNumeroCuenta().equals(numCuenta)) {
                return susCuentas[i];
            }
        }
        return null;
    }
}
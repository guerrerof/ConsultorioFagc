/**
 * 
 */
package co.com.consultorio;

import java.util.Scanner;

/**
 * @author GUERRERO
 * @version 1.0
 * @date 22/02/2020
 */
public class Principal {

	/**
	 * 
	 */
	public Principal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Usuario datosUsuario = new Usuario();
		String nombre, apellido, genero, estudios, fecha, hora;
		int edad, celular, opc;
		
		System.out.println("**********BIENVENIDO AL CONSULTORIO**********\n");
		System.out.println("A continuación ingrese sus datos personales para la consulta");
		System.out.print("Ingrese su nombre: ");
		nombre = sc.next();
		datosUsuario.setNombre(nombre);
		System.out.print("Ingrese su apellido: ");
		apellido = sc.next();
		datosUsuario.setApellido(apellido);
		System.out.print("Ingrese su genero: ");
		genero = sc.next();
		datosUsuario.setGenero(genero);
		System.out.print("Cuál es su nivel de estudios?: ");
		estudios = sc.next();
		datosUsuario.setNivelEstudios(estudios);
		System.out.print("Ingrese su edad: ");
		edad = sc.nextInt();
		datosUsuario.setEdad(edad);
		System.out.print("Ingrese su número de celular: ");
		celular = sc.nextInt();		
		datosUsuario.setCelular(celular);
		System.out.println();
		
		Profesional datosProfesional = new Profesional();
		
			System.out.println("**********MENU DE CITAS**********\n");	
			System.out.println("1.---> Ginecología ");
			System.out.println("2.---> Medicina General ");
			System.out.println("3.---> Pediatria ");
			System.out.println("4.---> Odontología ");
			System.out.println("5.---> SALIR ");
			System.out.print("Digite el número del tipo de cita deseada: ");	
			opc = sc.nextInt();	
					
		switch (opc) {
		case 1:
			System.out.println("Seleccionaste Ginecología ");
			datosProfesional.setNombre("Tatiana");
			datosProfesional.setApellido("Zapata");
			datosProfesional.setArea("Ginecología");
			datosProfesional.setNumeroConsultorio(102);
			System.out.print("Ingrese la fecha de la cita, DIA/MES: ");
			fecha = sc.next();
			System.out.print("Ingrese la hora de la cita, especifique AM o PM: ");
			hora = sc.next();
			detalleCita();
			System.out.println(datosUsuario.getNombre()+" "+datosUsuario.getApellido()+" la cita fue asignada con el profesional en "
			+datosProfesional.getArea()+" "+datosProfesional.getNombre()+" "+datosProfesional.getApellido()+"\nen el consultorio "
			+datosProfesional.getNumeroConsultorio()+" para la fecha "+fecha+"/2020"+" a las "+hora+", se recomienda llegar con 15 minutos de anticipación.\n" );		
			break;
        case 2:
        	System.out.println("Seleccionaste Medicina General ");
        	datosProfesional.setNombre("Cristian");
			datosProfesional.setApellido("Gutierrez");
			datosProfesional.setArea("Medicina General");
			datosProfesional.setNumeroConsultorio(202);
			System.out.print("Ingrese la fecha de la cita, DIA/MES: ");
			fecha = sc.next();
			System.out.print("Ingrese la hora de la cita, especifique AM o PM: ");
			hora = sc.next();
			detalleCita();
			System.out.println(datosUsuario.getNombre()+" "+datosUsuario.getApellido()+" la cita fue asignada con el profesional en "
			+datosProfesional.getArea()+" "+datosProfesional.getNombre()+" "+datosProfesional.getApellido()+"\nen el consultorio "
			+datosProfesional.getNumeroConsultorio()+" para la fecha "+fecha+"/2020"+" a las "+hora+", se recomienda llegar con 15 minutos de anticipación.\n" );
			break;
        case 3:
        	System.out.println("Seleccionaste Pediatria ");
        	datosProfesional.setNombre("Fredy");
			datosProfesional.setApellido("Barrera");
			datosProfesional.setArea("Pediatria");
			datosProfesional.setNumeroConsultorio(302);
			System.out.print("Ingrese la fecha de la cita, DIA/MES: ");
			fecha = sc.next();
			System.out.print("Ingrese la hora de la cita, especifique AM o PM: ");
			hora = sc.next();
			detalleCita();
			System.out.println(datosUsuario.getNombre()+" "+datosUsuario.getApellido()+" la cita fue asignada con el profesional en "
			+datosProfesional.getArea()+" "+datosProfesional.getNombre()+" "+datosProfesional.getApellido()+"\nen el consultorio "
			+datosProfesional.getNumeroConsultorio()+" para la fecha "+fecha+"/2020"+" a las "+hora+", se recomienda llegar con 15 minutos de anticipación.\n" );
			break;
        case 4:
        	System.out.println("Seleccionaste Odontología ");
        	datosProfesional.setNombre("Monica");
			datosProfesional.setApellido("Ramirez");
			datosProfesional.setArea("Odontología");
			datosProfesional.setNumeroConsultorio(402);
			System.out.print("Ingrese la fecha de la cita, DIA/MES: ");
			fecha = sc.next();
			System.out.print("Ingrese la hora de la cita, especifique AM o PM: ");
			hora = sc.next();
			detalleCita();
			System.out.println(datosUsuario.getNombre()+" "+datosUsuario.getApellido()+" la cita fue asignada con el profesional en "
			+datosProfesional.getArea()+" "+datosProfesional.getNombre()+" "+datosProfesional.getApellido()+"\nen el consultorio "
			+datosProfesional.getNumeroConsultorio()+" para la fecha "+fecha+"/2020"+" a las "+hora+", se recomienda llegar con 15 minutos de anticipación.\n" );
        	break;
        case 5:
        	System.out.println("Seleccionaste SALIR  Buelva Pronto");
			break;

		default: System.out.println("Ingrese un número del 1 al 4 para selecionar la cita deseada o digite 0 para salir");
			break;
		}
		
	}
	
	public static void detalleCita() {
				System.out.println("");
				System.out.println("----------DETALLE DE LA CITA----------");
				System.out.println("");
				}
}

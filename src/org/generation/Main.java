package org.generation;

import org.generation.classes.Employee;
import org.generation.classes.SalesRep;

public class Main {

	public static void main(String[] args) {
		
		//Creacion de empleados
		Employee pablo = new Employee("Pablo","Feuntes", 101,
										45, 5400, 14, 15000.50, 15);
		
		Employee marcos = new Employee("Marcos","Perez", 102,
				55, 7200, 22, 22000.50, 25);
		
		Employee maria = new Employee("Maria","Garcia", 103,
				35, 3600, 5, 12000.0, 10);
		
		//Tiempo de jubilacion
		System.out.println(pablo.timeToRetirement());
		System.out.println(marcos.timeToRetirement());
		System.out.println(maria.timeToRetirement());
		
		//Tiempo restante de vacaciones
		System.out.println(pablo.vacationTimeLeft());
		System.out.println(marcos.vacationTimeLeft());
		System.out.println(maria.vacationTimeLeft());
		
		//Bonus por empleado
		System.out.println(pablo.calculateBonus());
		System.out.println(marcos.calculateBonus());
		System.out.println(maria.calculateBonus());
		
		//Creacion de representante de ventas
		SalesRep pablo1 = new SalesRep("Pablo","Feuntes", 101,
										45, 5400, 14, 15000.50, 15, 60000);
		
		SalesRep marcos2 = new SalesRep("Marcos","Perez", 102,
				55, 7200, 22, 22000.50, 25,120000);
		
		SalesRep maria3 = new SalesRep("Maria","Garcia", 103,
				35, 3600, 5, 12000.0, 10, 6700);
		
		//Comisiones
		System.out.println(pablo1.calculateComission());
		System.out.println(marcos2.calculateComission());
		System.out.println(maria3.calculateComission());

	}

}

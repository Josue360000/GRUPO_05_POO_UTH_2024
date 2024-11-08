package com.mycompany.tarea_grupo_05_persona_poo;

// Clase abstracta Persona
abstract class Persona {
private String nombre;
private int edad;
private double sueldo;
private char sexo;

// Constructor de Persona
public Persona(String nombre, int edad, double sueldo, char sexo) {
this.nombre = nombre;
this.edad = edad;
this.sueldo = sueldo;
this.sexo = sexo;
}

// Metodos getter y setter
public String getNombre() {
return nombre;
}

public void setNombre(String nombre) {
this.nombre = nombre;
}

public int getEdad() {
return edad;
}

public void setEdad(int edad) {
this.edad = edad;
}

public double getSueldo() {
return sueldo;
}

public void setSueldo(double sueldo) {
this.sueldo = sueldo;
}

public char getSexo() {
return sexo;
}

public void setSexo(char sexo) {
this.sexo = sexo;
}

// Metodo abstracto que se implementara en las subclases
public abstract void mostrarInfo();
}

// Subclase Doctor
class Doctor extends Persona {
private String especialidad;

public Doctor(String nombre, int edad, double sueldo, char sexo, String especialidad) {
super(nombre, edad, sueldo, sexo);
this.especialidad = especialidad;
}

public String getEspecialidad() {
return especialidad;
}

public void setEspecialidad(String especialidad) {
this.especialidad = especialidad;
}

// Implementacion del metodo abstracto
@Override
public void mostrarInfo() {
System.out.println("Doctor: " + getNombre() + ", Edad: " + getEdad() +
", Sueldo: " + getSueldo() + ", Sexo: " + getSexo() +
", Especialidad: " + especialidad);
}
}

// Subclase Deportista Bryan Vasquez
class Deportista extends Persona {
private String deporte;

public Deportista(String nombre, int edad, double sueldo, char sexo, String deporte) {
super(nombre, edad, sueldo, sexo);
this.deporte = deporte;
}

public String getDeporte() {
return deporte;
}

public void setDeporte(String deporte) {
this.deporte = deporte;
}

// Implementacion del metodo abstracto
@Override
public void mostrarInfo() {
System.out.println("Deportista: " + getNombre() + ", Edad: " + getEdad() +
", Sueldo: " + getSueldo() + ", Sexo: " + getSexo() +
", Deporte: " + deporte);
}
}


// Clase principal para probar el codigo
public class TAREA_GRUPO_05_PERSONA_POO {
public static void main(String[] args) {
Doctor doctor = new Doctor("Juan Perez", 40, 5000.0, 'M', "Cardiologia");
Deportista deportista = new Deportista("Ana Lopez", 25, 3000.0, 'F', "Futbol");

doctor.mostrarInfo();     // Polimorfismo en accion
deportista.mostrarInfo(); // Polimorfismo en accion      
}
}



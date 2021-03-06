/*
 * Copyright (C) 2014 Hector Espert Pardo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package objetos;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    private String nombre;
    
    private Test nota;
    
    
    public Alumno() {
        
        nombre = "";
        
        nota = null;
        
    }
    
    public Alumno(String nombre) {
        
        this.nombre = nombre;
        
        nota = null;
        
    }

    public Alumno(String Nombre, Test nota) {
        this.nombre = Nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public Test getNota() {
        return nota;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setNota(Test nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
     
    
    
}

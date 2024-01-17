package ejerciciosBasicos.ejercicio5;

public class Medico {
    // Atributos
    private String nombre, apellidos, numeroDocumentoIdentidad, especialidad;
    private int edad;
    private boolean casado;

    // Getters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getNumeroDocumentoIdentidad() { return numeroDocumentoIdentidad; }
    public String getEspecialidad() { return especialidad; }
    public int getEdad() { return edad; }
    public boolean isCasado() { return casado; }

    // Setters que imprimen el nombre del médico que recibe el cambio
    public void setNombre(String nombre) {

        System.out.println("Ha cambiado el nombre  del / de la médico " + this.nombre);
        this.nombre = nombre;
        System.out.println("Su nuevo nombre es " + nombre);
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
        System.out.println("Han cambiado los apellidos  del / de la médico " +
                           this.nombre + ", sus apellidos son " + this.apellidos);
    }
    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        System.out.println("Ha cambiado el documento de identidad  del / de la médico " +
                           this.nombre + ", su nuevo numero de documento es " +
                           this.numeroDocumentoIdentidad);
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
        System.out.println("Ha cambiado la especialidad  del / de la médico " +
                           this.nombre + ", su nueva especialidad es " +
                           this.especialidad);
    }
    public void setEdad(int edad) {
        this.edad = edad;
        System.out.println("Ha cambiado la edad  del / de la médico " + this.nombre +
                           ", su edad actual es " + this.edad);
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
        System.out.println("Ha cambiado el estado de casado  del / de la médico " +
                           this.nombre + ", su estado actual es " + this.casado);
    }

    /**
     * Constructor para valores por defecto
     **/
    public Medico(String nombre, String apellidos, String numeroDocumentoIdentidad,
                  String especialidad, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.especialidad = especialidad;
        this.edad = edad;
        this.casado = casado;
    }

    /**
     * Método para sacar los años que le quedan al médico para que
     * su edad sea múltiplo de 5
     */
    public void calculoParaMultiploEdad() {
        int multiploEdad = (this.edad / 5);
        if (this.edad % 5 == 0) {
            multiploEdad = (this.edad / 5);
            // System.out.println(multiploEdad);
        } else {
            multiploEdad = (int)((this.edad / 5) + 1);
            // System.out.println(multiploEdad);
        }
        int diffEdad = (multiploEdad * 5) - this.edad;
        if (diffEdad == 0) {
            System.out.println("El médico de nombre " + this.nombre +
                               " ya tiene una edad múltiplo de 5");
        } else {
            System.out.println("El médico de nombre " + this.nombre +
                               " tendrá una edad múltiplo de 5 en " + diffEdad +
                               " año(s)");
        }
    }
}

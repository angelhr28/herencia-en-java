class Persona{
    int edad        = 0;
    String nombre   = "";
    String apellido = "";
    String sexo     = "";

    public String getApellido() {
      return apellido;
    }

    public int getEdad() {
      return edad;
    }

    public String getNombre() {
      return nombre;
    }

    public String getSexo() {
      return sexo;
    }

    public void setApellido(String apellido) {
      this.apellido = apellido;
    }

    public void setEdad(int edad) {
      this.edad = edad;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public void setSexo(String sexo) {
      this.sexo = sexo;
    }
}

class Alumno extends Persona {
    String codAlumno = "";

    public String getCodAlumno() {
      return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
      this.codAlumno = codAlumno;
    }
}


class Main {
    public static void main(String[] args) {
        Alumno al = new Alumno();
        al.setNombre("Newton Angel");
        al.setApellido("Huamanñahui Robles");
        al.setEdad(21);
        al.setSexo("Masculino");
        al.setCodAlumno("2016200111");

        System. out. println(
          "Nombre: "   + al.getNombre()    + "\n" + 
          "Apellido: " + al.getApellido()  + "\n" +
          "Codigo: "   + al.getCodAlumno() + "\n" +
          "Edad: "     + al.getEdad()      + "\n" +
          "sexo: "     + al.getSexo()  
        );
    }
}
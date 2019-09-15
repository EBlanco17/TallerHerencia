
package tallerherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author eblanco
 */
public class Estudiante extends Persona{
    public Estudiante() { }
    public Estudiante(String carnet, double promedioNotas, int numeroMaterias) {
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public int getNumeroMaterias() {
        return numeroMaterias;
    }
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
  
    
    public double leerNotasEstudiante(int numeroMaterias){
        double suma = 0.0;
        int nota;
        numeroMaterias=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de materias"));
        for(int i=1; i<= numeroMaterias; i++){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota"+" "+i+" "+"de"+" "+numeroMaterias+":"));
            suma = suma + nota;
            }
        promedioNotas= suma /numeroMaterias;
         
        return (promedioNotas);
        
    }
      public double calcularPromedio(double suma){
        promedioNotas= suma /numeroMaterias;
        return (promedioNotas);
    }
    
    public Estudiante ingresarDatosEstudiante(){
    Estudiante nuevoEstudiante=new Estudiante();
        
    carnet = leerDatoTipoCadena("Ingrese el código del estudiante: ");
    nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
    apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        
    nuevoEstudiante.setNombre(nombre);
    nuevoEstudiante.setApellido(apellido);
    nuevoEstudiante.setCarnet(carnet);
   
            return (nuevoEstudiante);
    }
    public void imprimirReporteNotasEstudiante(){
    JOptionPane.showMessageDialog(null,"El estudiante identificado con carnet : "+carnet+"\n"+" Nombre: "+nombre+" "+apellido+"\n"
    +"Promedio de notas: "+leerNotasEstudiante((int)promedioNotas));
    }
    
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
}

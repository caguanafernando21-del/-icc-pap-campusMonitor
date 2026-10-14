package icc.pap.models;

public class Lectura<T> {
        private String idSensor;
        private T valor;
        private String Unidad;


       public Lectura(String idSensor, T valor, String unidad) {
            this.idSensor = idSensor;
            this.valor = valor;
            Unidad = unidad;
        }

        public String getIdSensor() {
            return idSensor;
        }
        public T getValor() {
            return valor;
        }
        public String getUnidad() {
            return Unidad;
        }

       

        


}
